package com.example.franchteacherapp

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.MediaController
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }

    @SuppressLint("SuspiciousIndentation")
    fun SayTheColor(view: View){
        val clickbtn:Button= view as Button

        var mediaPlayer: MediaPlayer= MediaPlayer.create(this,
            resources.getIdentifier(
            clickbtn.tag.toString(),
            "raw",packageName
            )
        )
            mediaPlayer.start()

    }


}