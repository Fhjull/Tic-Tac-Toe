fun wins(b: String, a: CharArray): Boolean {
    val c = b.first().toUpperCase()
    return a[0] == c && a[1] == c && a[2] == c ||
            a[3] == c && a[4] == c && a[5] == c ||
            a[6] == c && a[7] == c && a[8] == c ||
            a[0] == c && a[3] == c && a[6] == c ||
            a[1] == c && a[4] == c && a[7] == c ||
            a[2] == c && a[5] == c && a[8] == c ||
            a[0] == c && a[4] == c && a[8] == c ||
            a[2] == c && a[4] == c && a[6] == c
}

fun printGrid(a: CharArray) {
    println("---------")
    println("| ${a[0]} ${a[1]} ${a[2]} |")
    println("| ${a[3]} ${a[4]} ${a[5]} |")
    println("| ${a[6]} ${a[7]} ${a[8]} |")
    println("---------")
}

fun main() {
    val a = charArrayOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')

    printGrid(a)

    var x: Int
    var y: Int
    for (i in 1..Int.MAX_VALUE) {
        while (true) {
            print(if (i % 2 != 0) "Enter the coordinates X: " else "Enter the coordinates O: ")
            val coordinates = readLine()!!.split(" ").toMutableList()
            coordinates.add("")
            coordinates.add("")
            if (coordinates.size != 4 || coordinates[0].length != 1 || coordinates[1].length != 1 ||
                coordinates[0].first().toInt() < 48 || coordinates[0].first().toInt() > 57 ||
                coordinates[1].first().toInt() < 48 || coordinates[1].first().toInt() > 57
            ) {
                println("You should enter numbers!")
            } else {

                x = coordinates[0].toInt()
                y = coordinates[1].toInt()
                if (x in 1..3 && y in 1..3) {
                    if (x == 1 && y == 1) {
                        if (a[0] == ' ') {
                            a[0] = if (i % 2 != 0) 'X' else 'O'
                            break
                        } else println("This cell is occupied! Choose another one!")
                    }
                    if (x == 1 && y == 2) {
                        if (a[1] == ' ') {
                            a[1] = if (i % 2 != 0) 'X' else 'O'
                            break
                        } else println("This cell is occupied! Choose another one!")
                    }
                    if (x == 1 && y == 3) {
                        if (a[2] == ' ') {
                            a[2] = if (i % 2 != 0) 'X' else 'O'
                            break
                        } else println("This cell is occupied! Choose another one!")
                    }
                    if (x == 2 && y == 1) {
                        if (a[3] == ' ') {
                            a[3] = if (i % 2 != 0) 'X' else 'O'
                            break
                        } else println("This cell is occupied! Choose another one!")
                    }
                    if (x == 2 && y == 2) {
                        if (a[4] == ' ') {
                            a[4] = if (i % 2 != 0) 'X' else 'O'
                            break
                        } else println("This cell is occupied! Choose another one!")
                    }
                    if (x == 2 && y == 3) {
                        if (a[5] == ' ') {
                            a[5] = if (i % 2 != 0) 'X' else 'O'
                            break
                        } else println("This cell is occupied! Choose another one!")
                    }
                    if (x == 3 && y == 1) {
                        if (a[6] == ' ') {
                            a[6] = if (i % 2 != 0) 'X' else 'O'
                            break
                        } else println("This cell is occupied! Choose another one!")
                    }
                    if (x == 3 && y == 2) {
                        if (a[7] == ' ') {
                            a[7] = if (i % 2 != 0) 'X' else 'O'
                            break
                        } else println("This cell is occupied! Choose another one!")
                    }
                    if (x == 3 && y == 3) {
                        if (a[8] == ' ') {
                            a[8] = if (i % 2 != 0) 'X' else 'O'
                            break
                        } else println("This cell is occupied! Choose another one!")
                    }
                } else {
                    println("Coordinates should be from 1 to 3!")
                }
            }
        }

        printGrid(a)

        if (wins("x", a)) {
            println("X wins")
            break
        }
        else if (wins("o", a)) {
            println("O wins")
            break
        }
        else if (!a.contains(' ') && !wins("x", a) && !wins("o", a)) {
            println("Draw")
            break
        }
    }
}