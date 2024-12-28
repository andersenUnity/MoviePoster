package com.andersenunity.filmposter.features.main.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andersenunity.filmposter.R
import com.andersenunity.filmposter.ui.theme.robotoFamily

@Composable
fun GetGenres() {
    val genres =
        listOf(
            stringResource(R.string.psychologicalThriller),
            stringResource(R.string.comedy),
            stringResource(R.string.horror),
            stringResource(R.string.detective),
            stringResource(R.string.fantasy),
            stringResource(R.string.hero),
            stringResource(R.string.actionMovie),
            stringResource(R.string.romance)
        )
    Column(
        modifier = Modifier
            .padding(top = 4.dp, bottom = 4.dp)
            .padding(horizontal = 15.dp)
            .fillMaxWidth(),
    ) {
        Text(
            text = stringResource(R.string.genre),
            fontSize = 24.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(top = 8.dp)
                .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                .padding(horizontal = 4.dp)
        )
        Spacer(Modifier.padding(5.dp))
        LazyRow(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(5.dp),
        ) {
            items(genres) { genre ->
                GenresButtons(genre)
            }
        }
    }
}

@Composable
fun GenresButtons(genre: String) {
    Card(
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier
            .background(color = Color.Transparent, shape = RoundedCornerShape(10.dp))
            .clickable {},
    ) {
        Text(
            text = genre,
            fontSize = 24.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Light,
            modifier = Modifier.padding(horizontal = 4.dp)
        )
    }
}