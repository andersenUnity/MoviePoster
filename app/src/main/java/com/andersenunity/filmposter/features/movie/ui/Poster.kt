package com.andersenunity.filmposter.features.movie.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.andersenunity.filmposter.models.Movie

@Composable
fun Poster(movie: Movie) {
    AsyncImage(
        model =
        movie.posterUrl,
        contentDescription = "poster",
        modifier = Modifier
            .padding(horizontal = 15.dp)
            .padding(top = 8.dp)
            .shadow(elevation = 8.dp, shape = RoundedCornerShape(20.dp)),
        onError = {
            it.result
        },
    )
}