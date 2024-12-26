package com.andersenunity.filmposter.features.main.ui

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andersenunity.filmposter.R


@Composable
fun LikeButton(context: Context, countOfLikes: Int) {
    var count = countOfLikes
    val sharedPreferences = context.getSharedPreferences("LikedPrefs", Context.MODE_PRIVATE)
    var isLikePressed by remember { mutableStateOf(sharedPreferences.getBoolean("Licked", false)) }
    Card(
        modifier = Modifier
            .padding(horizontal = 15.dp)
            .shadow(elevation = 8.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(Color.White),
    ) {
        Row(modifier = Modifier.padding(15.dp)) {
            Text(
                text = "Нравится: $count",
                fontSize = 24.sp,
                fontStyle = FontStyle.Normal,
                modifier = Modifier.padding(top = 5.dp)
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Image(
                contentDescription = "like",
                modifier = Modifier
                    .size(40.dp)
                    .clickable {
                        isLikePressed = !isLikePressed
                        count = if (isLikePressed) ++count else --count
                        with(sharedPreferences.edit()) {
                            putBoolean("Licked", isLikePressed)
                            apply()
                        }
                    },
                painter = if (isLikePressed) painterResource(R.drawable.like_sign_disable) else painterResource(
                    R.drawable.like_sign_enable,
                )
            )

        }
    }
}

