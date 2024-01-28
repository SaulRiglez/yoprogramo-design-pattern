import singleton.NoMoviesList
import singleton.myFavoriteQuickAndAngryMovies
import singleton.yourFavoriteQuickAndAngryMovies

fun main(args: Array<String>) {
    println(myFavoriteQuickAndAngryMovies === yourFavoriteQuickAndAngryMovies)
    NoMoviesList.printSomething()
}