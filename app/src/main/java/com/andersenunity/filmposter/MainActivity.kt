package com.andersenunity.filmposter


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import cafe.adriel.voyager.navigator.Navigator
import com.andersenunity.filmposter.features.main.MainScreen
import com.andersenunity.filmposter.features.movie.MovieScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigator(MainScreen())
        }
    }
}







