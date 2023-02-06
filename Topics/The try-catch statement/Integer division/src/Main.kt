fun division() {
    var a = 0
    try {
        a = 44 / 0
        println("The try block is executed")
    }
    catch (e: NumberFormatException) {
        println("The catch block is executed")
    }
    finally {
        println("The finally block is executed")
    }
}

fun main() {
    division()
}
//fun main(){
//    val input = readln()
//    printFifthCharacter(input)
//}
//fun printFifthCharacter(input: String): String {
//
//    try {if(input.length < 5) {
//        println("The input word is too short!")
//        return input
//    } else {
//        throw Exception("The fifth character of the entered word is ${input[4]}")
//    }
//    }
//    catch (e: Exception){
//        println(e.message)
//
//    }
//
//    return "The fifth character of the entered word is ${input[4]}")
//}