package com.salievyt1353.academy.mvofor15_1j.presenter

import android.widget.Toast
import android.widget.Toast.makeText
import com.salievyt1353.academy.mvofor15_1j.data.CounterModel

class CounterPresenter(
    private val model :CounterModel
) :PresenterContracts.CounterPresenter1 {
    private lateinit var  counterView: PresenterContracts.CounterView
    override fun colorLess10() {
        if (model.count<10){
            counterView.isColorLess10()
        }
    }

    override fun toast() {
        if (model.count ==5){
            counterView.toast5()
        }
    }

    override fun color1() {
        if (model.count ==10){
            counterView.color10()
        }
    }

    override fun pluss() {
        model.plus()
        counterView.updateCounter(model.count)
    }

    override fun minuss() {
        model.minus()
        counterView.updateCounter(model.count)
    }



    override fun attachView(view: PresenterContracts.CounterView) {
        this.counterView = view
    }
}