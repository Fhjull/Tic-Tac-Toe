import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()
    val d = readLine()!!.toDouble()
    println(a * 10.5 + b * 4.4 + (c + d) / 2.2)
}