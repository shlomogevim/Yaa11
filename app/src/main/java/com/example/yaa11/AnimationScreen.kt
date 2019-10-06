package com.example.yaa11

import android.content.res.Resources
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.view.Gravity
import android.widget.TextView
import com.github.florent37.viewanimator.ViewAnimator
import kotlinx.android.synthetic.main.activity_animation_screen.*

class AnimationScreen : AppCompatActivity() {
    companion object{
        const val MANMOD="manmode"
        const val SPEAKING="speaking"
    }

    val wi = Resources.getSystem().displayMetrics.widthPixels.toFloat()
    val hi = Resources.getSystem().displayMetrics.heightPixels.toFloat()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_screen)
        generalOperation()
    }

    private fun generalOperation() {

        var manMode=intent.getBooleanExtra(MANMOD,false)
        var speaking=intent.getStringExtra(SPEAKING)

        if (manMode) {
            //Its man position
            operateMan(speaking)
        } else {
            // lts God position
            operateGoddy(speaking)
        }
    }

    fun styleItGod10(tv: TextView, st: String): TextView {
        var textView = tv
        textView.text = st
        textView.setBackgroundColor(Color.YELLOW)
        textView.setTextColor(Color.parseColor("#bdbdbd"))
        textView.setPadding(20, 0, 20, 0)
        return textView
    }


    fun godTranslaion10(arr: List<String>) {
        val textView10 = styleItGod10(godSpeaking1, arr[0])
        val textView20 = styleItGod10(godSpeaking1A, arr[0])
        ViewAnimator
            .animate(textView10)
            .translationX(-wi / 2, 0f)
            .translationY(hi, 0f)
            .scale(0f, 2f)
            .andAnimate(textView20)
            .translationX(wi / 2, 0f)
            .translationY(hi, 0f)
            .scale(0f, 2f)
            .duration(2000)
            .start()
    }


    private fun operateGoddy(st: String) {
        var arr=st.split("\n")


        when (arr.size) {

            1 -> godTranslaion10(arr)


        }
    }
    private fun operateMan(st: String) {
        val arr = st.split("\n")
        when (arr.size) {

            2 -> manTranslation20(arr)


        }

    }

    private fun styleMan20(tv:TextView,st:String):TextView{
        var textView=tv;
        textView.text=st
        textView.setBackgroundColor(Color.DKGRAY)
        textView.setTextColor(Color.WHITE)
        textView.setPadding(30, 0, 30, 0)
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20f)
        textView.gravity = Gravity.HORIZONTAL_GRAVITY_MASK
        return textView
    }

    private fun manTranslation20(arr: List<String>) {

        val textView10=styleMan20(manSpeaking1,arr[1])
        val textView11=styleMan20(manSpeaking2,arr[0])
        ViewAnimator
            .animate(textView11)
            .alpha(1f, 0f)
            .duration(1)

            .thenAnimate(textView10)
            .translationX(-wi / 2, 0f)
            .translationY(-hi, 0f)
            .scale(0f, 1f)

            .thenAnimate(textView11)
            .alpha(0f, 1f)
            .duration(1)
            .translationX(wi / 2, 0f)
            .translationY(-hi, 0f)
            .duration(2000)
            .start()
    }






}
