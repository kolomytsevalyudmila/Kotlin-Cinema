fun main() {
    val cups = readln().toInt()
    val weekDays = readln().toBoolean()

    val result = ((10 <= cups && cups <= 20) && !weekDays) || ((15 <= cups && cups <=25) && weekDays)

    println(result)
}


