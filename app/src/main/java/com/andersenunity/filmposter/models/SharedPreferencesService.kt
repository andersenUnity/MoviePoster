package com.andersenunity.filmposter.models

import android.content.Context
import android.content.SharedPreferences
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember


// 1) метод сохранения: файл мувиес пут булеан (название фильма, значение)
// 2) метод чтения: файл мувиес гет булеан (название фильма, дефолтно фолс)
// сюда нужно будет в методы передать Контекст объект, чтобы получить преференцес
fun sharedMovies(context: Context): SharedPreferences {
    val sharedPreferences = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)
    return sharedPreferences
}

@Composable
fun readPreferences(context: Context, movie: Movie): Boolean {
    val isLiked by remember {
        mutableStateOf(
            sharedMovies(context).getBoolean(
                movie.nameOfMovie,
                false
            )
        )
    }
    return isLiked
}

fun savePreferences(context: Context, isLiked: Boolean, movie: Movie) {
    with(sharedMovies(context).edit()) {
        putBoolean(movie.nameOfMovie, isLiked)
        apply()
    }
}

const val FILE_NAME = "movies"
