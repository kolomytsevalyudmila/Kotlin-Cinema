fun main() {
    var n = readln().toInt()

    when{
        n >= 1000 -> println("4")
        n in 100..999 -> println("3")
        n in 10..99 -> println("2")
        n in 1..9 -> println("1")
        else -> println("no")
    }
}