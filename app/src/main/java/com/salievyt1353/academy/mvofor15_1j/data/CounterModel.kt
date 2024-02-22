package com.salievyt1353.academy.mvofor15_1j.data

data class CounterModel(
    var count: Int = 0
) {

    fun plus() {
        count ++
    }
    fun minus(){
        count --
    }
}
