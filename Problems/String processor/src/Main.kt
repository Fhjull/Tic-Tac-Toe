import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a = readLine()!!
    val o = readLine()!!
    val b = readLine()!!
    when (o) {
        "equals" -> println(a == b)
        "plus" -> println(a + b)
        "endsWith" -> println(a.endsWith(b))
        else -> println("Unknown operation")
    }
}