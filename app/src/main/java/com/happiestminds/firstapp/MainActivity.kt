package com.happiestminds.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val TAG="MainActivity"
    //once per activity instance
    //executed by ActivityManager, one per instance

    //super execution mandatory for all life-cycle method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG," onCreate Executed")

    }

    override fun onStart(){
        super.onStart()
        backCount=0
        Log.d(TAG,"onStart executed")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG,"onResume executed")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause executed")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"OnDestroy executed")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart executed")

    }

    var backCount=0
    override fun onBackPressed() {
        backCount++

    if(backCount==2) {
        //backcount=0(instead of this we can go to onstart n set)
        super.onBackPressed() //activity is invisible
    }else{
        Toast.makeText(this,"Please press 'back' again to exit",Toast.LENGTH_LONG).show()

    }

    }
}