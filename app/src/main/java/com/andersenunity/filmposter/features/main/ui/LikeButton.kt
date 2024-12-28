package com.andersenunity.filmposter.features.main.ui

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import com.andersenunity.filmposter.models.savePreferences
import com.andersenunity.filmposter.models.readPreferences

@Composable
fun LikeButton(context: Context, movie: Movie) {
    val input = readPreferences(context,movie)
    var isLikePressed by remember {
        mutableStateOf(
            input
        )
    }
    Image(
        contentDescription = "like", modifier = androidx.compose.ui.Modifier
            .size(34.dp)
            .clickable {
                isLikePressed = !isLikePressed
                if (isLikePressed) ++movie.likesCount  else --movie.likesCount
                savePreferences(context,isLikePressed,movie)
            },
        painter = if (isLikePressed) painterResource(R.drawable.like_sign_enable) else painterResource(
            R.drawable.like_sign_disable,
        )
    )
}