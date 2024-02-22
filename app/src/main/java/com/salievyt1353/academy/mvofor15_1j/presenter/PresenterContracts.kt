package com.salievyt1353.academy.mvofor15_1j.presenter

class PresenterContracts {

    interface CounterView{
        fun updateCounter(counter:Int)
        fun toast5()
        fun color10()
        fun isColorLess10()
    }
    interface CounterPresenter1{
        fun colorLess10()
        fun toast()
        fun color1()
        fun pluss()
        fun minuss()
        fun attachView(view:CounterView)
    }
}