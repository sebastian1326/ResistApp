package com.lopezing.resistapp

import android.app.Activity
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.toColor
import com.lopezing.resistapp.databinding.ActivityMainBinding
import kotlin.math.pow

class MainActivity : Activity() {
    private lateinit var mainBinding: ActivityMainBinding
    private var ban1: Double=0.0
    private var lin1=0
    private var col=10
    private var ban2: Double=0.0
    private var ban3: Double=0.0
    private var sumt: Double=0.0
    private var sumt1: Int=0
    private fun most() {
        sumt = (((ban1 * 10) + (ban2) )* (10.0.pow(ban3)))
        sumt1=sumt.toInt()
        mainBinding.textV.text = sumt1.toString()+"Ω "+"  ±"+col.toString()+" %"
    }
    private  fun Acol3(){
        when(lin1){
            0 -> mainBinding.button3.setBackgroundResource(R.color.black)
            1 -> mainBinding.button3.setBackgroundResource(R.color.maroon)
            2 -> mainBinding.button3.setBackgroundResource(R.color.red)
            3 -> mainBinding.button3.setBackgroundResource(R.color.orange)
            4 -> mainBinding.button3.setBackgroundResource(R.color.yellow)
            5 -> mainBinding.button3.setBackgroundResource(R.color.lime)
            6 -> mainBinding.button3.setBackgroundResource(R.color.blue)
            7 -> mainBinding.button3.setBackgroundResource(R.color.purple)
            8 -> mainBinding.button3.setBackgroundResource(R.color.gray)
            9 -> mainBinding.button3.setBackgroundResource(R.color.silver)
        }
    }
    private  fun Acol2(){
        when(lin1){
            0 -> mainBinding.button2.setBackgroundResource(R.color.black)
            1 -> mainBinding.button2.setBackgroundResource(R.color.maroon)
            2 -> mainBinding.button2.setBackgroundResource(R.color.red)
            3 -> mainBinding.button2.setBackgroundResource(R.color.orange)
            4 -> mainBinding.button2.setBackgroundResource(R.color.yellow)
            5 -> mainBinding.button2.setBackgroundResource(R.color.lime)
            6 -> mainBinding.button2.setBackgroundResource(R.color.blue)
            7 -> mainBinding.button2.setBackgroundResource(R.color.purple)
            8 -> mainBinding.button2.setBackgroundResource(R.color.gray)
            9 -> mainBinding.button2.setBackgroundResource(R.color.silver)
        }
    }
    private  fun Acol1(){
        when(lin1){
            0 -> mainBinding.button1.setBackgroundResource(R.color.black)
            1 -> mainBinding.button1.setBackgroundResource(R.color.maroon)
            2 -> mainBinding.button1.setBackgroundResource(R.color.red)
            3 -> mainBinding.button1.setBackgroundResource(R.color.orange)
            4 -> mainBinding.button1.setBackgroundResource(R.color.yellow)
            5 -> mainBinding.button1.setBackgroundResource(R.color.lime)
            6 -> mainBinding.button1.setBackgroundResource(R.color.blue)
            7 -> mainBinding.button1.setBackgroundResource(R.color.purple)
            8 -> mainBinding.button1.setBackgroundResource(R.color.gray)
            9 -> mainBinding.button1.setBackgroundResource(R.color.silver)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view=mainBinding.root
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
                ban1 = lin1.toDouble()
                if(lin1==0) {
                    button1.setTextColor(getResources().getColor(R.color.lime))
                }else button1.setTextColor(getResources().getColor(R.color.black))
                most()
                Acol1()

            }
            button2.setOnClickListener {
                ban2 = lin1.toDouble()
                if(lin1==0) {
                    button2.setTextColor(getResources().getColor(R.color.lime))
                }else button2.setTextColor(getResources().getColor(R.color.black))
                most()
                Acol2()
            }
            button3.setOnClickListener {
                ban3 = lin1.toDouble()
                if(lin1==0) {
                    button3.setTextColor(getResources().getColor(R.color.lime))
                }else button3.setTextColor(getResources().getColor(R.color.black))
                most()
                Acol3()
            }
            buttonP.setOnClickListener {
                col=10
                most()
            }
            buttonD.setOnClickListener {
                col=5
                most()
            }
        }
    }
}