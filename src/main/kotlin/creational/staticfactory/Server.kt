package creational.staticfactory

class Server private constructor(port: Long) {
    init {
        println("Server started with port: $port")
    }

    companion object {
        fun withPort(port: Long) = Server(port)
    }
}