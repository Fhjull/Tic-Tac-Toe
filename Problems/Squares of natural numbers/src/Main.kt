import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.nextInt()
    var b = 1
    while (b * b <= a) {
        println(b * b)
        b++
    }
}