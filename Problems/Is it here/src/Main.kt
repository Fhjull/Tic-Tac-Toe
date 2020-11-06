import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val arr = IntArray(scanner.nextInt()) { scanner.nextInt() }
    var r = "NO"
    val m = scanner.nextInt()
    for (i in arr.indices) {
        if (arr[i] == m) r = "YES"
    }
    println(r)
}