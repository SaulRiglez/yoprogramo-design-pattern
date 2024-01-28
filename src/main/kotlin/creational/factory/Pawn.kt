package creational.factory

data class Pawn(
    override val file: Char,
    override val rank: Char
) : ChessPiece