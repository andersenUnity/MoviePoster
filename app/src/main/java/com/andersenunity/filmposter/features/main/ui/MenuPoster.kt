package com.andersenunity.filmposter.features.main.ui

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.core.content.pm.ShortcutInfoCompat.Surface
import coil3.compose.AsyncImage
import com.andersenunity.filmposter.models.Movie

@Composable
fun MenuPoster(movie: Movie) {
    Surface(
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .fillMaxSize()
    ) {
        AsyncImage(
            model =
            movie.posterUrl,
            contentDescription = "poster",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize(),
            onError = {
                it.result
            },
        )
    }

}