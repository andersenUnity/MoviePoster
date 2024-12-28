package com.andersenunity.filmposter


import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Scaffold
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import com.andersenunity.filmposter.features.main.MainScreen
import com.andersenunity.filmposter.features.movie.MovieScreen
import com.andersenunity.filmposter.models.testMoviesList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        testMoviesList.forEach{ println( it.isLiked)}
        setContent {
            Navigator(MainScreen(testMoviesList))
        }
    }
}







