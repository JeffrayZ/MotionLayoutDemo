package com.test.motionlayoutdemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import com.google.android.material.appbar.CollapsingToolbarLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        setContentView(R.layout.demo1_main)
//        setContentView(R.layout.demo2_main)
//        setContentView(R.layout.demo3_main)
//        setContentView(R.layout.demo4_main)
//        setContentView(R.layout.demo5_main)
//        setContentView(R.layout.demo6_main)
//        setContentView(R.layout.demo7_main)
//        setContentView(R.layout.demo8_main)
//        setContentView(R.layout.demo9_main)
//        setContentView(R.layout.demo10_main)
//        setContentView(R.layout.demo11_main)
//        setContentView(R.layout.demo12_main)
//        initDemo13()
//        setContentView(R.layout.demo14_main)
        initDemo15()
    }

    private fun initDemo15() {
        setContentView(R.layout.demo15_main)
        val motionLayout = findViewById<MotionLayout>(R.id.motionLayout15)
//        motionLayout.addTransitionListener(object :MotionLayout.TransitionListener{
//            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
//                TODO("Not yet implemented")
//            }
//        })

        motionLayout.setTransitionListener(object :MotionLayout.TransitionListener{
            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
                Log.e("motionLayout15","onTransitionStarted>>>>> $p1:::$p2")
            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
                Log.e("motionLayout15","onTransitionChange>>>>> $p1:::$p2:::$p3")
            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                Log.e("motionLayout15","onTransitionCompleted>>>>> $p1")
                p0?.progress = 0f
            }

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
                Log.e("motionLayout15","onTransitionTrigger>>>>> $p1:::$p2:::$p3")
            }

        })
    }

    /**
     * 这就是一个最基本的toolbar实现，没有用到 MotionLayout
     * */
    private fun initDemo13() {
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(findViewById(R.id.toolbar))
        findViewById<CollapsingToolbarLayout>(R.id.toolbar_layout).title = title
    }
}