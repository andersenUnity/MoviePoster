package com.andersenunity.filmposter.account


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.andersenunity.filmposter.R
import com.andersenunity.filmposter.account.ui.AccountItems
import com.andersenunity.filmposter.models.User
import com.andersenunity.filmposter.models.testUser

object AccountTab : Tab {
    private fun readResolve(): Any = AccountTab

    override val options: TabOptions
        @Composable
        get() {
            val title = stringResource(R.string.app_name)
            val icon = painterResource(R.drawable.account_logo)

            return remember {
                TabOptions(
                    index = 0u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        Navigator(AccountScreen(testUser))
    }
}


data class AccountScreen(val user: User) : Screen {
    @Composable
    override fun Content() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 15.dp),
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center
            ) {

                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = rememberVectorPainter(Icons.Default.AccountCircle),
                        contentDescription = "Account logo",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = user.userName,
                        modifier = Modifier
                            .background(color = Color.White, shape = RoundedCornerShape(20.dp))
                            .padding(start = 10.dp)
                            .fillMaxWidth(),
                        style = MaterialTheme.typography.h3,
                    )
                }
                AccountItems()
            }
        }
    }
}


