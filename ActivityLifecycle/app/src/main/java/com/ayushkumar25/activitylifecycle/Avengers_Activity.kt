package com.ayushkumar25.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Avengers_Activity : AppCompatActivity() {

    var titleName: String? ="Avenger"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avengers)

        if(intent != null){
            titleName = intent.getStringExtra("Name")
        }

        title = titleName
    }


}
