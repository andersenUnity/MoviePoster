package com.andersenunity.filmposter.features.movie

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import com.andersenunity.filmposter.features.movie.ui.GetGenres
import com.andersenunity.filmposter.features.movie.ui.LikeBar
import com.andersenunity.filmposter.features.movie.ui.Poster
import com.andersenunity.filmposter.features.movie.ui.PrintMovieInfo
import com.andersenunity.filmposter.models.testMovie_1
import kotlin.random.Random

class MovieScreen : Screen{
    @Composable
    override fun Content() {
        val randomCountOfLikes by remember { mutableIntStateOf(Random.nextInt(2000, 3000)) }
        val rfa = randomCountOfLikes
        val context = LocalContext.current
        LazyColumn(
            modifier = Modifier
                .background(color = Color.LightGray)
                .padding(top = 8.dp)
        ) {
            item {
                GetGenres()
            }
            item {
                Poster(testMovie_1)
                Spacer(modifier = Modifier.padding(8.dp))
            }
            item {
                LikeBar(context = context, randomCountOfLikes, movie = testMovie_1)
                Spacer(modifier = Modifier.padding(8.dp))
            }
            item {
                PrintMovieInfo(testMovie_1)
                Spacer(modifier = Modifier.padding(8.dp))
            }
        }
    }


}
