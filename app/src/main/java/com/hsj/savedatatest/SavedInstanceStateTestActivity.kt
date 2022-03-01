package com.hsj.savedatatest

import android.os.Bundle
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
 */
class SavedInstanceStateTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null) {
            // Then the application is being reloaded
            val message = savedInstanceState.getString("message")
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("message", "This is my message to be reloaded");
        super.onSaveInstanceState(outState);
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }
}