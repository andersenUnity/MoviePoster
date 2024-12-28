package com.andersenunity.filmposter.features.movie.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.andersenunity.filmposter.models.Movie

@Composable
fun Poster(movie: Movie, modifier: Modifier) {
    Surface(
        shape = RoundedCornerShape(20.dp),
        modifier = modifier
            .fillMaxSize(),
    ) {
        AsyncImage(
            model =
            movie.posterUrl,
            contentDescription = "poster",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
            ,
            onError = {
                it.result
            },
        )
    }
}