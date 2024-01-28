import creational.factory.ChessPiece
import creational.factory.createPiece
import creational.singleton.NoMoviesList
import creational.singleton.myFavoriteQuickAndAngryMovies
import creational.singleton.yourFavoriteQuickAndAngryMovies



fun main(args: Array<String>) {
    val notations = listOf("pa8", "qc3")
    val pieces = mutableListOf<ChessPiece>()

    for (n in notations) {

        pieces.add(createPiece(n))
    }
}
fun mainSingleton(args: Array<String>) {
    println(myFavoriteQuickAndAngryMovies === yourFavoriteQuickAndAngryMovies)
    NoMoviesList.printSomething()
}