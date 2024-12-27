package com.andersenunity.filmposter.features.movie.ui

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.andersenunity.filmposter.R
import com.andersenunity.filmposter.models.Movie
import java.lang.reflect.Modifier

@Composable
fun LikeButton(context: Context, movie: Movie) {
    val sharedPreferences = context.getSharedPreferences("LikedPrefs", Context.MODE_PRIVATE)
    var isLikePressed by remember {
        mutableStateOf(
            sharedPreferences.getBoolean(
                "Licked",
                movie.isLiked
            )
        )
    }
    Image(
        contentDescription = "like", modifier = androidx.compose.ui.Modifier
            .size(34.dp)
            .clickable {
                isLikePressed = !isLikePressed
                with(sharedPreferences.edit()) {
                    putBoolean("Licked", isLikePressed)
                    apply()
                }
            },
        painter = if (isLikePressed) painterResource(R.drawable.like_sign_disable) else painterResource(
            R.drawable.like_sign_enable,
        )
    )
    movie.isLiked = isLikePressed
}
//count = if (isLikePressed) ++count else --count