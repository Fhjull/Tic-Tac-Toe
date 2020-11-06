import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var i = 1
    var t = ""
    repeat(n) {
        repeat(i) {
            t += "$i "
        }
        i++
    }
    println(t.substring(0, n + n - 1))
}