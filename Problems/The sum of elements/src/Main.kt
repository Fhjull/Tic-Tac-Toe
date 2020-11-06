import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var a = 1
    var b = 0
    while (a != 0) {
        a = scanner.nextInt()
        b += a
    }
    println(b)
}