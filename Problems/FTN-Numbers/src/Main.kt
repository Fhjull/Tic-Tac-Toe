import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    println(when (readLine()!!.toInt()) {
        0, 1, 2, 3, 5, 8, 13, 21, 34, 55 -> "F"
        6, 10, 15, 28, 36, 45 -> "T"
        100, 1000, 10_000, 100_000 -> "P"
        else -> "N"
    })
}