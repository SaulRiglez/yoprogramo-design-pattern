package creational.factory

interface ChessPiece {
    val file: Char
    val rank: Char
}


fun createPiece(notation: String): ChessPiece {
    val (type, file, rank) = notation.toCharArray()
    return when (type) {
        'q' -> {
            println("Creating piece: Queen")
            Queen(file, rank)
        }
        'p' -> {
            println("Creating piece: Pawn")
            Pawn(file, rank)
        }
        // ...
        else -> throw RuntimeException("Unknown piece: $type")
    }
}

