package com.salievyt1353.academy.mvofor15_1j.ui

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.salievyt1353.academy.mvofor15_1j.R
import com.salievyt1353.academy.mvofor15_1j.data.Injector
import com.salievyt1353.academy.mvofor15_1j.databinding.ActivityMainBinding
import com.salievyt1353.academy.mvofor15_1j.presenter.CounterPresenter
import com.salievyt1353.academy.mvofor15_1j.presenter.PresenterContracts

class MainActivity : AppCompatActivity(), PresenterContracts.CounterView {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private lateinit var presenter: CounterPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        presenter = Injector.getPresenter()
        presenter.attachView(this)
        initListners()

    }
    private fun initListners(){
        binding.btnPlus.setOnClickListener{
            presenter.pluss()
            presenter.toast()
            presenter.color1()
            presenter.colorLess10()
        }
        binding.btnMinus.setOnClickListener{
            presenter.minuss()
            presenter.color1()
            presenter.toast()
            presenter.colorLess10()

        }
    }
    override fun updateCounter(counter:Int){
        binding.tvResult.text = counter.toString()
    }

    override fun toast5() {
        Toast.makeText(this,"count 5",Toast.LENGTH_SHORT).show()
    }

    override fun color10() {
        binding.tvResult.setTextColor(Color.RED)
    }

    override fun isColorLess10() {
        binding.tvResult.setTextColor(Color.BLACK)
    }


}