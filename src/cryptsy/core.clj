(ns cryptsy.core
  (:require
    [clj-http.client :as client]
    [pandect.core :as sha]
    [cryptsy.markets :as m]))



(defn set-key[the-key] (reset! my-key the-key ))
(defn set-secret[the-secret] (reset! secret the-secret))


(defn get-nonce []
  (System/currentTimeMillis))

(def saldo-url "https://api.cryptsy.com/api?getinfo" )

(sha/sha512-hmac(str "nonce=" (get-nonce)) @secret)

(let [nonce (get-nonce)
      the-reply (client/post "https://api.cryptsy.com/api" {:headers { "Key" @my-key "Sign" (sha/sha512-hmac (str "method=getinfo&" "nonce=" nonce) @secret) }
                                                    :form-params { :method "getinfo"
                                                                   :nonce nonce}
                                                    :as :json})
      the-body (:body the-reply)
      the-ret (:return the-body)
      available (:balances_available the-ret )]
  (sort-by val  available ))



;:LTC/USD  :BTC/USD

(def foo  (m/markets :LTC-USD))

(str foo)

(:marketid foo)

(def foo3 (let [bar (:LTC-USD m/markets )
      foo2 (:marketid bar)]
  foo2))

(str foo3)

(def my-id (->> m/markets :LTC-USD :marketid))
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               {:label "AC/BTC", :secondarycode "BTC", :primarycode "AC", :marketid "199"})
(str my-id)


(def market_id (:marketid (:DRK-BTC m/markets)))

(str "http://pubapi.cryptsy.com/api.php?method=singlemarketdata&marketid=" my-id)


(def my-url (str "http://pubapi.cryptsy.com/api.php?method=singlemarketdata&marketid="
                 1))

(let [m-data (client/get my-url
                {:as :json}) ]

  m-data)
;https://api.cryptsy.com/api
  ;(-> m-data :body :return :markets vals first :label))

