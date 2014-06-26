(ns cryptsy.markets)

( def markets
{
:LTC/USD {:label "LTC/USD", :secondarycode "USD", :primarycode "LTC", :marketid "1"}
:BTC/USD {:label "BTC/USD", :secondarycode "USD", :primarycode "BTC", :marketid "2"}
:LTC/BTC {:label "LTC/BTC", :secondarycode "BTC", :primarycode "LTC", :marketid "3"}
:FTC/LTC {:label "FTC/LTC", :secondarycode "LTC", :primarycode "FTC", :marketid "4"}
:FTC/BTC {:label "FTC/BTC", :secondarycode "BTC", :primarycode "FTC", :marketid "5"}
:FTC/USD {:label "FTC/USD", :secondarycode "USD", :primarycode "FTC", :marketid "6"}
:MNC/BTC {:label "MNC/BTC", :secondarycode "BTC", :primarycode "MNC", :marketid "7"}
:CNC/BTC {:label "CNC/BTC", :secondarycode "BTC", :primarycode "CNC", :marketid "8"}
:RYC/BTC {:label "RYC/BTC", :secondarycode "BTC", :primarycode "RYC", :marketid "9"}
:BQC/BTC {:label "BQC/BTC", :secondarycode "BTC", :primarycode "BQC", :marketid "10"}
:YAC/BTC {:label "YAC/BTC", :secondarycode "BTC", :primarycode "YAC", :marketid "11"}
:ELC/BTC {:label "ELC/BTC", :secondarycode "BTC", :primarycode "ELC", :marketid "12"}
:NVC/BTC {:label "NVC/BTC", :secondarycode "BTC", :primarycode "NVC", :marketid "13"}
:WDC/BTC {:label "WDC/BTC", :secondarycode "BTC", :primarycode "WDC", :marketid "14"}
:CNC/LTC {:label "CNC/LTC", :secondarycode "LTC", :primarycode "CNC", :marketid "17"}
:WDC/LTC {:label "WDC/LTC", :secondarycode "LTC", :primarycode "WDC", :marketid "21"}
:YAC/LTC {:label "YAC/LTC", :secondarycode "LTC", :primarycode "YAC", :marketid "22"}
:BTB/BTC {:label "BTB/BTC", :secondarycode "BTC", :primarycode "BTB", :marketid "23"}
:JKC/BTC {:label "JKC/BTC", :secondarycode "BTC", :primarycode "JKC", :marketid "25"}
:DGC/BTC {:label "DGC/BTC", :secondarycode "BTC", :primarycode "DGC", :marketid "26"}
:TRC/BTC {:label "TRC/BTC", :secondarycode "BTC", :primarycode "TRC", :marketid "27"}
:PPC/BTC {:label "PPC/BTC", :secondarycode "BTC", :primarycode "PPC", :marketid "28"}
:NMC/BTC {:label "NMC/BTC", :secondarycode "BTC", :primarycode "NMC", :marketid "29"}
:GLD/BTC {:label "GLD/BTC", :secondarycode "BTC", :primarycode "GLD", :marketid "30"}
:PXC/BTC {:label "PXC/BTC", :secondarycode "BTC", :primarycode "PXC", :marketid "31"}
:NBL/BTC {:label "NBL/BTC", :secondarycode "BTC", :primarycode "NBL", :marketid "32"}
:FRK/BTC {:label "FRK/BTC", :secondarycode "BTC", :primarycode "FRK", :marketid "33"}
:LKY/BTC {:label "LKY/BTC", :secondarycode "BTC", :primarycode "LKY", :marketid "34"}
:JKC/LTC {:label "JKC/LTC", :secondarycode "LTC", :primarycode "JKC", :marketid "35"}
:GLD/LTC {:label "GLD/LTC", :secondarycode "LTC", :primarycode "GLD", :marketid "36"}
:RYC/LTC {:label "RYC/LTC", :secondarycode "LTC", :primarycode "RYC", :marketid "37"}
:IXC/BTC {:label "IXC/BTC", :secondarycode "BTC", :primarycode "IXC", :marketid "38"}
:FRC/BTC {:label "FRC/BTC", :secondarycode "BTC", :primarycode "FRC", :marketid "39"}
:DVC/BTC {:label "DVC/BTC", :secondarycode "BTC", :primarycode "DVC", :marketid "40"}
:AMC/BTC {:label "AMC/BTC", :secondarycode "BTC", :primarycode "AMC", :marketid "43"}
:FST/BTC {:label "FST/BTC", :secondarycode "BTC", :primarycode "FST", :marketid "44"}
:MEC/BTC {:label "MEC/BTC", :secondarycode "BTC", :primarycode "MEC", :marketid "45"}
:DBL/LTC {:label "DBL/LTC", :secondarycode "LTC", :primarycode "DBL", :marketid "46"}
:EZC/BTC {:label "EZC/BTC", :secondarycode "BTC", :primarycode "EZC", :marketid "47"}
:ARG/BTC {:label "ARG/BTC", :secondarycode "BTC", :primarycode "ARG", :marketid "48"}
:BTE/BTC {:label "BTE/BTC", :secondarycode "BTC", :primarycode "BTE", :marketid "49"}
:BTG/BTC {:label "BTG/BTC", :secondarycode "BTC", :primarycode "BTG", :marketid "50"}
:SBC/BTC {:label "SBC/BTC", :secondarycode "BTC", :primarycode "SBC", :marketid "51"}
:DVC/LTC {:label "DVC/LTC", :secondarycode "LTC", :primarycode "DVC", :marketid "52"}
:CAP/BTC {:label "CAP/BTC", :secondarycode "BTC", :primarycode "CAP", :marketid "53"}
:NRB/BTC {:label "NRB/BTC", :secondarycode "BTC", :primarycode "NRB", :marketid "54"}
:EZC/LTC {:label "EZC/LTC", :secondarycode "LTC", :primarycode "EZC", :marketid "55"}
:MEM/LTC {:label "MEM/LTC", :secondarycode "LTC", :primarycode "MEM", :marketid "56"}
:ALF/BTC {:label "ALF/BTC", :secondarycode "BTC", :primarycode "ALF", :marketid "57"}
:CRC/BTC {:label "CRC/BTC", :secondarycode "BTC", :primarycode "CRC", :marketid "58"}
:IFC/BTC {:label "IFC/BTC", :secondarycode "BTC", :primarycode "IFC", :marketid "59"}
:IFC/LTC {:label "IFC/LTC", :secondarycode "LTC", :primarycode "IFC", :marketid "60"}
:FLO/LTC {:label "FLO/LTC", :secondarycode "LTC", :primarycode "FLO", :marketid "61"}
:MST/LTC {:label "MST/LTC", :secondarycode "LTC", :primarycode "MST", :marketid "62"}
:XPM/BTC {:label "XPM/BTC", :secondarycode "BTC", :primarycode "XPM", :marketid "63"}
:NAN/BTC {:label "NAN/BTC", :secondarycode "BTC", :primarycode "NAN", :marketid "64"}
:KGC/BTC {:label "KGC/BTC", :secondarycode "BTC", :primarycode "KGC", :marketid "65"}
:ANC/BTC {:label "ANC/BTC", :secondarycode "BTC", :primarycode "ANC", :marketid "66"}
:XNC/LTC {:label "XNC/LTC", :secondarycode "LTC", :primarycode "XNC", :marketid "67"}
:CSC/BTC {:label "CSC/BTC", :secondarycode "BTC", :primarycode "CSC", :marketid "68"}
:EMD/BTC {:label "EMD/BTC", :secondarycode "BTC", :primarycode "EMD", :marketid "69"}
:CGB/BTC {:label "CGB/BTC", :secondarycode "BTC", :primarycode "CGB", :marketid "70"}
:QRK/BTC {:label "QRK/BTC", :secondarycode "BTC", :primarycode "QRK", :marketid "71"}
:DMD/BTC {:label "DMD/BTC", :secondarycode "BTC", :primarycode "DMD", :marketid "72"}
:YBC/BTC {:label "YBC/BTC", :secondarycode "BTC", :primarycode "YBC", :marketid "73"}
:CMC/BTC {:label "CMC/BTC", :secondarycode "BTC", :primarycode "CMC", :marketid "74"}
:ORB/BTC {:label "ORB/BTC", :secondarycode "BTC", :primarycode "ORB", :marketid "75"}
:GLC/BTC {:label "GLC/BTC", :secondarycode "BTC", :primarycode "GLC", :marketid "76"}
:GLX/BTC {:label "GLX/BTC", :secondarycode "BTC", :primarycode "GLX", :marketid "78"}
:HBN/BTC {:label "HBN/BTC", :secondarycode "BTC", :primarycode "HBN", :marketid "80"}
:SPT/BTC {:label "SPT/BTC", :secondarycode "BTC", :primarycode "SPT", :marketid "81"}
:GDC/BTC {:label "GDC/BTC", :secondarycode "BTC", :primarycode "GDC", :marketid "82"}
:STR/BTC {:label "STR/BTC", :secondarycode "BTC", :primarycode "STR", :marketid "83"}
:GME/LTC {:label "GME/LTC", :secondarycode "LTC", :primarycode "GME", :marketid "84"}
:ZET/BTC {:label "ZET/BTC", :secondarycode "BTC", :primarycode "ZET", :marketid "85"}
:PHS/BTC {:label "PHS/BTC", :secondarycode "BTC", :primarycode "PHS", :marketid "86"}
:RED/LTC {:label "RED/LTC", :secondarycode "LTC", :primarycode "RED", :marketid "87"}
:SRC/BTC {:label "SRC/BTC", :secondarycode "BTC", :primarycode "SRC", :marketid "88"}
:NEC/BTC {:label "NEC/BTC", :secondarycode "BTC", :primarycode "NEC", :marketid "90"}
:CPR/LTC {:label "CPR/LTC", :secondarycode "LTC", :primarycode "CPR", :marketid "91"}
:PYC/BTC {:label "PYC/BTC", :secondarycode "BTC", :primarycode "PYC", :marketid "92"}
:ELP/LTC {:label "ELP/LTC", :secondarycode "LTC", :primarycode "ELP", :marketid "93"}
:ADT/LTC {:label "ADT/LTC", :secondarycode "LTC", :primarycode "ADT", :marketid "94"}
:CLR/BTC {:label "CLR/BTC", :secondarycode "BTC", :primarycode "CLR", :marketid "95"}
:DGC/LTC {:label "DGC/LTC", :secondarycode "LTC", :primarycode "DGC", :marketid "96"}
:SXC/LTC {:label "SXC/LTC", :secondarycode "LTC", :primarycode "SXC", :marketid "98"}
:MEC/LTC {:label "MEC/LTC", :secondarycode "LTC", :primarycode "MEC", :marketid "100"}
:PXC/LTC {:label "PXC/LTC", :secondarycode "LTC", :primarycode "PXC", :marketid "101"}
:BUK/BTC {:label "BUK/BTC", :secondarycode "BTC", :primarycode "BUK", :marketid "102"}
:XPM/LTC {:label "XPM/LTC", :secondarycode "LTC", :primarycode "XPM", :marketid "106"}
:TIX/LTC {:label "TIX/LTC", :secondarycode "LTC", :primarycode "TIX", :marketid "107"}
:NET/LTC {:label "NET/LTC", :secondarycode "LTC", :primarycode "NET", :marketid "108"}
:COL/LTC {:label "COL/LTC", :secondarycode "LTC", :primarycode "COL", :marketid "109"}
:ASC/LTC {:label "ASC/LTC", :secondarycode "LTC", :primarycode "ASC", :marketid "111"}
:TEK/BTC {:label "TEK/BTC", :secondarycode "BTC", :primarycode "TEK", :marketid "114"}
:XJO/BTC {:label "XJO/BTC", :secondarycode "BTC", :primarycode "XJO", :marketid "115"}
:LK7/BTC {:label "LK7/BTC", :secondarycode "BTC", :primarycode "LK7", :marketid "116"}
:TAG/BTC {:label "TAG/BTC", :secondarycode "BTC", :primarycode "TAG", :marketid "117"}
:PTS/BTC {:label "PTS/BTC", :secondarycode "BTC", :primarycode "PTS", :marketid "119"}
:Points/BTC {:label "Points/BTC", :secondarycode "BTC", :primarycode "Points", :marketid "120"}
:ANC/LTC {:label "ANC/LTC", :secondarycode "LTC", :primarycode "ANC", :marketid "121"}
:CGB/LTC {:label "CGB/LTC", :secondarycode "LTC", :primarycode "CGB", :marketid "123"}
:FST/LTC {:label "FST/LTC", :secondarycode "LTC", :primarycode "FST", :marketid "124"}
:PPC/LTC {:label "PPC/LTC", :secondarycode "LTC", :primarycode "PPC", :marketid "125"}
:QRK/LTC {:label "QRK/LTC", :secondarycode "LTC", :primarycode "QRK", :marketid "126"}
:ZET/LTC {:label "ZET/LTC", :secondarycode "LTC", :primarycode "ZET", :marketid "127"}
:SBC/LTC {:label "SBC/LTC", :secondarycode "LTC", :primarycode "SBC", :marketid "128"}
:BET/BTC {:label "BET/BTC", :secondarycode "BTC", :primarycode "BET", :marketid "129"}
:TGC/BTC {:label "TGC/BTC", :secondarycode "BTC", :primarycode "TGC", :marketid "130"}
:DEM/BTC {:label "DEM/BTC", :secondarycode "BTC", :primarycode "DEM", :marketid "131"}
:DOGE/BTC {:label "NET/BTC", :secondarycode "BTC", :primarycode "NET", :marketid "134"}
:DOGE/LTC {:label "DOGE/LTC", :secondarycode "LTC", :primarycode "DOGE", :marketid "135"}
:CAT/BTC {:label "CAT/BTC", :secondarycode "BTC", :primarycode "CAT", :marketid "136"}
:LOT/BTC {:label "LOT/BTC", :secondarycode "BTC", :primarycode "LOT", :marketid "137"}
:FFC/BTC {:label "FFC/BTC", :secondarycode "BTC", :primarycode "FFC", :marketid "138"}
:EAC/BTC {:label "EAC/BTC", :secondarycode "BTC", :primarycode "EAC", :marketid "139"}
:ZCC/BTC {:label "ZCC/BTC", :secondarycode "BTC", :primarycode "ZCC", :marketid "140"}
:42/BTC {:label "42/BTC", :secondarycode "BTC", :primarycode "42", :marketid "141"}
:BCX/BTC {:label "BCX/BTC", :secondarycode "BTC", :primarycode "BCX", :marketid "142"}
:RPC/BTC {:label "RPC/BTC", :secondarycode "BTC", :primarycode "RPC", :marketid "143"}
:OSC/BTC {:label "OSC/BTC", :secondarycode "BTC", :primarycode "OSC", :marketid "144"}
:MOON/LTC {:label "MOON/LTC", :secondarycode "LTC", :primarycode "MOON", :marketid "145"}
:TIPS/LTC {:label "TIPS/LTC", :secondarycode "LTC", :primarycode "TIPS", :marketid "147"}
:LEAF/BTC {:label "LEAF/BTC", :secondarycode "BTC", :primarycode "LEAF", :marketid "148"}
:MEOW/BTC {:label "MEOW/BTC", :secondarycode "BTC", :primarycode "MEOW", :marketid "149"}
:CASH/BTC {:label "CASH/BTC", :secondarycode "BTC", :primarycode "CASH", :marketid "150"}
:VTC/BTC {:label "VTC/BTC", :secondarycode "BTC", :primarycode "VTC", :marketid "151"}
:MAX/BTC {:label "MAX/BTC", :secondarycode "BTC", :primarycode "MAX", :marketid "152"}
:SXC/BTC {:label "SXC/BTC", :secondarycode "BTC", :primarycode "SXC", :marketid "153"}
:CACH/BTC {:label "CACH/BTC", :secondarycode "BTC", :primarycode "CACH", :marketid "154"}
:DRK/BTC {:label "DRK/BTC", :secondarycode "BTC", :primarycode "DRK", :marketid "155"}
:MINT/BTC {:label "MINT/BTC", :secondarycode "BTC", :primarycode "MINT", :marketid "156"}
:BEN/BTC {:label "BEN/BTC", :secondarycode "BTC", :primarycode "BEN", :marketid "157"}
:SMC/BTC {:label "SMC/BTC", :secondarycode "BTC", :primarycode "SMC", :marketid "158"}
:NXT/BTC {:label "NXT/BTC", :secondarycode "BTC", :primarycode "NXT", :marketid "159"}
:AUR/BTC {:label "AUR/BTC", :secondarycode "BTC", :primarycode "AUR", :marketid "160"}
:AUR/LTC {:label "AUR/LTC", :secondarycode "LTC", :primarycode "AUR", :marketid "161"}
:NXT/LTC {:label "NXT/LTC", :secondarycode "LTC", :primarycode "NXT", :marketid "162"}
:UTC/BTC {:label "UTC/BTC", :secondarycode "BTC", :primarycode "UTC", :marketid "163"}
:MZC/BTC {:label "MZC/BTC", :secondarycode "BTC", :primarycode "MZC", :marketid "164"}
:FLAP/BTC {:label "FLAP/BTC", :secondarycode "BTC", :primarycode "FLAP", :marketid "165"}
:TAK/BTC {:label "TAK/BTC", :secondarycode "BTC", :primarycode "TAK", :marketid "166"}
:DGB/BTC {:label "DGB/BTC", :secondarycode "BTC", :primarycode "DGB", :marketid "167"}
:SAT/BTC {:label "SAT/BTC", :secondarycode "BTC", :primarycode "SAT", :marketid "168"}
:RDD/BTC {:label "RDD/BTC", :secondarycode "BTC", :primarycode "RDD", :marketid "169"}
:ZED/BTC {:label "ZED/BTC", :secondarycode "BTC", :primarycode "ZED", :marketid "170"}
:FRK/LTC {:label "FRK/LTC", :secondarycode "LTC", :primarycode "FRK", :marketid "171"}
:POT/BTC {:label "POT/BTC", :secondarycode "BTC", :primarycode "POT", :marketid "173"}
:CTM/LTC {:label "CTM/LTC", :secondarycode "LTC", :primarycode "CTM", :marketid "175"}
:ZEIT/LTC {:label "ZEIT/LTC", :secondarycode "LTC", :primarycode "ZEIT", :marketid "176"}
:LYC/BTC {:label "LYC/BTC", :secondarycode "BTC", :primarycode "LYC", :marketid "177"}
:KDC/BTC {:label "KDC/BTC", :secondarycode "BTC", :primarycode "KDC", :marketid "178"}
:BC/BTC {:label "BC/BTC", :secondarycode "BTC", :primarycode "BC", :marketid "179"}
:SPA/BTC {:label "SPA/BTC", :secondarycode "BTC", :primarycode "SPA", :marketid "180"}
:DOGE/USD {:label "DOGE/USD", :secondarycode "USD", :primarycode "DOGE", :marketid "182"}
:EXE/BTC {:label "EXE/BTC", :secondarycode "BTC", :primarycode "EXE", :marketid "183"}
:NYAN/BTC {:label "NYAN/BTC", :secondarycode "BTC", :primarycode "NYAN", :marketid "184"}
:HVC/BTC {:label "HVC/BTC", :secondarycode "BTC", :primarycode "HVC", :marketid "185"}
:BAT/LTC {:label "BAT/LTC", :secondarycode "LTC", :primarycode "BAT", :marketid "186"}
:MN1/BTC {:label "MN1/BTC", :secondarycode "BTC", :primarycode "MN1", :marketid "187"}
:EMC2/BTC {:label "EMC2/BTC", :secondarycode "BTC", :primarycode "EMC2", :marketid "188"}
:MRY/BTC {:label "MRY/BTC", :secondarycode "BTC", :primarycode "MRY", :marketid "189"}
:RBBT/LTC {:label "RBBT/LTC", :secondarycode "LTC", :primarycode "RBBT", :marketid "190"}
:BC/LTC {:label "BC/LTC", :secondarycode "LTC", :primarycode "BC", :marketid "191"}
:FLT/BTC {:label "FLT/BTC", :secondarycode "BTC", :primarycode "FLT", :marketid "192"}
:KARM/LTC {:label "KARM/LTC", :secondarycode "LTC", :primarycode "KARM", :marketid "193"}
:DMC/LTC {:label "DMC/LTC", :secondarycode "LTC", :primarycode "DMC", :marketid "194"}
:WC/BTC {:label "WC/BTC", :secondarycode "BTC", :primarycode "WC", :marketid "195"}
:MN2/BTC {:label "MN2/BTC", :secondarycode "BTC", :primarycode "MN2", :marketid "196"}
:CINNI/BTC {:label "CINNI/BTC", :secondarycode "BTC", :primarycode "CINNI", :marketid "197"}
:COMM/BTC {:label "COMM/BTC", :secondarycode "BTC", :primarycode "COMM", :marketid "198"}})