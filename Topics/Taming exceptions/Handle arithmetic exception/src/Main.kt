fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    if (b == 0){
        println("Division by zero, please fix the second argument!")
        return
    }
    val del = a/b
    println(del)

}