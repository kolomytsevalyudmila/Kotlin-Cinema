fun pepTalk(name: String): String {
    val array = name.split(" ").toTypedArray()
    val firstName = array[0]
    val secondName = array[1]
    println("Good luck!")
    return "Don't lose the towel, traveler $firstName $secondName!"
}   
// do not change the function above        

fun main() {
    val name = readLine()!!
    val advice = pepTalk(name)
    // fix this function call
    print(advice)     
    
}
