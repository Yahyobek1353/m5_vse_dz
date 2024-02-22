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
    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: CounterPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
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
            with(presenter) {
                minuss()
                toast()
                color1()
                colorLess10()
            }
        }
    }

    override fun updateCounter(counter: Int) {
        binding.tvResult.text = counter.toString()
    }

    override fun toast5() {
        Toast.makeText(this, "Вы достигли до 5", Toast.LENGTH_SHORT).show()
    }

    @SuppressLint("ResourceAsColor")
    override fun color10() {
        binding.tvResult.setTextColor(Color.GREEN)
    }

    @SuppressLint("ResourceAsColor")
    override fun isColorLess10() {
        binding.tvResult.setTextColor(R.color.black)
    }
}