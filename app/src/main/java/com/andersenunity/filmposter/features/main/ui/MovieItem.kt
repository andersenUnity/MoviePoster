package com.andersenunity.filmposter.features.main.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.andersenunity.filmposter.features.movie.MovieScreen
import com.andersenunity.filmposter.features.movie.ui.Poster
import com.andersenunity.filmposter.models.Movie
import com.andersenunity.filmposter.ui.theme.robotoFamily

@Composable
fun MovieItem(movie: Movie, modifier: Modifier) {
    val context = LocalContext.current
    val navigator = LocalNavigator.currentOrThrow
    Column(modifier = modifier) {
        Box(
            modifier = Modifier
                .aspectRatio(9 / 16f)
                .fillMaxWidth().clickable {
                    navigator.push(MovieScreen(movie))},
            contentAlignment = Alignment.BottomEnd
        ) {
            Poster(movie,Modifier)
            LikeButton(context = context,movie)
        }
        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            text = movie.nameOfMovie,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp
        )
    }
}
