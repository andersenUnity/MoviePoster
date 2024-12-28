package com.andersenunity.filmposter.features.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.andersenunity.filmposter.R

import com.andersenunity.filmposter.features.main.ui.MoviesColumn
import com.andersenunity.filmposter.features.main.ui.GetGenres
import com.andersenunity.filmposter.models.Movie
import com.andersenunity.filmposter.models.testMoviesList

object HomeTab : Tab {
    private fun readResolve(): Any = HomeTab

    override val options: TabOptions
        @Composable
        get() {
            val title = stringResource(R.string.app_name)
            val icon = painterResource(R.drawable.home_logo)

            return remember {
                TabOptions(
                    index = 0u,
                    title = title,
                    icon = icon,
                )
            }
        }

    @Composable
    override fun Content() {
        Navigator(HomeScreen(testMoviesList))
    }
}


class HomeScreen(val movieList: List<Movie>) : Screen {
    @Composable
    override fun Content() {
        Column(modifier = Modifier.padding(bottom = 50.dp)) {
            GetGenres()
            LazyColumn(
                modifier = Modifier,
            ) {
                item {
                    MoviesColumn(movieList)
                }
            }
        }


    }
}