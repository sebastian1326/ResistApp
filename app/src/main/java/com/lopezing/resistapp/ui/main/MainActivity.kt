package com.lopezing.resistapp.ui.main

import android.app.Activity
import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.graphics.toColor
import androidx.lifecycle.ViewModelProvider
import com.lopezing.resistapp.R
import com.lopezing.resistapp.databinding.ActivityMainBinding
import com.lopezing.resistapp.ui.ajust.AjustActivity
import kotlin.math.pow
private lateinit var mainBinding: ActivityMainBinding
private lateinit var mainViewModel: MainViewModel
class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel
    private var ban1: Double=0.0
    private var lin1=0
    private var col=10
    private var colod1=1
    private var ban2: Double=0.0
    private var ban3: Double=0.0
    private var sumt: Double=0.0
    private var sumt1: Int=0
    private fun most() {
        sumt = (((ban1 * 10) + (ban2) )* (10.0.pow(ban3)))
        sumt1=sumt.toInt()

    }


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view=mainBinding.root
        mainViewModel= ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.colordata.observe(this) { colod ->
            colod1=colod
        }
        mainViewModel.sumtdata.observe(this){tot->
            mainBinding.textV.text =tot
        }
        setContentView(view)

        with(mainBinding) {
            buttonB.setOnClickListener {
                lin1=0
            }
            buttonC.setOnClickListener {
                lin1=1
            }
            buttonR.setOnClickListener {
                lin1=2
            }
            buttonN.setOnClickListener {
                lin1=3
            }
            buttonY.setOnClickListener {
                lin1=4
            }
            buttonV.setOnClickListener {
                lin1=5
            }
            buttonA.setOnClickListener {
                lin1=6
            }
            buttonM.setOnClickListener {
                lin1=7
            }
            buttonG.setOnClickListener {
                lin1=8
            }
            buttonW.setOnClickListener {
                lin1=9
            }
            button1.setOnClickListener {
                //ban1 = lin1.toDouble()
                mainViewModel.coloA(lin1,1,col)
                mainBinding.button1.setBackgroundResource(colod1)
            }
            button2.setOnClickListener {
                mainViewModel.coloA(lin1,2,col)
                mainBinding.button2.setBackgroundResource(colod1)
            }
            button3.setOnClickListener {
                mainViewModel.coloA(lin1,3,col)
                mainBinding.button3.setBackgroundResource(colod1)
            }
            buttonP.setOnClickListener {
                col=10
            }
            buttonD.setOnClickListener {
                col=5
            }
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.ajustes,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.ajust){
            iniciarAjust()
        }
        return true
    }

    private fun iniciarAjust() {
        val intent =Intent(this, AjustActivity::class.java)
        startActivity(intent)
    }
}