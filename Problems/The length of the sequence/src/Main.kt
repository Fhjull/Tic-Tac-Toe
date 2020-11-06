import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var a = scanner.nextInt()
    var i = 0
    while (a != 0) {
        i++
        a = scanner.nextInt()
    }
    println(i)
}