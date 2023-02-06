fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    if ((a<=0)&&(b<=0)&&(c>0)) { println(true) }
    else if ((a<=0)&&(b>0)&&(c<=0)) { println(true) }
    else if ((a>0)&&(b<=0)&&(c<=0)) { println(true) }
    else {
        println(false)
    }
}
