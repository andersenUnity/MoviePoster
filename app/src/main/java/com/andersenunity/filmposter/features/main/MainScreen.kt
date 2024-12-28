package com.andersenunity.filmposter.features.main

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import com.andersenunity.filmposter.features.main.ui.MoviesColumn
import com.andersenunity.filmposter.features.main.ui.GetGenres
import com.andersenunity.filmposter.models.Movie
import com.andersenunity.filmposter.models.testMoviesList

data class MainScreen(val movieList: List<Movie>) : Screen {
    @Composable
    override fun Content() {
        testMoviesList.forEach{ println( it.isLiked)}
        val context = LocalContext.current
        LazyColumn(modifier = Modifier.background(color = Color.LightGray).padding(bottom = 20.dp)) {
            item {
                GetGenres()
            }
            item {
                MoviesColumn(movieList)
            }
        }
    }
}