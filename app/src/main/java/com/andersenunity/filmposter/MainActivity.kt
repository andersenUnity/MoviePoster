package com.andersenunity.filmposter


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import com.andersenunity.filmposter.account.AccountTab
import com.andersenunity.filmposter.features.main.HomeTab
import com.andersenunity.filmposter.ui.theme.FilmPosterTheme
import com.andersenunity.filmposter.ui.theme.PurpleGrey40


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FilmPosterTheme {
                TabNavigator(HomeTab) {
                    Scaffold(
                        bottomBar = {
                            Row {
                                TabNavigationItem(HomeTab)
                                TabNavigationItem(AccountTab)
                            }
                        }
                    ) {it
                        CurrentTab()
                    }
                }
            }

        }
    }
}

@Composable
private fun RowScope.TabNavigationItem(tab: Tab) {
    val tabNavigator = LocalTabNavigator.current

    BottomNavigationItem(
        selected = tabNavigator.current == tab,
        onClick = { tabNavigator.current = tab },
        icon = {
            Image(painter = tab.options.icon?: rememberVectorPainter(Icons.Default.Warning),
                contentDescription = tab.options.title,
                modifier = Modifier.background(color = PurpleGrey40).fillMaxWidth().padding(8.dp).size(50.dp))
        }
    )
}







