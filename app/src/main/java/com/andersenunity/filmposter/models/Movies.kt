package com.andersenunity.filmposter.models

data class Movies(
    var posterId: Int,
    var nameOfMovie: String,
    var premierDate: String,
    var movieDuration: String,
    var country : String,
    var genre: String,
    var movieDescription: String,
)
