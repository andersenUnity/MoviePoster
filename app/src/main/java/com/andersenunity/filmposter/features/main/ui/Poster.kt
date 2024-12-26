package com.andersenunity.filmposter.features.main.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@Composable
fun Poster() {
    AsyncImage(
        model =
        "https://i.pinimg.com/originals/f2/18/9e/f2189e8139bb7b95cafa0084a98dacb4.jpg",
        contentDescription = "poster",
        modifier = Modifier
            .padding(horizontal = 15.dp)
            .padding(top = 8.dp)
            .shadow(elevation = 8.dp, shape = RoundedCornerShape(20.dp)),
        onError = {
            it.result
        },
    )
}