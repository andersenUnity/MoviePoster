package com.andersenunity.filmposter.features.main

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import com.andersenunity.filmposter.features.main.ui.BottomBar
import com.andersenunity.filmposter.features.main.ui.MoviesColumn
import com.andersenunity.filmposter.features.main.ui.GetGenres
import com.andersenunity.filmposter.models.Movie
import com.andersenunity.filmposter.models.testMoviesList
import com.andersenunity.filmposter.ui.theme.robotoFamily

data class MainScreen(val movieList: List<Movie>) : Screen {
    @Composable
    override fun Content() {
        testMoviesList.forEach { println(it.isLiked) }
        val context = LocalContext.current
        Box(modifier = Modifier.padding(), contentAlignment = Alignment.BottomEnd) {
            Column {
                GetGenres()
                LazyColumn(
                    modifier = Modifier
                        .background(color = Color.LightGray),
                ) {
                    item {

                    }
                    item {
                        MoviesColumn(movieList)
                    }
                }
            }
            BottomBar()
        }
    }
}