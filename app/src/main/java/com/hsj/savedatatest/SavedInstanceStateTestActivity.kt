package com.hsj.savedatatest

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


/**
 * The Bundle is a container for all the information you want to save.
 * You use the put*** functions to insert data into it
 *
 * putString
 * putBoolean
 * putByte
 * putChar
 * putFloat
 * putLong
 * putShort
 * putParcelable (used for objects but they must implement Parcelable)
 *
 * onRestoreInstanceState() is called only when recreating activity after it was killed by the OS.
 * Such situation happen when:
 * orientation of the device changes (your activity is destroyed and recreated)
 * there is another activity in front of yours and at some point the OS kills your activity in order to free memory (for example).
 * Next time when you start your activity onRestoreInstanceState() will be called.
 */
class SavedInstanceStateTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved_instance)

        if (savedInstanceState != null) {
            // Then the application is being reloaded
            val message = savedInstanceState.getString("message")
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("message", "This is my message to be reloaded");
        Log.d(javaClass.name,"Testsetsetset onRestoreInstanceState")

        super.onSaveInstanceState(outState);
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(javaClass.name,"Testsetsetset onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
    }
}