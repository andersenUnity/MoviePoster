package com.andersenunity.filmposter.features.movie.ui


import androidx.compose.foundation.clickable
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andersenunity.filmposter.R
import com.andersenunity.filmposter.models.Movie
import com.andersenunity.filmposter.ui.theme.robotoFamily

@Composable
fun PrintMovieInfo(movie: Movie) {
    var isExpanded by remember { mutableStateOf(false) }
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
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = movie.nameOfMovie,
                    fontSize = 24.sp,
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Light,
                )
            }
            Row {
                Text(
                    text = stringResource(R.string.premierDate),
                    fontSize = 24.sp,
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = movie.premierDate,
                    fontSize = 24.sp,
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Light,
                )
            }
            Row {
                Text(
                    text = stringResource(R.string.movieDuration),
                    fontSize = 24.sp,
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = movie.movieDuration,
                    fontSize = 24.sp,
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Light,
                )
            }
            Row {
                Text(
                    text = stringResource(R.string.country),
                    fontSize = 24.sp,
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = movie.country,
                    fontSize = 24.sp,
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Light,
                )
            }
            Row {
                Text(
                    text = stringResource(R.string.genre),
                    fontSize = 24.sp,
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = movie.genre,
                    fontSize = 24.sp,
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Light,
                )
            }
            Row {
                Text(
                    text = stringResource(R.string.movieDescription),
                    fontSize = 24.sp,
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = if (isExpanded) "(Свернуть)" else "(Подробнее)",
                    fontSize = 24.sp,
                    fontFamily = robotoFamily,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier.clickable {
                        isExpanded = !isExpanded
                    },
                )
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Text(
                text = movie.movieDescription,
                fontSize = 24.sp,
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Light,
                maxLines = if (isExpanded) Int.MAX_VALUE else 3
            )


        }
    }
}


