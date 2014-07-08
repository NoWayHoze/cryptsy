(ns nowayhoze.cryptsy
  (:require
    [clj-http.client :as client]
    [pandect.core :as sha]
    [nowayhoze.cryptsy-markets :as m]))




(def my-key (atom "5db2ba7e87c451ea028f9f7937e1af36959cbe98"))
(def secret (atom "f3e63777027b17fa81f4a4aa486c98a0314827ad78b2ea961dafefd7ed98a4febd21add148248ff6"))
(defn set-key[the-key] (reset! my-key the-key ))
(defn set-secret[the-secret] (reset! secret the-secret))


(defn get-nonce []
  (System/currentTimeMillis))

(def saldo-url "https://api.cryptsy.com/api?getinfo" )

(sha/sha512-hmac(str "nonce=" (get-nonce)) @secret)

(defn vals-to-float[the-map]
  (into {}
    (for[k (keys the-map)]
        { k (Float/parseFloat (the-map k)) })))


(defn get-saldo[]
(let [nonce (get-nonce)
      the-reply (client/post "https://api.cryptsy.com/api" {:headers { "Key" @my-key "Sign" (sha/sha512-hmac (str "method=getinfo&" "nonce=" nonce) @secret) }
                                                    :form-params { :method "getinfo"
                                                                   :nonce nonce}
                                                    :as :json})
      the-body (:body the-reply)
      the-ret (:return the-body)
      available (into {}
                    (let[ bal (:balances_available the-ret)]
                      (for[k (keys bal)]
                        { k (Float/parseFloat (bal k)) })))]
  (reverse (sort-by val  available ))))




;:LTC/USD  :BTC/USD

(def foo  (m/markets :LTC-USD))

(str foo)

(:marketid foo)

(def foo3 (let [bar (:LTC-USD m/markets )
      foo2 (:marketid bar)]
  foo2))

(str foo3)




(defn get-markets[market-vector]
  (into {}
    (for[market-name market-vector]
      (let [
            market-id (:marketid (m/markets market-name))
            secondary-id (:primarycode (m/markets market-name))
            the-url (str "http://pubapi.cryptsy.com/api.php?method=singlemarketdata&marketid=" market-id)
            market-data (client/get the-url
                {:as :json} ) ]
            { market-name (let
                          [ md (-> market-data :body :return :markets)
                            md1 (take 5 (map vals-to-float (-> md vals first :sellorders )))
                            md2 (take 5 (map vals-to-float (-> md vals first :buyorders )))
                            ;md2 ( md1 (keyword secondary-id))
                            ]
                            {:buy-ord md2 :sell-ord md1 })}))))

(def foo (get-markets [:LTC-BTC]))

foo

(take 10 (-> foo :LTC-BTC :sell-ord ))


(def market_id (:marketid (:DRK-BTC  m/markets)))

(str "http://pubapi.cryptsy.com/api.php?method=singlemarketdata&marketid=" 1)

(def all-markets "http://pubapi.cryptsy.com/api.php?method=marketdatav2")


(def my-url (str "http://pubapi.cryptsy.com/api.php?method=singlemarketdata&marketid="
                 1))

(let [m-data (client/get all-markets
                {:as :json}) ]

  m-data)
;https://api.cryptsy.com/api
  ;(-> m-data :body :return :markets vals first :label))

