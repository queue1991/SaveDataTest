package com.hsj.savedatatest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClicked(view : View){
        var nextIntent : Intent? = null

        when(view.id){

            R.id.btn_save_instance_state -> {
                nextIntent = Intent(this, SavedInstanceStateTestActivity::class.java)
            }

        }

        startActivity(nextIntent)
    }
}