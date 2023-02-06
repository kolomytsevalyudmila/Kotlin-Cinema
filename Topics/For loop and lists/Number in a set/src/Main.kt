fun main() {
    val size = readln().toInt()
    val mutList: MutableList<Int> = mutableListOf()
    for (i in 0 until size){
        mutList.add(readln().toInt())
    }
    val m = readln().toInt()
    if(m in mutList){
        println("YES")
    } else println("NO")

}