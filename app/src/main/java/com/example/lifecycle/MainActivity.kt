package com.example.lifecycle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.lifecycle.ui.theme.LifeCycleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            println("OnCreate process start")
            LifeCycleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        println("OnStart process start")
    }

    override fun onResume() {
        super.onResume()
        println("OnResume process start")
    }

    override fun onPause() {
        super.onPause()
        println("OnPause process start")
    }

    override fun onStop() {
        super.onStop()
        println("OnStop process start")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("OnDestroy process start")
    }
}