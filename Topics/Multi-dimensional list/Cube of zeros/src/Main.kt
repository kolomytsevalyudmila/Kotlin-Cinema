fun main() {
    val cubeOfZeros = mutableListOf( mutableListOf(mutableListOf<Int>(0, 0, 0),
        mutableListOf<Int>(0, 0, 0),
        mutableListOf<Int>(0, 0, 0)),
        mutableListOf (mutableListOf<Int>(0, 0, 0),
            mutableListOf<Int>(0, 0, 0),
            mutableListOf<Int>(0, 0, 0)),
        mutableListOf(mutableListOf<Int>(0, 0, 0 ),
            mutableListOf<Int>(0, 0, 0), mutableListOf<Int>(0, 0, 0)) )
    println(cubeOfZeros.toString())
}
