import creational.abstractfactory.property
import creational.builder.MailBuilder
import creational.factory.ChessPiece
import creational.factory.createPiece
import creational.singleton.NoMoviesList
import creational.singleton.myFavoriteQuickAndAngryMovies
import creational.singleton.yourFavoriteQuickAndAngryMovies
import creational.staticfactory.Server
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO



fun main(){
    println(property("port:8080").toString())
    val portProperty = property("port: 8080")
    val environment = property("environment: production")

    val port: Int = portProperty.value as Int


    val email = MailBuilder()
        .to(listOf("Yoprogramo@gmail.com"))
        .cc(listOf("saul.riglez@gmail.com"))
        .build()
}


fun main_static_factory() = runBlocking {
    println(Server.withPort(80))
}

suspend fun doWork() {
    delay(1500)
}

fun mainImageReading(args: Array<String>) {
    try {
        val inputFile = File("/Users/yoprogramo/Documents/NewStart/designpattern/src/main/original.png")
        val myImage: BufferedImage = ImageIO.read(inputFile)

        for (x in 0 until myImage.width) {
            for (y in 0 until myImage.height) {

                val color = Color(myImage.getRGB(x, y))
                val g = color.green
                val b = color.blue

                val colorNew = Color(255, g, b)
                myImage.setRGB(x, y, colorNew.rgb)
            }
        }

        val outputFileJpg = File("/Users/yoprogramo/Documents/NewStart/designpattern/src/main/new_original.jpg")
        ImageIO.write(myImage, "jpg", outputFileJpg)
    } catch (e: Exception) {
        println("Houston tenemos un problema")
    }
}

fun mainFactory(args: Array<String>) {
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