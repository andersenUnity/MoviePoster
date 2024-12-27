package com.andersenunity.filmposter.features.main

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import com.andersenunity.filmposter.features.main.ui.MoviesColumn
import com.andersenunity.filmposter.models.testMoviesList

class MainScreen : Screen {
    @Composable
    override fun Content() {
        val context = LocalContext.current
        LazyColumn(modifier = Modifier.padding(bottom = 20.dp)) {
            item {
                MoviesColumn(testMoviesList)
            }
        }
    }
}