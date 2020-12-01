package com.example.liao_common_utils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.liaoutils.dialog.NormalDialogUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aa = NormalDialogUtil()
        aa.setDialogTitle("sss")
        aa.getPositiveDialog(this, "aa", "ss") { _,_->
            Log.d("asd","asd")
        }.show()
    }
}