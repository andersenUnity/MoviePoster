package com.andersenunity.filmposter.features.main.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.andersenunity.filmposter.models.Movie

@Composable
fun MoviesColumn(moviesList: List<Movie>) {
    for (index in moviesList.indices step 2) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            if (index + 1 < moviesList.size) {
                MovieItem(moviesList[index], Modifier.weight(1f))
                MovieItem(moviesList[index + 1], Modifier.weight(1f))
            } else {
                MovieItem(moviesList[index], Modifier.fillMaxWidth(0.5f))
            }
        }
    }
}

