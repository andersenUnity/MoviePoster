package com.andersenunity.filmposter.features.main.ui


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andersenunity.filmposter.R
import com.andersenunity.filmposter.models.Movies

@Composable
fun PrintMovieInfo(movie: Movies) {
    Card(
        modifier = Modifier
            .padding(horizontal = 15.dp)
            .shadow(elevation = 8.dp),
        colors = CardDefaults.cardColors(
            Color.White
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp, vertical = 10.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(5.dp),
        ) {
            Row {
                Text(
                    text = stringResource(R.string.nameOfMovie),
                    fontSize = 24.sp,
                    fontStyle = FontStyle.Normal,
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = movie.nameOfMovie,
                    fontSize = 24.sp,
                    fontStyle = FontStyle.Italic,
                )
            }
            Row {
                Text(
                    text = stringResource(R.string.premierDate),
                    fontSize = 24.sp,
                    fontStyle = FontStyle.Normal,
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = movie.premierDate,
                    fontSize = 24.sp,
                    fontStyle = FontStyle.Italic,
                )
            }
            Row {
                Text(
                    text = stringResource(R.string.movieDuration),
                    fontSize = 24.sp,
                    fontStyle = FontStyle.Normal,
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = movie.movieDuration,
                    fontSize = 24.sp,
                    fontStyle = FontStyle.Italic,
                )
            }
            Row {
                Text(
                    text = stringResource(R.string.country),
                    fontSize = 24.sp,
                    fontStyle = FontStyle.Normal,
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = movie.country,
                    fontSize = 24.sp,
                    fontStyle = FontStyle.Italic,
                )
            }
            Row {
                Text(
                    text = stringResource(R.string.genre),
                    fontSize = 24.sp,
                    fontStyle = FontStyle.Normal,
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = movie.genre,
                    fontSize = 24.sp,
                    fontStyle = FontStyle.Italic,
                )
            }
            Text(
                text = stringResource(R.string.movieDescription),
                fontSize = 24.sp,
                fontStyle = FontStyle.Normal,
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Text(
                text = movie.movieDescription,
                fontSize = 24.sp,
                fontStyle = FontStyle.Italic,
            )

        }
    }
}


