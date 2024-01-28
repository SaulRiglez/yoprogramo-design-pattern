package singleton

object NoMoviesList {
    init {
        println("Init for ${this::class.java.simpleName} was invoked!!")
    }

    fun printSomething() {
        println("Printing Something!!")
    }
}

val myFavoriteQuickAndAngryMovies = NoMoviesList

val yourFavoriteQuickAndAngryMovies = NoMoviesList


fun printMovies(movies: List<String>) {
    for (m in movies) {
        println(m)
    }
}

