package com.andersenunity.filmposter.features.movie.ui


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.andersenunity.filmposter.R
import com.andersenunity.filmposter.models.Movie

@Composable
fun PrintMovieInfo(movie: Movie) {
    var isExpanded by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .padding(horizontal = 15.dp)
            .shadow(elevation = 8.dp)
            .background(color = Color.White, shape = RoundedCornerShape(20.dp)),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp, vertical = 10.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(5.dp),
        ) {
            MovieInfoItemRow(stringResource(R.string.nameOfMovie), movie.nameOfMovie)
            MovieInfoItemRow(stringResource(R.string.premierDate), movie.premierDate)
            MovieInfoItemRow(stringResource(R.string.movieDuration), movie.movieDuration)
            MovieInfoItemRow(stringResource(R.string.country), movie.country)
            MovieInfoItemRow(stringResource(R.string.genre), movie.genre)

            Row {
                Text(
                    text = stringResource(R.string.movieDescription),
                    style = MaterialTheme.typography.h3
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = if (isExpanded) "(Свернуть)" else "(Подробнее)",
                    style = MaterialTheme.typography.h1,
                    modifier = Modifier.clickable {
                        isExpanded = !isExpanded
                    },
                )
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Text(
                text = movie.movieDescription,
                style = MaterialTheme.typography.h1,
                maxLines = if (isExpanded) Int.MAX_VALUE else 3
            )


        }
    }
}

@Composable
fun MovieInfoItemRow(itemHeader: String, itemText: String) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = itemHeader,
            style = MaterialTheme.typography.h3
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            text = itemText,
            style = MaterialTheme.typography.h1
        )
    }
}
