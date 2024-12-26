package com.andersenunity.filmposter


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.andersenunity.filmposter.features.main.ui.GetGenres
import com.andersenunity.filmposter.features.main.ui.LikeButton
import com.andersenunity.filmposter.features.main.ui.PrintMovieInfo
import com.andersenunity.filmposter.models.Movies
import kotlin.random.Random


class MainActivity : ComponentActivity() {
    var movie = Movies(
        R.drawable.fight_club_poster,
        "Бойцовский клуб",
        "1999 г.",
        "139 мин.",
        "США",
        "Психологический триллер",
        "Сотрудник страховой компании страдает хронической бессонницей и отчаянно пытается вырваться из мучительно скучной жизни. Однажды в очередной командировке он встречает некоего Тайлера Дёрдена — харизматического торговца мылом с извращенной философией. Тайлер уверен, что самосовершенствование — удел слабых, а единственное, ради чего стоит жить, — саморазрушение. Проходит немного времени, и вот уже новые друзья лупят друг друга почем зря на стоянке перед баром, и очищающий мордобой доставляет им высшее блаженство. Приобщая других мужчин к простым радостям физической жестокости, они основывают тайный Бойцовский клуб, который начинает пользоваться невероятной популярностью."
    )
    val randomCountOfLikes = Random.nextInt(2000, 3000)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                modifier = Modifier
                    .background(color = Color.LightGray)
                    .padding(top = 8.dp)
            ) {
                item {
                    GetGenres()
                }
                item {
                    Poster()
                    Spacer(modifier = Modifier.padding(8.dp))
                }
                item {
                    LikeButton(context = this@MainActivity, randomCountOfLikes)
                    Spacer(modifier = Modifier.padding(8.dp))
                }
                item {
                    PrintMovieInfo(movie)
                    Spacer(modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}

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
        onError = { it.result
        },
    )
}





