(ns nowayhoze.cryptsy-markets)

( def markets
{

:BTC-USD {:marketid "2" :label "BTC-USD" :primaryname "BitCoin" :primarycode "BTC" :secondaryname "US Dollar" :secondarycode "USD"}
:DOGE-USD {:marketid "182" :label "DOGE-USD" :primaryname "Dogecoin" :primarycode "DOGE" :secondaryname "US Dollar" :secondarycode "USD"}
:DRK-USD {:marketid "213" :label "DRK-USD" :primaryname "DarkCoin" :primarycode "DRK" :secondaryname "US Dollar" :secondarycode "USD"}
:FTC-USD {:marketid "6" :label "FTC-USD" :primaryname "FeatherCoin" :primarycode "FTC" :secondaryname "US Dollar" :secondarycode "USD"}
:LTC-USD {:marketid "1" :label "LTC-USD" :primaryname "LiteCoin" :primarycode "LTC" :secondaryname "US Dollar" :secondarycode "USD"}
:ADT-LTC {:marketid "94" :label "ADT-LTC" :primaryname "AndroidsTokensV2" :primarycode "ADT" :secondaryname "LiteCoin" :secondarycode "LTC"}
:ANC-LTC {:marketid "121" :label "ANC-LTC" :primaryname "AnonCoin" :primarycode "ANC" :secondaryname "LiteCoin" :secondarycode "LTC"}
:ASC-LTC {:marketid "111" :label "ASC-LTC" :primaryname "AsicCoin" :primarycode "ASC" :secondaryname "LiteCoin" :secondarycode "LTC"}
:AUR-LTC {:marketid "161" :label "AUR-LTC" :primaryname "AuroraCoin" :primarycode "AUR" :secondaryname "LiteCoin" :secondarycode "LTC"}

:BAT-LTC {:marketid "186" :label "BAT-LTC" :primaryname "BatCoin" :primarycode "BAT" :secondaryname "LiteCoin" :secondarycode "LTC"}

:BC-LTC {:marketid "191" :label "BC-LTC" :primaryname "BlackCoin" :primarycode "BC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:CAIx-LTC {:marketid "222" :label "CAIx-LTC" :primaryname "CAIx" :primarycode "CAIx" :secondaryname "LiteCoin" :secondarycode "LTC"}

:CGB-LTC {:marketid "123" :label "CGB-LTC" :primaryname "CryptogenicBullion" :primarycode "CGB" :secondaryname "LiteCoin" :secondarycode "LTC"}

:CLOAK-LTC {:marketid "228" :label "CLOAK-LTC" :primaryname "CloakCoin" :primarycode "CLOAK" :secondaryname "LiteCoin" :secondarycode "LTC"}

:CNC-LTC {:marketid "17" :label "CNC-LTC" :primaryname "CHNCoin" :primarycode "CNC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:COL-LTC {:marketid "109" :label "COL-LTC" :primaryname "ColossusCoin" :primarycode "COL" :secondaryname "LiteCoin" :secondarycode "LTC"}

:CPR-LTC {:marketid "91" :label "CPR-LTC" :primaryname "CopperBars" :primarycode "CPR" :secondaryname "LiteCoin" :secondarycode "LTC"}

:CRYPT-LTC {:marketid "220" :label "CRYPT-LTC" :primaryname "CryptCoin" :primarycode "CRYPT" :secondaryname "LiteCoin" :secondarycode "LTC"}

:CTM-LTC {:marketid "175" :label "CTM-LTC" :primaryname "Continuumcoin" :primarycode "CTM" :secondaryname "LiteCoin" :secondarycode "LTC"}

:DBL-LTC {:marketid "46" :label "DBL-LTC" :primaryname "Doubloons" :primarycode "DBL" :secondaryname "LiteCoin" :secondarycode "LTC"}

:DGC-LTC {:marketid "96" :label "DGC-LTC" :primaryname "DigitalCoin" :primarycode "DGC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:DIME-LTC {:marketid "206" :label "DIME-LTC" :primaryname "DimeCoin" :primarycode "DIME" :secondaryname "LiteCoin" :secondarycode "LTC"}

:DMC-LTC {:marketid "194" :label "DMC-LTC" :primaryname "DamaCoin" :primarycode "DMC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:DOGE-LTC {:marketid "135" :label "DOGE-LTC" :primaryname "Dogecoin" :primarycode "DOGE" :secondaryname "LiteCoin" :secondarycode "LTC"}

:DRK-LTC {:marketid "214" :label "DRK-LTC" :primaryname "DarkCoin" :primarycode "DRK" :secondaryname "LiteCoin" :secondarycode "LTC"}

:DVC-LTC {:marketid "52" :label "DVC-LTC" :primaryname "DevCoin" :primarycode "DVC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:ELP-LTC {:marketid "93" :label "ELP-LTC" :primaryname "ElephantCoin" :primarycode "ELP" :secondaryname "LiteCoin" :secondarycode "LTC"}

:EZC-LTC {:marketid "55" :label "EZC-LTC" :primaryname "EZCoin" :primarycode "EZC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:FLO-LTC {:marketid "61" :label "FLO-LTC" :primaryname "FlorinCoin" :primarycode "FLO" :secondaryname "LiteCoin" :secondarycode "LTC"}

:FRK-LTC {:marketid "171" :label "FRK-LTC" :primaryname "Franko" :primarycode "FRK" :secondaryname "LiteCoin" :secondarycode "LTC"}

:FST-LTC {:marketid "124" :label "FST-LTC" :primaryname "FastCoin" :primarycode "FST" :secondaryname "LiteCoin" :secondarycode "LTC"}

:FTC-LTC {:marketid "4" :label "FTC-LTC" :primaryname "FeatherCoin" :primarycode "FTC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:GLD-LTC {:marketid "36" :label "GLD-LTC" :primaryname "GoldCoin" :primarycode "GLD" :secondaryname "LiteCoin" :secondarycode "LTC"}

:GLYPH-LTC {:marketid "230" :label "GLYPH-LTC" :primaryname "GlyphCoin" :primarycode "GLYPH" :secondaryname "LiteCoin" :secondarycode "LTC"}

:GME-LTC {:marketid "84" :label "GME-LTC" :primaryname "GameCoin" :primarycode "GME" :secondaryname "LiteCoin" :secondarycode "LTC"}

:GUE-LTC {:marketid "242" :label "GUE-LTC" :primaryname "GuerillaCoin" :primarycode "GUE" :secondaryname "LiteCoin" :secondarycode "LTC"}

:IFC-LTC {:marketid "60" :label "IFC-LTC" :primaryname "InfiniteCoin" :primarycode "IFC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:JKC-LTC {:marketid "35" :label "JKC-LTC" :primaryname "JunkCoin" :primarycode "JKC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:KARM-LTC {:marketid "193" :label "KARM-LTC" :primaryname "KarmaCoin" :primarycode "KARM" :secondaryname "LiteCoin" :secondarycode "LTC"}

:LTCX-LTC {:marketid "234" :label "LTCX-LTC" :primaryname "LiteCoinX" :primarycode "LTCX" :secondaryname "LiteCoin" :secondarycode "LTC"}

:MAX-LTC {:marketid "218" :label "MAX-LTC" :primaryname "MaxCoin" :primarycode "MAX" :secondaryname "LiteCoin" :secondarycode "LTC"}

:MEC-LTC {:marketid "100" :label "MEC-LTC" :primaryname "MegaCoin" :primarycode "MEC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:MEM-LTC {:marketid "56" :label "MEM-LTC" :primaryname "MemeCoin" :primarycode "MEM" :secondaryname "LiteCoin" :secondarycode "LTC"}

:MEOW-LTC {:marketid "231" :label "MEOW-LTC" :primaryname "KittehCoin" :primarycode "MEOW" :secondaryname "LiteCoin" :secondarycode "LTC"}

:MOON-LTC {:marketid "145" :label "MOON-LTC" :primaryname "MoonCoin" :primarycode "MOON" :secondaryname "LiteCoin" :secondarycode "LTC"}

:MST-LTC {:marketid "62" :label "MST-LTC" :primaryname "MasterCoin (Hydro)" :primarycode "MST" :secondaryname "LiteCoin" :secondarycode "LTC"}

:NET-LTC {:marketid "108" :label "NET-LTC" :primaryname "Netcoin" :primarycode "NET" :secondaryname "LiteCoin" :secondarycode "LTC"}

:NXT-LTC {:marketid "162" :label "NXT-LTC" :primaryname "Nxt" :primarycode "NXT" :secondaryname "LiteCoin" :secondarycode "LTC"}

:PPC-LTC {:marketid "125" :label "PPC-LTC" :primaryname "Peercoin" :primarycode "PPC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:PXC-LTC {:marketid "101" :label "PXC-LTC" :primaryname "PhoenixCoin" :primarycode "PXC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:QRK-LTC {:marketid "126" :label "QRK-LTC" :primaryname "Quark" :primarycode "QRK" :secondaryname "LiteCoin" :secondarycode "LTC"}

:RBBT-LTC {:marketid "190" :label "RBBT-LTC" :primaryname "RabbitCoin" :primarycode "RBBT" :secondaryname "LiteCoin" :secondarycode "LTC"}

:RDD-LTC {:marketid "212" :label "RDD-LTC" :primaryname "ReddCoin" :primarycode "RDD" :secondaryname "LiteCoin" :secondarycode "LTC"}

:RED-LTC {:marketid "87" :label "RED-LTC" :primaryname "RedCoin" :primarycode "RED" :secondaryname "LiteCoin" :secondarycode "LTC"}

:RT2-LTC {:marketid "236" :label "RT2-LTC" :primaryname "RotoCoin" :primarycode "RT2" :secondaryname "LiteCoin" :secondarycode "LTC"}

:RYC-LTC {:marketid "37" :label "RYC-LTC" :primaryname "RoyalCoin" :primarycode "RYC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:RZR-LTC {:marketid "238" :label "RZR-LTC" :primaryname "Razor" :primarycode "RZR" :secondaryname "LiteCoin" :secondarycode "LTC"}

:SBC-LTC {:marketid "128" :label "SBC-LTC" :primaryname "StableCoin" :primarycode "SBC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:SC-LTC {:marketid "226" :label "SC-LTC" :primaryname "SilkCoin" :primarycode "SC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:SUPER-LTC {:marketid "240" :label "SUPER-LTC" :primaryname "SuperCoin" :primarycode "SUPER" :secondaryname "LiteCoin" :secondarycode "LTC"}

:SXC-LTC {:marketid "98" :label "SXC-LTC" :primaryname "SexCoin" :primarycode "SXC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:TES-LTC {:marketid "224" :label "TES-LTC" :primaryname "TeslaCoin" :primarycode "TES" :secondaryname "LiteCoin" :secondarycode "LTC"}

:TIPS-LTC {:marketid "147" :label "TIPS-LTC" :primaryname "FedoraCoin" :primarycode "TIPS" :secondaryname "LiteCoin" :secondarycode "LTC"}

:TIX-LTC {:marketid "107" :label "TIX-LTC" :primaryname "Tickets" :primarycode "TIX" :secondaryname "LiteCoin" :secondarycode "LTC"}

:VRC-LTC {:marketid "215" :label "VRC-LTC" :primaryname "VeriCoin" :primarycode "VRC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:VTC-LTC {:marketid "217" :label "VTC-LTC" :primaryname "VertCoin" :primarycode "VTC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:WDC-LTC {:marketid "21" :label "WDC-LTC" :primaryname "WorldCoin" :primarycode "WDC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:XC-LTC {:marketid "216" :label "XC-LTC" :primaryname "X11Coin" :primarycode "XC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:XNC-LTC {:marketid "67" :label "XNC-LTC" :primaryname "XenCoin" :primarycode "XNC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:XPM-LTC {:marketid "106" :label "XPM-LTC" :primaryname "PrimeCoin" :primarycode "XPM" :secondaryname "LiteCoin" :secondarycode "LTC"}

:YAC-LTC {:marketid "22" :label "YAC-LTC" :primaryname "YaCoin" :primarycode "YAC" :secondaryname "LiteCoin" :secondarycode "LTC"}

:ZEIT-LTC {:marketid "176" :label "ZEIT-LTC" :primaryname "ZeitCoin" :primarycode "ZEIT" :secondaryname "LiteCoin" :secondarycode "LTC"}

:ZET-LTC {:marketid "127" :label "ZET-LTC" :primaryname "ZetaCoin" :primarycode "ZET" :secondaryname "LiteCoin" :secondarycode "LTC"}

:42-BTC {:marketid "141" :label "42-BTC" :primaryname "42Coin" :primarycode "42" :secondaryname "BitCoin" :secondarycode "BTC"}

:AC-BTC {:marketid "199" :label "AC-BTC" :primaryname "AsiaCoin" :primarycode "AC" :secondaryname "BitCoin" :secondarycode "BTC"}

:ALF-BTC {:marketid "57" :label "ALF-BTC" :primaryname "AlphaCoin" :primarycode "ALF" :secondaryname "BitCoin" :secondarycode "BTC"}

:AMC-BTC {:marketid "43" :label "AMC-BTC" :primaryname "AmericanCoin" :primarycode "AMC" :secondaryname "BitCoin" :secondarycode "BTC"}

:ANC-BTC {:marketid "66" :label "ANC-BTC" :primaryname "AnonCoin" :primarycode "ANC" :secondaryname "BitCoin" :secondarycode "BTC"}

:ARG-BTC {:marketid "48" :label "ARG-BTC" :primaryname "Argentum" :primarycode "ARG" :secondaryname "BitCoin" :secondarycode "BTC"}

:AUR-BTC {:marketid "160" :label "AUR-BTC" :primaryname "AuroraCoin" :primarycode "AUR" :secondaryname "BitCoin" :secondarycode "BTC"}

:BC-BTC {:marketid "179" :label "BC-BTC" :primaryname "BlackCoin" :primarycode "BC" :secondaryname "BitCoin" :secondarycode "BTC"}

:BCX-BTC {:marketid "142" :label "BCX-BTC" :primaryname "BattleCoin" :primarycode "BCX" :secondaryname "BitCoin" :secondarycode "BTC"}

:BEN-BTC {:marketid "157" :label "BEN-BTC" :primaryname "Benjamins" :primarycode "BEN" :secondaryname "BitCoin" :secondarycode "BTC"}

:BET-BTC {:marketid "129" :label "BET-BTC" :primaryname "Betacoin" :primarycode "BET" :secondaryname "BitCoin" :secondarycode "BTC"}

:BQC-BTC {:marketid "10" :label "BQC-BTC" :primaryname "BBQCoin" :primarycode "BQC" :secondaryname "BitCoin" :secondarycode "BTC"}

:BTB-BTC {:marketid "23" :label "BTB-BTC" :primaryname "BitBar" :primarycode "BTB" :secondaryname "BitCoin" :secondarycode "BTC"}

:BTE-BTC {:marketid "49" :label "BTE-BTC" :primaryname "ByteCoin" :primarycode "BTE" :secondaryname "BitCoin" :secondarycode "BTC"}

:BTG-BTC {:marketid "50" :label "BTG-BTC" :primaryname "BitGem" :primarycode "BTG" :secondaryname "BitCoin" :secondarycode "BTC"}

:BUK-BTC {:marketid "102" :label "BUK-BTC" :primaryname "CryptoBuck" :primarycode "BUK" :secondaryname "BitCoin" :secondarycode "BTC"}

:CACH-BTC {:marketid "154" :label "CACH-BTC" :primaryname "CACHeCoin" :primarycode "CACH" :secondaryname "BitCoin" :secondarycode "BTC"}

:CAIx-BTC {:marketid "221" :label "CAIx-BTC" :primaryname "CAIx" :primarycode "CAIx" :secondaryname "BitCoin" :secondarycode "BTC"}

:CAP-BTC {:marketid "53" :label "CAP-BTC" :primaryname "BottleCaps" :primarycode "CAP" :secondaryname "BitCoin" :secondarycode "BTC"}

:CASH-BTC {:marketid "150" :label "CASH-BTC" :primaryname "CashCoin" :primarycode "CASH" :secondaryname "BitCoin" :secondarycode "BTC"}

:CAT-BTC {:marketid "136" :label "CAT-BTC" :primaryname "CatCoin" :primarycode "CAT" :secondaryname "BitCoin" :secondarycode "BTC"}

:CGB-BTC {:marketid "70" :label "CGB-BTC" :primaryname "CryptogenicBullion" :primarycode "CGB" :secondaryname "BitCoin" :secondarycode "BTC"}

:CINNI-BTC {:marketid "197" :label "CINNI-BTC" :primaryname "CinniCoin" :primarycode "CINNI" :secondaryname "BitCoin" :secondarycode "BTC"}

:CLOAK-BTC {:marketid "227" :label "CLOAK-BTC" :primaryname "CloakCoin" :primarycode "CLOAK" :secondaryname "BitCoin" :secondarycode "BTC"}



:CLR-BTC {:marketid "95" :label "CLR-BTC" :primaryname "CopperLark" :primarycode "CLR" :secondaryname "BitCoin" :secondarycode "BTC"}

:CMC-BTC {:marketid "74" :label "CMC-BTC" :primaryname "Cosmoscoin" :primarycode "CMC" :secondaryname "BitCoin" :secondarycode "BTC"}

:CNC-BTC {:marketid "8" :label "CNC-BTC" :primaryname "CHNCoin" :primarycode "CNC" :secondaryname "BitCoin" :secondarycode "BTC"}

:COMM-BTC {:marketid "198" :label "COMM-BTC" :primaryname "CommunityCoin" :primarycode "COMM" :secondaryname "BitCoin" :secondarycode "BTC"}

:CRC-BTC {:marketid "58" :label "CRC-BTC" :primaryname "CraftCoin" :primarycode "CRC" :secondaryname "BitCoin" :secondarycode "BTC"}

:CRYPT-BTC {:marketid "219" :label "CRYPT-BTC" :primaryname "CryptCoin" :primarycode "CRYPT" :secondaryname "BitCoin" :secondarycode "BTC"}

:CSC-BTC {:marketid "68" :label "CSC-BTC" :primaryname "CasinoCoin" :primarycode "CSC" :secondaryname "BitCoin" :secondarycode "BTC"}

:DEM-BTC {:marketid "131" :label "DEM-BTC" :primaryname "eMark" :primarycode "DEM" :secondaryname "BitCoin" :secondarycode "BTC"}

:DGB-BTC {:marketid "167" :label "DGB-BTC" :primaryname "Digibyte" :primarycode "DGB" :secondaryname "BitCoin" :secondarycode "BTC"}

:DGC-BTC {:marketid "26" :label "DGC-BTC" :primaryname "DigitalCoin" :primarycode "DGC" :secondaryname "BitCoin" :secondarycode "BTC"}

:DMD-BTC {:marketid "72" :label "DMD-BTC" :primaryname "Diamond" :primarycode "DMD" :secondaryname "BitCoin" :secondarycode "BTC"}

:DOGE-BTC {:marketid "132" :label "DOGE-BTC" :primaryname "Dogecoin" :primarycode "DOGE" :secondaryname "BitCoin" :secondarycode "BTC"}

:DRK-BTC {:marketid "155" :label "DRK-BTC" :primaryname "DarkCoin" :primarycode "DRK" :secondaryname "BitCoin" :secondarycode "BTC"}

:DVC-BTC {:marketid "40" :label "DVC-BTC" :primaryname "DevCoin" :primarycode "DVC" :secondaryname "BitCoin" :secondarycode "BTC"}

:EAC-BTC {:marketid "139" :label "EAC-BTC" :primaryname "EarthCoin" :primarycode "EAC" :secondaryname "BitCoin" :secondarycode "BTC"}

:ELC-BTC {:marketid "12" :label "ELC-BTC" :primaryname "ElaCoin" :primarycode "ELC" :secondaryname "BitCoin" :secondarycode "BTC"}

:EMC2-BTC {:marketid "188" :label "EMC2-BTC" :primaryname "Einsteinium" :primarycode "EMC2" :secondaryname "BitCoin" :secondarycode "BTC"}

:EMD-BTC {:marketid "69" :label "EMD-BTC" :primaryname "Emerald" :primarycode "EMD" :secondaryname "BitCoin" :secondarycode "BTC"}

:EXE-BTC {:marketid "183" :label "EXE-BTC" :primaryname "ExeCoin" :primarycode "EXE" :secondaryname "BitCoin" :secondarycode "BTC"}

:EZC-BTC {:marketid "47" :label "EZC-BTC" :primaryname "EZCoin" :primarycode "EZC" :secondaryname "BitCoin" :secondarycode "BTC"}

:FFC-BTC {:marketid "138" :label "FFC-BTC" :primaryname "FireflyCoin" :primarycode "FFC" :secondaryname "BitCoin" :secondarycode "BTC"}

:FLAP-BTC {:marketid "165" :label "FLAP-BTC" :primaryname "FlappyCoin" :primarycode "FLAP" :secondaryname "BitCoin" :secondarycode "BTC"}

:FRC-BTC {:marketid "39" :label "FRC-BTC" :primaryname "FreiCoin" :primarycode "FRC" :secondaryname "BitCoin" :secondarycode "BTC"}

:FRK-BTC {:marketid "33" :label "FRK-BTC" :primaryname "Franko" :primarycode "FRK" :secondaryname "BitCoin" :secondarycode "BTC"}

:FST-BTC {:marketid "44" :label "FST-BTC" :primaryname "FastCoin" :primarycode "FST" :secondaryname "BitCoin" :secondarycode "BTC"}

:FTC-BTC {:marketid "5" :label "FTC-BTC" :primaryname "FeatherCoin" :primarycode "FTC" :secondaryname "BitCoin" :secondarycode "BTC"}

:GDC-BTC {:marketid "82" :label "GDC-BTC" :primaryname "GrandCoin" :primarycode "GDC" :secondaryname "BitCoin" :secondarycode "BTC"}

:GLC-BTC {:marketid "76" :label "GLC-BTC" :primaryname "Globalcoin" :primarycode "GLC" :secondaryname "BitCoin" :secondarycode "BTC"}

:GLD-BTC {:marketid "30" :label "GLD-BTC" :primaryname "GoldCoin" :primarycode "GLD" :secondaryname "BitCoin" :secondarycode "BTC"}

:GLX-BTC {:marketid "78" :label "GLX-BTC" :primaryname "Galaxycoin" :primarycode "GLX" :secondaryname "BitCoin" :secondarycode "BTC"}

:GLYPH-BTC {:marketid "229" :label "GLYPH-BTC" :primaryname "GlyphCoin" :primarycode "GLYPH" :secondaryname "BitCoin" :secondarycode "BTC"}

:GUE-BTC {:marketid "241" :label "GUE-BTC" :primaryname "GuerillaCoin" :primarycode "GUE" :secondaryname "BitCoin" :secondarycode "BTC"}

:HBN-BTC {:marketid "80" :label "HBN-BTC" :primaryname "HoboNickels" :primarycode "HBN" :secondaryname "BitCoin" :secondarycode "BTC"}

:HVC-BTC {:marketid "185" :label "HVC-BTC" :primaryname "HeavyCoin" :primarycode "HVC" :secondaryname "BitCoin" :secondarycode "BTC"}

:IFC-BTC {:marketid "59" :label "IFC-BTC" :primaryname "InfiniteCoin" :primarycode "IFC" :secondaryname "BitCoin" :secondarycode "BTC"}

:IXC-BTC {:marketid "38" :label "IXC-BTC" :primaryname "IXCoin" :primarycode "IXC" :secondaryname "BitCoin" :secondarycode "BTC"}

:JKC-BTC {:marketid "25" :label "JKC-BTC" :primaryname "JunkCoin" :primarycode "JKC" :secondaryname "BitCoin" :secondarycode "BTC"}

:KDC-BTC {:marketid "178" :label "KDC-BTC" :primaryname "KlondikeCoin" :primarycode "KDC" :secondaryname "BitCoin" :secondarycode "BTC"}

:KGC-BTC {:marketid "65" :label "KGC-BTC" :primaryname "KrugerCoin" :primarycode "KGC" :secondaryname "BitCoin" :secondarycode "BTC"}

:LEAF-BTC {:marketid "148" :label "LEAF-BTC" :primaryname "LeafCoin" :primarycode "LEAF" :secondaryname "BitCoin" :secondarycode "BTC"}

:LK7-BTC {:marketid "116" :label "LK7-BTC" :primaryname "Lucky7Coin" :primarycode "LK7" :secondaryname "BitCoin" :secondarycode "BTC"}

:LKY-BTC {:marketid "34" :label "LKY-BTC" :primaryname "LuckyCoin" :primarycode "LKY" :secondaryname "BitCoin" :secondarycode "BTC"}

:LOT-BTC {:marketid "137" :label "LOT-BTC" :primaryname "LottoCoin" :primarycode "LOT" :secondaryname "BitCoin" :secondarycode "BTC"}

:LTC-BTC {:marketid "3" :label "LTC-BTC" :primaryname "LiteCoin" :primarycode "LTC" :secondaryname "BitCoin" :secondarycode "BTC"}

:LTCX-BTC {:marketid "233" :label "LTCX-BTC" :primaryname "LiteCoinX" :primarycode "LTCX" :secondaryname "BitCoin" :secondarycode "BTC"}

:LYC-BTC {:marketid "177" :label "LYC-BTC" :primaryname "LycanCoin" :primarycode "LYC" :secondaryname "BitCoin" :secondarycode "BTC"}

:MAX-BTC {:marketid "152" :label "MAX-BTC" :primaryname "MaxCoin" :primarycode "MAX" :secondaryname "BitCoin" :secondarycode "BTC"}

:MEC-BTC {:marketid "45" :label "MEC-BTC" :primaryname "MegaCoin" :primarycode "MEC" :secondaryname "BitCoin" :secondarycode "BTC"}

:MEOW-BTC {:marketid "149" :label "MEOW-BTC" :primaryname "KittehCoin" :primarycode "MEOW" :secondaryname "BitCoin" :secondarycode "BTC"}

:MN1-BTC {:marketid "187" :label "MN1-BTC" :primaryname "Mining Contract 1" :primarycode "MN1" :secondaryname "BitCoin" :secondarycode "BTC"}

:MN2-BTC {:marketid "196" :label "MN2-BTC" :primaryname "Mining Contract 2" :primarycode "MN2" :secondaryname "BitCoin" :secondarycode "BTC"}

:MNC-BTC {:marketid "7" :label "MNC-BTC" :primaryname "MinCoin" :primarycode "MNC" :secondaryname "BitCoin" :secondarycode "BTC"}

:MRY-BTC {:marketid "189" :label "MRY-BTC" :primaryname "MurrayCoin" :primarycode "MRY" :secondaryname "BitCoin" :secondarycode "BTC"}

:MYR-BTC {:marketid "200" :label "MYR-BTC" :primaryname "MyriadCoin" :primarycode "MYR" :secondaryname "BitCoin" :secondarycode "BTC"}

:MZC-BTC {:marketid "164" :label "MZC-BTC" :primaryname "MazaCoin" :primarycode "MZC" :secondaryname "BitCoin" :secondarycode "BTC"}

:NAN-BTC {:marketid "64" :label "NAN-BTC" :primaryname "NanoToken" :primarycode "NAN" :secondaryname "BitCoin" :secondarycode "BTC"}

:NAUT-BTC {:marketid "207" :label "NAUT-BTC" :primaryname "NautilusCoin" :primarycode "NAUT" :secondaryname "BitCoin" :secondarycode "BTC"}

:NBL-BTC {:marketid "32" :label "NBL-BTC" :primaryname "Nibble" :primarycode "NBL" :secondaryname "BitCoin" :secondarycode "BTC"}

:NEC-BTC {:marketid "90" :label "NEC-BTC" :primaryname "NeoCoin" :primarycode "NEC" :secondaryname "BitCoin" :secondarycode "BTC"}

:NET-BTC {:marketid "134" :label "NET-BTC" :primaryname "Netcoin" :primarycode "NET" :secondaryname "BitCoin" :secondarycode "BTC"}

:NMC-BTC {:marketid "29" :label "NMC-BTC" :primaryname "NameCoin" :primarycode "NMC" :secondaryname "BitCoin" :secondarycode "BTC"}

:NRB-BTC {:marketid "54" :label "NRB-BTC" :primaryname "NoirBits" :primarycode "NRB" :secondaryname "BitCoin" :secondarycode "BTC"}

:NRS-BTC {:marketid "211" :label "NRS-BTC" :primaryname "NoirShares" :primarycode "NRS" :secondaryname "BitCoin" :secondarycode "BTC"}

:NVC-BTC {:marketid "13" :label "NVC-BTC" :primaryname "NovaCoin" :primarycode "NVC" :secondaryname "BitCoin" :secondarycode "BTC"}

:NXT-BTC {:marketid "159" :label "NXT-BTC" :primaryname "Nxt" :primarycode "NXT" :secondaryname "BitCoin" :secondarycode "BTC"}

:NYAN-BTC {:marketid "184" :label "NYAN-BTC" :primaryname "NyanCoin" :primarycode "NYAN" :secondaryname "BitCoin" :secondarycode "BTC"}

:ORB-BTC {:marketid "75" :label "ORB-BTC" :primaryname "Orbitcoin" :primarycode "ORB" :secondaryname "BitCoin" :secondarycode "BTC"}

:OSC-BTC {:marketid "144" :label "OSC-BTC" :primaryname "OpenSourceCoin" :primarycode "OSC" :secondaryname "BitCoin" :secondarycode "BTC"}

:PHS-BTC {:marketid "86" :label "PHS-BTC" :primaryname "PhilosopherStone" :primarycode "PHS" :secondaryname "BitCoin" :secondarycode "BTC"}

:Points-BTC {:marketid "120" :label "Points-BTC" :primaryname "CryptsyPoints" :primarycode "Points" :secondaryname "BitCoin" :secondarycode "BTC"}

:POT-BTC {:marketid "173" :label "POT-BTC" :primaryname "PotCoin" :primarycode "POT" :secondaryname "BitCoin" :secondarycode "BTC"}

:PPC-BTC {:marketid "28" :label "PPC-BTC" :primaryname "Peercoin" :primarycode "PPC" :secondaryname "BitCoin" :secondarycode "BTC"}

:PTS-BTC {:marketid "119" :label "PTS-BTC" :primaryname "Bitshares PTS" :primarycode "PTS" :secondaryname "BitCoin" :secondarycode "BTC"}

:PXC-BTC {:marketid "31" :label "PXC-BTC" :primaryname "PhoenixCoin" :primarycode "PXC" :secondaryname "BitCoin" :secondarycode "BTC"}

:PYC-BTC {:marketid "92" :label "PYC-BTC" :primaryname "PayCoin" :primarycode "PYC" :secondaryname "BitCoin" :secondarycode "BTC"}

:QRK-BTC {:marketid "71" :label "QRK-BTC" :primaryname "Quark" :primarycode "QRK" :secondaryname "BitCoin" :secondarycode "BTC"}

:RDD-BTC {:marketid "169" :label "RDD-BTC" :primaryname "ReddCoin" :primarycode "RDD" :secondaryname "BitCoin" :secondarycode "BTC"}

:RPC-BTC {:marketid "143" :label "RPC-BTC" :primaryname "RonPaulCoin" :primarycode "RPC" :secondaryname "BitCoin" :secondarycode "BTC"}

:RT2-BTC {:marketid "235" :label "RT2-BTC" :primaryname "RotoCoin" :primarycode "RT2" :secondaryname "BitCoin" :secondarycode "BTC"}

:RYC-BTC {:marketid "9" :label "RYC-BTC" :primaryname "RoyalCoin" :primarycode "RYC" :secondaryname "BitCoin" :secondarycode "BTC"}

:RZR-BTC {:marketid "237" :label "RZR-BTC" :primaryname "Razor" :primarycode "RZR" :secondaryname "BitCoin" :secondarycode "BTC"}

:SAT2-BTC {:marketid "232" :label "SAT2-BTC" :primaryname "SaturnCoinV2" :primarycode "SAT2" :secondaryname "BitCoin" :secondarycode "BTC"}

:SBC-BTC {:marketid "51" :label "SBC-BTC" :primaryname "StableCoin" :primarycode "SBC" :secondaryname "BitCoin" :secondarycode "BTC"}

:SC-BTC {:marketid "225" :label "SC-BTC" :primaryname "SilkCoin" :primarycode "SC" :secondaryname "BitCoin" :secondarycode "BTC"}

:SMC-BTC {:marketid "158" :label "SMC-BTC" :primaryname "SmartCoin" :primarycode "SMC" :secondaryname "BitCoin" :secondarycode "BTC"}

:SPA-BTC {:marketid "180" :label "SPA-BTC" :primaryname "SpainCoin" :primarycode "SPA" :secondaryname "BitCoin" :secondarycode "BTC"}

:SPT-BTC {:marketid "81" :label "SPT-BTC" :primaryname "Spots" :primarycode "SPT" :secondaryname "BitCoin" :secondarycode "BTC"}

:SRC-BTC {:marketid "88" :label "SRC-BTC" :primaryname "SecureCoin" :primarycode "SRC" :secondaryname "BitCoin" :secondarycode "BTC"}

:STR-BTC {:marketid "83" :label "STR-BTC" :primaryname "StarCoin" :primarycode "STR" :secondaryname "BitCoin" :secondarycode "BTC"}

:SUPER-BTC {:marketid "239" :label "SUPER-BTC" :primaryname "SuperCoin" :primarycode "SUPER" :secondaryname "BitCoin" :secondarycode "BTC"}

:SXC-BTC {:marketid "153" :label "SXC-BTC" :primaryname "SexCoin" :primarycode "SXC" :secondaryname "BitCoin" :secondarycode "BTC"}

:TAG-BTC {:marketid "117" :label "TAG-BTC" :primaryname "TagCoin" :primarycode "TAG" :secondaryname "BitCoin" :secondarycode "BTC"}

:TAK-BTC {:marketid "166" :label "TAK-BTC" :primaryname "TakCoin" :primarycode "TAK" :secondaryname "BitCoin" :secondarycode "BTC"}

:TEK-BTC {:marketid "114" :label "TEK-BTC" :primaryname "TekCoin" :primarycode "TEK" :secondaryname "BitCoin" :secondarycode "BTC"}

:TES-BTC {:marketid "223" :label "TES-BTC" :primaryname "TeslaCoin" :primarycode "TES" :secondaryname "BitCoin" :secondarycode "BTC"}

:TGC-BTC {:marketid "130" :label "TGC-BTC" :primaryname "TigerCoin" :primarycode "TGC" :secondaryname "BitCoin" :secondarycode "BTC"}

:TRC-BTC {:marketid "27" :label "TRC-BTC" :primaryname "TerraCoin" :primarycode "TRC" :secondaryname "BitCoin" :secondarycode "BTC"}

:UNB-BTC {:marketid "203" :label "UNB-BTC" :primaryname "UnbreakableCoin" :primarycode "UNB" :secondaryname "BitCoin" :secondarycode "BTC"}

:UNO-BTC {:marketid "133" :label "UNO-BTC" :primaryname "Unobtanium" :primarycode "UNO" :secondaryname "BitCoin" :secondarycode "BTC"}

:USDe-BTC {:marketid "201" :label "USDe-BTC" :primaryname "USDe" :primarycode "USDe" :secondaryname "BitCoin" :secondarycode "BTC"}

:UTC-BTC {:marketid "163" :label "UTC-BTC" :primaryname "UltraCoin" :primarycode "UTC" :secondaryname "BitCoin" :secondarycode "BTC"}

:VRC-BTC {:marketid "209" :label "VRC-BTC" :primaryname "VeriCoin" :primarycode "VRC" :secondaryname "BitCoin" :secondarycode "BTC"}

:VTC-BTC {:marketid "151" :label "VTC-BTC" :primaryname "VertCoin" :primarycode "VTC" :secondaryname "BitCoin" :secondarycode "BTC"}

:WC-BTC {:marketid "195" :label "WC-BTC" :primaryname "WhiteCoin" :primarycode "WC" :secondaryname "BitCoin" :secondarycode "BTC"}

:WDC-BTC {:marketid "14" :label "WDC-BTC" :primaryname "WorldCoin" :primarycode "WDC" :secondaryname "BitCoin" :secondarycode "BTC"}

:XC-BTC {:marketid "210" :label "XC-BTC" :primaryname "X11Coin" :primarycode "XC" :secondaryname "BitCoin" :secondarycode "BTC"}

:XJO-BTC {:marketid "115" :label "XJO-BTC" :primaryname "JouleCoin" :primarycode "XJO" :secondaryname "BitCoin" :secondarycode "BTC"}

:XLB-BTC {:marketid "208" :label "XLB-BTC" :primaryname "LibertyCoin" :primarycode "XLB" :secondaryname "BitCoin" :secondarycode "BTC"}

:XPM-BTC {:marketid "63" :label "XPM-BTC" :primaryname "PrimeCoin" :primarycode "XPM" :secondaryname "BitCoin" :secondarycode "BTC"}

:YAC-BTC {:marketid "11" :label "YAC-BTC" :primaryname "YaCoin" :primarycode "YAC" :secondaryname "BitCoin" :secondarycode "BTC"}

:YBC-BTC {:marketid "73" :label "YBC-BTC" :primaryname "YBCoin" :primarycode "YBC" :secondaryname "BitCoin" :secondarycode "BTC"}

:ZCC-BTC {:marketid "140" :label "ZCC-BTC" :primaryname "ZcCoin" :primarycode "ZCC" :secondaryname "BitCoin" :secondarycode "BTC"}

:ZED-BTC {:marketid "170" :label "ZED-BTC" :primaryname "ZedCoin" :primarycode "ZED" :secondaryname "BitCoin" :secondarycode "BTC"}

:ZET-BTC {:marketid "85" :label "ZET-BTC" :primaryname "ZetaCoin" :primarycode "ZET" :secondaryname "BitCoin" :secondarycode "BTC"}

})
