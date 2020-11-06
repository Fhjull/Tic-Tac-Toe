import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val a = readLine()!!.first()
    var l = ""
    for (i in 'a'..'z') {
        if (a == i) break
        l += i
    }
    println(l)
}