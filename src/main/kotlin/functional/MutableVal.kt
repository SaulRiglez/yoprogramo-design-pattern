package functional

object MutableVal {
    var count = 0
    val myString: String = "Mutable"
        get() {
            return "$field ${++count}"
        }
}

class MutableObj {
    var value = ""

    override fun toString(): String {
        return "MutableObj(value='$value)"
    }
}