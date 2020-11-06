import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val a = readLine()!!
    for (i in 'a'..'z') {
        if (a.contains(i)) continue
        print(i)
    }
}