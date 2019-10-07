package com.example.yaa11

import android.content.res.Resources
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_animation_screen.*

class AnimationScreen : AppCompatActivity() {
    companion object {
        const val MANNL = "manl"
        const val GODDL = "godl"
        const val MANMOD = "manmode"
        const val SPEAKING = "speaking"

    }

    lateinit var godList: ArrayList<String>
    lateinit var manList: ArrayList<String>
    var manMode = true
    //var sevev = 0
    var sevev = 0

    val wi = Resources.getSystem().displayMetrics.widthPixels.toFloat()
    val hi = Resources.getSystem().displayMetrics.heightPixels.toFloat()
    lateinit var animationUti: AnimationUti


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_screen)
        animationUti = AnimationUti()
        manList = intent.getStringArrayListExtra(MANNL)
        godList = intent.getStringArrayListExtra(GODDL)
        generalOperation()

        goddy.setOnClickListener {
            if (!manMode) {
                generalOperation()
                manMode = true
            } else {
                Toast.makeText(this, "נסה שוב, זה התור של האדם לדבר", Toast.LENGTH_LONG).show()
            }
        }

        man.setOnClickListener {
            //operateMan(manList[round])
            if (manMode) {
                generalOperation()
                manMode = false
            } else {
                Toast.makeText(this, "נסה שוב, זה התור של האין סוף להגיב", Toast.LENGTH_LONG).show()

            }

        }
    }

    private fun generalOperation() {

        var speaking = ""
        if (manMode) {
            //Its man position
            speaking = manList[sevev]
            operateMan(speaking)
            manMode = false
        } else {
            // lts God position
            speaking = godList[sevev]
            operateGoddy(speaking)
            manMode = true
            sevev++

        }
    }


    private fun operateGoddy(st: String) {
        var arr = st.split("\n")


        when (arr.size) {

            1 -> animationUti.godTranslaion10(arr, godSpeaking1, godSpeaking1A)

            2 -> animationUti.godTranslation20(arr, godSpeaking1, godSpeaking2)

            3 -> animationUti.godTranslaion30(arr, godSpeaking1, godSpeaking2, godSpeaking3)

            4 -> animationUti.godTranslaion40(
                arr,
                godSpeaking1,
                godSpeaking2,
                godSpeaking3,
                godSpeaking4
            )

            5 -> animationUti.godTranslaion50(
                arr,
                godSpeaking1,
                godSpeaking2,
                godSpeaking3,
                godSpeaking4,
                godSpeaking5
            )


        }
    }

    private fun operateMan(st: String) {
        val arr = st.split("\n")
        when (arr.size) {

            1 -> animationUti.manTranslation10(arr, manSpeaking1)

            2 -> animationUti.manTranslation20(arr, manSpeaking1, manSpeaking2)

            3 -> animationUti.manTranslaion30(arr, manSpeaking1, manSpeaking2, manSpeaking3)

            4 -> animationUti.manTranslaion40(
                arr,
                manSpeaking1,
                manSpeaking2,
                manSpeaking3,
                manSpeaking4
            )

            5 -> animationUti.manTranslaion50(
                arr,
                manSpeaking1,
                manSpeaking2,
                manSpeaking3,
                manSpeaking4,
                manSpeaking5
            )


        }

    }


}
