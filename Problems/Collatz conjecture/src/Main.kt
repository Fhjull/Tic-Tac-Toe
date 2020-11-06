import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var a = scanner.nextInt()
    print("$a ")
    while (a != 1) {
        if (a % 2 == 0) {
            a /= 2
        } else {
            a *= 3
            a += 1
        }
        print("$a ")
    }
}