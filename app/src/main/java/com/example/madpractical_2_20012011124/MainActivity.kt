package com.example.madpractical_2_20012011124

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import javax.net.ssl.SNIServerName

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate function called")
    }
    private fun showMessage(msg:String){
        Log.i(TAG,msg)
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.main_constraint_layout),msg,Snackbar.LENGTH_SHORT).show()
    }

    override fun onResume() {
        showMessage("onResume function called.")
        super.onResume()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"onRestart function called")
        Toast.makeText(this,"onRestart function called",Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.main_constraint_layout),"onRestart function called",Snackbar.LENGTH_SHORT).show()

    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"onPause function called")
        Toast.makeText(this,"onPause function called",Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.main_constraint_layout),"onPause function called",Snackbar.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"onPause function called")
        Toast.makeText(this,"onPause function called",Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.main_constraint_layout),"onPause function called",Snackbar.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"onDestroy function called")
        Toast.makeText(this,"onDestroy function called",Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.main_constraint_layout),"onDestroy function called",Snackbar.LENGTH_SHORT).show()
    }
}