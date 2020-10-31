package com.test.motionlayoutdemo

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import androidx.constraintlayout.motion.widget.MotionLayout
import com.google.android.material.appbar.AppBarLayout

class MotionToolBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : MotionLayout(context, attrs, defStyleAttr), AppBarLayout.OnOffsetChangedListener {

    override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {
        Log.e("MotionToolBar", "onOffsetChanged: ----->$verticalOffset, scroll range--> ${appBarLayout?.totalScrollRange}")
        val seekPosition = -verticalOffset / (appBarLayout?.totalScrollRange!!.toFloat()/5*3)
        progress = seekPosition
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        (parent as? AppBarLayout)?.addOnOffsetChangedListener(this)
    }
}