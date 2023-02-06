fun main() {
    // Do not touch code below
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readln().toInt()
    for (i in 0 until n) {
        val strings = readln().split(' ').toMutableList()
        inputList.add(strings)
    }
    println("[${inputList.last().toMutableList()}, ${inputList.first().toMutableList()}]")
}