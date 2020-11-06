import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var c = Int.MIN_VALUE
    var p = 1
    var d = 1
    while (scanner.hasNextInt()) {
        val a = scanner.nextInt()
        if (a > c) {
            c = a
            p = d
        }
        d++
    }
    println("$c $p")
}