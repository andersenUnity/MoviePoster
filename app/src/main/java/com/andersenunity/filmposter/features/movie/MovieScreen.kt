package com.andersenunity.filmposter.features.movie


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import com.andersenunity.filmposter.features.movie.ui.BackButton
import com.andersenunity.filmposter.features.movie.ui.LikeBar
import com.andersenunity.filmposter.features.movie.ui.Poster
import com.andersenunity.filmposter.features.movie.ui.PrintMovieInfo
import com.andersenunity.filmposter.models.Movie


class MovieScreen(inputMovie: Movie) : Screen {
    val movie = inputMovie
    @Composable
    override fun Content() {
        val context = LocalContext.current
        Box(modifier = Modifier.padding(), contentAlignment = Alignment.BottomEnd) {
            LazyColumn(
                modifier = Modifier.fillMaxSize()
                    .padding(top = 8.dp)
            ) {
                item {
                    BackButton()
                }
                item {
                    Poster(
                        movie, modifier = Modifier
                            .padding(horizontal = 15.dp)
                            .padding(top = 8.dp)
                            .aspectRatio(9 / 16f)
                    )
                    Spacer(modifier = Modifier.padding(8.dp))
                }
                item {
                    LikeBar(context = context, movie,)
                    Spacer(modifier = Modifier.padding(8.dp))
                }
                item {
                    PrintMovieInfo(movie)
                    Spacer(modifier = Modifier.padding(8.dp))
                }
            }
        }

    }
}


