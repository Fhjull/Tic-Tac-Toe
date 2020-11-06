import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var a = 1
    var b = 1
    while (b != 0) {
        b = scanner.nextInt()
        if (b > a) a = b
    }
    println(a)
}