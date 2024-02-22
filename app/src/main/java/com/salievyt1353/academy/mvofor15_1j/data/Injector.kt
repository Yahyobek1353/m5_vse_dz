package com.salievyt1353.academy.mvofor15_1j.data

import com.salievyt1353.academy.mvofor15_1j.presenter.CounterPresenter

class Injector {
    companion object{
        fun getPresenter():CounterPresenter{
            return CounterPresenter(CounterModel())
        }
    }
}