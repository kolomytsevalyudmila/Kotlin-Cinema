fun main() {
    val line1 = readln().toInt()
    val line2 = readln().toInt()

    val product = line1 * line2
    when { product !=0 -> println(product)
        else-> println("It can't be zero!")
    }
}