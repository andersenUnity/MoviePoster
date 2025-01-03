package com.andersenunity.filmposter.features.movie.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.andersenunity.filmposter.R
import com.andersenunity.filmposter.features.main.HomeScreen
import com.andersenunity.filmposter.models.testMoviesList
import com.andersenunity.filmposter.ui.theme.robotoFamily

@Composable
fun BackButton() {
    val navigator = LocalNavigator.currentOrThrow
    Row(
        Modifier
            .padding(top = 4.dp, bottom = 4.dp)
            .padding(horizontal = 15.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = stringResource(R.string.back),
            fontSize = 24.sp,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(top = 8.dp)
                .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                .padding(horizontal = 4.dp)
                .clickable {
                    navigator.push(HomeScreen(testMoviesList))
                },
        )
    }
}