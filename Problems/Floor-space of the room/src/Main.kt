import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val f = readLine()!!
    when (f) {
        "triangle" -> {
            val a = readLine()!!.toDouble()
            val b = readLine()!!.toDouble()
            val c = readLine()!!.toDouble()
            val s = (a + b + c) / 2
            println(sqrt(s * (s - a) * (s - b) * (s - c)))
        }
        "rectangle" -> {
            val a = readLine()!!.toDouble()
            val b = readLine()!!.toDouble()
            println(a * b)
        }
        "circle" -> {
            val a = readLine()!!.toDouble()
            println(a * a * 3.14)
        }
    }
}