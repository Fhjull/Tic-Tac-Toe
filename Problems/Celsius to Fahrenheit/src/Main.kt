import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val celsius = readLine()!!.toDouble()
    println(celsius * 1.8 + 32)
}