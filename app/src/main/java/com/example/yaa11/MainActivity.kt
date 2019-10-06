package com.example.yaa11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yaa11.AnimationScreen.Companion.MANMOD
import com.example.yaa11.AnimationScreen.Companion.SPEAKING

class MainActivity : AppCompatActivity() {
    val ADAM = "-אדם-"
    val GOD = "-אלוהים-"

    lateinit var godList: ArrayList<String>
    lateinit var manList: ArrayList<String>
    private var round = 0
    private var manMode = true



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getData()

        sendData()
    }


    private fun sendData() {
        val intent1=Intent(this,AnimationScreen::class.java)


        intent1.putStringArrayListExtra(AnimationScreen.MANNL,manList)
        intent1.putStringArrayListExtra(AnimationScreen.GODDL,godList)

      /*  // round=1
        if (manMode) {
            intent1.putExtra(SPEAKING,manList[round])

           // operateMan(manList[round])
            manMode = false
        } else {
            intent1.putExtra(SPEAKING,godList[round])
            // operateGoddy(godList[round])
            round++
            manMode = true
        }*/

        startActivity(intent1)
    }

    private fun getData() {
        var text = applicationContext.assets.open("text10.txt").bufferedReader().use {
            it.readText()
        }
        text = text.replace("\r", "")
        godList = arrayListOf()
        manList = arrayListOf()
        var list1 = text.split(ADAM)
        for (element in list1) {
            if (element != "" && element.length > 15) {
                var list2 = element.split(GOD)
                val st1 = improveString(list2[1])
                val st2 = improveString(list2[0])
                godList.add(st1)
                manList.add(st2)
            }
        }

    }
    private fun improveString(st: String) = st.substring(1, st.length - 1)

}
