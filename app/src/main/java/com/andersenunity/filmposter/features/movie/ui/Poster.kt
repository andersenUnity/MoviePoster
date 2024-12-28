package com.andersenunity.filmposter.features.movie.ui

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.andersenunity.filmposter.models.Movie

@Composable
fun Poster(movie: Movie) {
    Surface(
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .padding(horizontal = 15.dp)
            .padding(top = 8.dp)
            .aspectRatio(9 / 16f)
            .fillMaxSize(),
        shadowElevation = 8.dp
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