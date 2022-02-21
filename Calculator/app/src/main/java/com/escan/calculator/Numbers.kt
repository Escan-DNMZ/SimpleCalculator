package com.escan.calculator

class Numbers(var _Number1:Int?,var _Number2:Int?) {
    var sum = _Number1!! + _Number2!!
    var sub = _Number1!! - _Number2!!
    var multi = _Number1!! * _Number2!!
    var div = _Number1!! / _Number2!!
    var pow = Math.pow(_Number1!!.toDouble(),_Number2!!.toDouble())

}