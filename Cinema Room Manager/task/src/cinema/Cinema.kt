package cinema
const val ROWS =  7
const val SEAT =  8
const val MIN = 8
const val MAX = 10

// creating an array for the cinema hall scheme
fun tabl (row: Int, seats: Int): Array<Array<String>> {
    var pole = arrayOf<Array<String>>() // fill the field with empty values
    for (i in 0..row) {
        var array = arrayOf<String>()
        for (j in 0..seats) {
            array += " "
        }
        pole += array
    }
    return pole
}

// filling in the cinema hall scheme with conventional signs
fun scheme (row: Int, seats: Int, mass: Array<Array<String>>) {
// i - vertical numbering of the i-th column
    // j - horizontal numbering of the j-th row
    for (i in 0..row) {
        for (j in 0..seats) {
            if (i == 0 && j == 0) { mass [0][0] = " " }
            if (i == 0 && j != 0) { mass[i][j] = j.toString() }
            if (i != 0 && j == 0) { mass[i][j] = i.toString() }
            if (i != 0 && j != 0) { mass[i][j] = "S" }
        }
    }
}

// printing the cinema hall diagram
fun printScheme (row: Int, seats: Int, mass: Array<Array<String>>) {
    var elem = ""
    println("Cinema:")
    for (i in 0..row) {
        elem = " "
        for (j in 0..seats) {
            elem = elem + " " + mass[i][j]
        }
        println(elem)
    }
}

fun totalPrice(row: Int, seats: Int, mass: Array<Array<String>>) {
// If the cinema is large, more than 60 seats:
// determine the number of rows - even or not
    var festRow: Int = 0
    var allPrices: Int = 0
    var allPurTicket: Int = 0
    var festPurTicket: Int = 0
    var percent: Double = 0.0
    var current: Int = 0

    if (row * seats > 60) {
        if (row % 2 == 0) {
            festRow = row / 2
        } else {
            festRow = (row - 1) / 2
        }
        allPrices = (festRow * seats * MAX) + ((row - festRow) * seats * MIN )
    } else {
        allPrices = row * seats * MAX
    }
    for (i in 1..row) {
        for (j in 1..seats) {
            if (mass[i][j] == "B") { allPurTicket++ }
            if ( i <= festRow && mass[i][j] == "B"){ festPurTicket++ }
        }
    }
    if (row * seats > 60) {
        current = festPurTicket * MAX + (allPurTicket - festPurTicket) * MIN
    } else {
        current = allPurTicket * MAX
    }
    percent = allPurTicket.toDouble() / (row.toDouble() * seats.toDouble()) * 100
    val formatPercentage = "%.2f".format(percent)
    println("Number of purchased tickets: $allPurTicket")
    println("Percentage: $formatPercentage%")
    println("Current income: \$$current")
    println("Total income: \$$allPrices")
}

fun main() {
    var row: Int = ROWS
    var seats: Int = SEAT
    var youRow: Int = 0
    var youSeats: Int =0
    var priceTicket: Int = 0
    var festRow: Int = 0
// Creating a two-dimensional array of i - rows seven, j - places in row 8
    var pole = arrayOf<Array<String>>()

    println("Enter the number of rows:")
    row = readln().toInt()
    println("Enter the number of seats in each row:")
    seats = readln().toInt()
// creating a table
    pole = tabl(row, seats)
// fill it with data
    scheme(row, seats, pole)
    while (true) {
        println("1. Show the seats")
        println("2. Buy a ticket")
        println("3. Statistics")
        println("0. Exit")
        var m: Int = 0
        m = readln().toInt()
        when (m) {
            0 -> {
                return
            }
            1 -> { printScheme(row, seats, pole) }
            3 -> { totalPrice(row, seats, pole) }
            2 -> {
                while (true) {
                    println("Enter a row number:")
                    youRow = readln().toInt()
                    println("Enter a seat number in that row:")
                    youSeats = readln().toInt()
                    if (youRow <= 0 || youRow > row || youSeats <= 0 || youSeats > seats ) {
                        println("Wrong input!")
                    } else {
                        if (row * seats <= 60) {
                            priceTicket = MAX
                        } else {
                            if (row % 2 == 0) {
                                festRow = row / 2
                            } else {
                                festRow = (row - 1) / 2
                            }
                            if (youRow > festRow) {
                                priceTicket = MIN
                            } else {
                                priceTicket = MAX
                            }
                        }
                        if (pole[youRow][youSeats] == "B") {
                            println("That ticket has already been purchased!")
                        } else {
                            pole[youRow][youSeats] = "B"
                            println("Ticket price: \$$priceTicket")
                            break
                        }
                    }
                }
            }
        }
    }
}