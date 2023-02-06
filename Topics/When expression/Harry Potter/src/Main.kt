fun main() {
    var n = readln().toString()

    when {
        n == "gryffindor" -> println("bravery")
        n == "hufflepuff" -> println("loyalty")
        n == "slytherin" -> println("cunning")
        n == "ravenclaw" -> println("intellect")
        else -> println("not a valid house")
    }
}