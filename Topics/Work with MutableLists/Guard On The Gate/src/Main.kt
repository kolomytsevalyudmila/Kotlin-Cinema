fun main() {
    val backToTheWall = readln().split(", ").map { it }.toMutableList()
    val returnedWatchman = readln().toString()

    backToTheWall.add(returnedWatchman)

    println(backToTheWall.joinToString())

}