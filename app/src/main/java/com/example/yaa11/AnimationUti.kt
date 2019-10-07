package com.example.yaa11

import android.content.res.Resources
import android.graphics.Color
import android.util.TypedValue
import android.view.Gravity
import android.widget.TextView
import com.github.florent37.viewanimator.ViewAnimator

class AnimationUti {
    val wi = Resources.getSystem().displayMetrics.widthPixels.toFloat()
    val hi = Resources.getSystem().displayMetrics.heightPixels.toFloat()

    fun styleItGod10(tv: TextView, st: String): TextView {
        var textView = tv
        textView.text = st
        textView.setBackgroundColor(Color.YELLOW)
        textView.setTextColor(Color.parseColor("#bdbdbd"))
        textView.setPadding(20, 0, 20, 0)
        return textView
    }

    fun styleItGod11(tv: TextView, st: String): TextView {
        var textView = tv
        textView.text = st
        textView.setBackgroundColor(Color.CYAN)
        textView.setTextColor(Color.parseColor("#bdbdbd"))
        textView.setPadding(20, 0, 20, 0)
        return textView
    }


    fun godTranslaion10(arr: List<String>, textView1: TextView, textView2: TextView) {
        val textView10 = styleItGod10(textView1, arr[0])
        val textView20 = styleItGod10(textView2, arr[0])
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


    fun manTranslation10(arr: List<String>, textView1: TextView) {

        val textView10=styleMan20(textView1,arr[0])
        ViewAnimator
            .animate(textView10)
            .translationX(-wi / 2, 0f)
            .translationY(-hi, 0f)
            .scale(0f, 1f)
            .duration(2000)
            .start()
    }

    fun godTranslation20(arr: List<String>, textView1: TextView, textView2: TextView) {

        val textView10=styleItGod11(textView1,arr[1])
        val textView11=styleItGod11(textView2,arr[0])
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
    fun godTranslaion30(
        arr: List<String>, textView1: TextView, textView2: TextView,textView3: TextView) {
        val textView10 = styleItGod11(textView1, arr[2])
        val textView11 = styleItGod11(textView2, arr[1])
        val textView12 = styleItGod11(textView3, arr[0])
        var dur = 1000L

        ViewAnimator
            .animate(textView10, textView11, textView12)
            .scale(0f)
            .duration(1)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(1f, 0f, 1f)
            .duration(dur)
            .start()
    }
    fun godTranslaion40(
        arr: List<String>, textView1: TextView, textView2: TextView,textView3: TextView, textView4: TextView) {
        val textView10 = styleItGod11(textView1, arr[3])
        val textView11 = styleItGod11(textView2, arr[2])
        val textView12 = styleItGod11(textView3, arr[1])
        val textView13 = styleItGod11(textView4, arr[0])
        var dur = 1000L

        ViewAnimator
            .animate(textView10, textView11, textView12, textView13)
            .scale(0f)
            .duration(1)
            .thenAnimate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(1f, 0f, 1f)
            .duration(dur)
            .start()
    }
    fun godTranslaion50(
        arr: List<String>, textView1: TextView, textView2: TextView,textView3: TextView, textView4: TextView, textView5: TextView
    ) {
        val textView10 = styleItGod11(textView1, arr[4])
        val textView11 = styleItGod11(textView2, arr[3])
        val textView12 = styleItGod11(textView3, arr[2])
        val textView13 = styleItGod11(textView4, arr[1])
        val textView14 = styleItGod11(textView5, arr[0])
        var dur = 1000L

        ViewAnimator
            .animate(textView10, textView11, textView12, textView13, textView14)
            .scale(0f)
            .duration(1)
            .thenAnimate(textView14)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(1f, 0f, 1f)
            .duration(dur)
            .start()
    }




    private fun styleMan20(tv: TextView, st:String): TextView {
        var textView=tv;
        textView.text=st
        textView.setBackgroundColor(Color.DKGRAY)
        textView.setTextColor(Color.WHITE)
        textView.setPadding(30, 0, 30, 0)
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20f)
        textView.gravity = Gravity.HORIZONTAL_GRAVITY_MASK
        return textView
    }

    fun manTranslation20(arr: List<String>, textView1: TextView, textView2: TextView) {

        val textView10=styleMan20(textView1,arr[1])
        val textView11=styleMan20(textView2,arr[0])
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
    fun manTranslaion30(
        arr: List<String>, textView1: TextView, textView2: TextView,textView3: TextView) {
        val textView10 = styleMan20(textView1, arr[2])
        val textView11 = styleMan20(textView2, arr[1])
        val textView12 = styleMan20(textView3, arr[0])
        var dur = 1000L

        ViewAnimator
            .animate(textView10, textView11, textView12)
            .scale(0f)
            .duration(1)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(1f, 0f, 1f)
            .duration(dur)
            .start()
    }
    fun manTranslaion40(
        arr: List<String>, textView1: TextView, textView2: TextView,textView3: TextView, textView4: TextView) {
        val textView10 = styleMan20(textView1, arr[3])
        val textView11 = styleMan20(textView2, arr[2])
        val textView12 = styleMan20(textView3, arr[1])
        val textView13 = styleMan20(textView4, arr[0])
        var dur = 1000L

        ViewAnimator
            .animate(textView10, textView11, textView12, textView13)
            .scale(0f)
            .duration(1)
            .thenAnimate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(1f, 0f, 1f)
            .duration(dur)
            .start()
    }
    fun manTranslaion50(
        arr: List<String>, textView1: TextView, textView2: TextView,textView3: TextView, textView4: TextView, textView5: TextView
    ) {
        val textView10 = styleMan20(textView1, arr[4])
        val textView11 = styleMan20(textView2, arr[3])
        val textView12 = styleMan20(textView3, arr[2])
        val textView13 = styleMan20(textView4, arr[1])
        val textView14 = styleMan20(textView5, arr[0])
        var dur = 1000L

        ViewAnimator
            .animate(textView10, textView11, textView12, textView13, textView14)
            .scale(0f)
            .duration(1)
            .thenAnimate(textView14)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(1f, 0f, 1f)
            .duration(dur)
            .start()
    }


}