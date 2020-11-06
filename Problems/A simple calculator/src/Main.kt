import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a = readLine()!!.split(" ")
    when (a[1]) {
        "+" -> println(a[0].toLong() + a[2].toLong())
        "-" -> println(a[0].toLong() - a[2].toLong())
        "/" -> {
            if (a[2].toInt() == 0) {
                println("Division by 0!")
            } else println(a[0].toLong() / a[2].toLong())
        }
        "*" -> println(a[0].toLong() * a[2].toLong())
        else -> println("Unknown operator")
    }
}