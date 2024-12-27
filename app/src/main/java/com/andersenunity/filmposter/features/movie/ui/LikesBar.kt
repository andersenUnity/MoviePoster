package com.andersenunity.filmposter.features.movie.ui

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andersenunity.filmposter.R
import com.andersenunity.filmposter.models.Movie
import com.andersenunity.filmposter.models.testMovie_1
import com.andersenunity.filmposter.ui.theme.robotoFamily


@Composable
fun LikeBar(context: Context, countOfLikes: Int, movie: Movie) {
    var count = countOfLikes
    Card(
        modifier = Modifier
            .padding(horizontal = 15.dp)
            .shadow(elevation = 8.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(Color.White),
    ) {
        Row(modifier = Modifier.padding(15.dp)) {
            Text(
                fontSize = 24.sp,
                text = stringResource(R.string.like),
                fontFamily = robotoFamily,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(top = 5.dp)
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Text(
                text = "$count",
                fontSize = 24.sp,
                fontFamily = robotoFamily,
                fontWeight = FontWeight.Light,
                modifier = Modifier.padding(top = 5.dp)
            )
            Spacer(modifier = Modifier.padding(4.dp))
            LikeButton(context,movie)
        }
    }
}
