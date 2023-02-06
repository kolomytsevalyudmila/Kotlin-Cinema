fun main() {
    var n = readln().toInt()
    
    when {
        n == 1 -> println("No!")
        n == 2 -> println("Yes!")
        n in 3..4 -> println("No!")
        else -> println("Unknown number")
    }
}
