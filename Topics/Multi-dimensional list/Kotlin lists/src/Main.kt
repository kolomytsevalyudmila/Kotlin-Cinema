fun main() {    
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readln().toInt()
    for (i in 0 until n) {
        val strings = readln().split(' ').toMutableList()
        inputList.add(strings)
    }
    // Do not change lines above
    // Write your code here
    println(inputList[2].joinToString())

}
