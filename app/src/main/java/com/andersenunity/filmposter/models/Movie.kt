package com.andersenunity.filmposter.models

data class Movie(
    var posterUrl: String,
    var nameOfMovie: String,
    var premierDate: String,
    var movieDuration: String,
    var country : String,
    var genre: String,
    var movieDescription: String,
    var isLiked: Boolean = false,
)

val testMovie_1 = Movie(
    "https://i.pinimg.com/originals/f2/18/9e/f2189e8139bb7b95cafa0084a98dacb4.jpg",
    "Бойцовский клуб",
    "1999 г.",
    "139 мин.",
    "США",
    "Психологический триллер",
    "Сотрудник страховой компании страдает хронической бессонницей и отчаянно пытается вырваться из мучительно скучной жизни. Однажды в очередной командировке он встречает некоего Тайлера Дёрдена — харизматического торговца мылом с извращенной философией. Тайлер уверен, что самосовершенствование — удел слабых, а единственное, ради чего стоит жить, — саморазрушение. Проходит немного времени, и вот уже новые друзья лупят друг друга почем зря на стоянке перед баром, и очищающий мордобой доставляет им высшее блаженство. Приобщая других мужчин к простым радостям физической жестокости, они основывают тайный Бойцовский клуб, который начинает пользоваться невероятной популярностью."
)
val testMovie_2 = Movie(
    "https://i.pinimg.com/originals/3b/d8/57/3bd857c59ab6c02042fa92053700c0f9.jpg",
    "Волк с Уолстрит",
    "1999 г.",
    "139 мин.",
    "США",
    "Психологический триллер",
    "Сотрудник страховой компании страдает хронической бессонницей и отчаянно пытается вырваться из мучительно скучной жизни. Однажды в очередной командировке он встречает некоего Тайлера Дёрдена — харизматического торговца мылом с извращенной философией. Тайлер уверен, что самосовершенствование — удел слабых, а единственное, ради чего стоит жить, — саморазрушение. Проходит немного времени, и вот уже новые друзья лупят друг друга почем зря на стоянке перед баром, и очищающий мордобой доставляет им высшее блаженство. Приобщая других мужчин к простым радостям физической жестокости, они основывают тайный Бойцовский клуб, который начинает пользоваться невероятной популярностью."
)
val testMovie_3 = Movie(
    "https://i.pinimg.com/originals/f2/18/9e/f2189e8139bb7b95cafa0084a98dacb4.jpg",
    "Бойцовский клуб",
    "1999 г.",
    "139 мин.",
    "США",
    "Психологический триллер",
    "Сотрудник страховой компании страдает хронической бессонницей и отчаянно пытается вырваться из мучительно скучной жизни. Однажды в очередной командировке он встречает некоего Тайлера Дёрдена — харизматического торговца мылом с извращенной философией. Тайлер уверен, что самосовершенствование — удел слабых, а единственное, ради чего стоит жить, — саморазрушение. Проходит немного времени, и вот уже новые друзья лупят друг друга почем зря на стоянке перед баром, и очищающий мордобой доставляет им высшее блаженство. Приобщая других мужчин к простым радостям физической жестокости, они основывают тайный Бойцовский клуб, который начинает пользоваться невероятной популярностью."
)
val testMovie_4 = Movie(
    "https://i.pinimg.com/originals/f2/18/9e/f2189e8139bb7b95cafa0084a98dacb4.jpg",
    "Бойцовский клуб",
    "1999 г.",
    "139 мин.",
    "США",
    "Психологический триллер",
    "Сотрудник страховой компании страдает хронической бессонницей и отчаянно пытается вырваться из мучительно скучной жизни. Однажды в очередной командировке он встречает некоего Тайлера Дёрдена — харизматического торговца мылом с извращенной философией. Тайлер уверен, что самосовершенствование — удел слабых, а единственное, ради чего стоит жить, — саморазрушение. Проходит немного времени, и вот уже новые друзья лупят друг друга почем зря на стоянке перед баром, и очищающий мордобой доставляет им высшее блаженство. Приобщая других мужчин к простым радостям физической жестокости, они основывают тайный Бойцовский клуб, который начинает пользоваться невероятной популярностью."
)

val testMoviesList= listOf(testMovie_1,testMovie_2,testMovie_3,testMovie_4, testMovie_2
)