fun main() {
    // Do not touch code below
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readln().toInt()
    for (i in 0 until n) {
        val strings = readln().split(' ').toMutableList()
        inputList.add(strings)
    }
    println(inputList[0][0] + " " + inputList[0][n-1])
    println(inputList[n-1][0] + " " + inputList[n-1][n-1])
}