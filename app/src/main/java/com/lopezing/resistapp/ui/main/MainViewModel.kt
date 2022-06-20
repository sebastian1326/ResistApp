package com.lopezing.resistapp.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lopezing.resistapp.R
import kotlin.math.pow

class MainViewModel : ViewModel( ) {
    private val sumt1: MutableLiveData<String> = MutableLiveData()
    val sumtdata: LiveData<String> = sumt1
    private val coloritems: MutableLiveData<Int> = MutableLiveData()
    val colordata: LiveData<Int> = coloritems
    private var coloritem=0
    private var ban1=0
    private var ban2=0
    private var ban3=0
    private var sumt=0.0
    private var z1=10
    fun coloA(x:Int,y:Int,z:Int){
        when(x){
            0 -> {
                coloritem=R.color.black
            }
            1 -> {coloritem=R.color.maroon
            }
            2 -> {
                coloritem=R.color.red
            }
            3 -> {coloritem=R.color.orange
            }
            4 -> {coloritem=R.color.yellow
            }
            5 -> {coloritem=R.color.lime
            }
            6 -> {coloritem=R.color.blue
            }
            7 -> {coloritem=R.color.purple
            }
            8 -> {coloritem=R.color.gray
            }
            9 -> {coloritem=R.color.silver
            }
            else -> {R.color.white}
        }
        coloritems.value=coloritem
        when(y){
            1->ban1=x
            2->ban2=x
            3->ban3=x
        }
        z1=z
        most()

    }
    fun most() {
        sumt = (((ban1 * 10) + (ban2) )* (10.0.pow(ban3)))
        if (sumt<1000){
            sumt1.value=sumt.toString()+"Ω "+"  ±"+z1.toString()+" %"
        }else{
            sumt/=1000
            sumt1.value=sumt.toString()+"KΩ "+"  ±"+z1.toString()+" %"
        }

    }
}