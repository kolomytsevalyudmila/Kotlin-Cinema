fun printFifthCharacter(input: String): String {

    try {if(input.length < 5) {
        return "The input word is too short!"
    }
    }
    catch (e: Exception){
        println(e.message)

    }
    
    return "The fifth character of the entered word is ${input[4]}"
}
