import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val l = scanner.nextInt()
    val arr = IntArray(l)
    for (i in arr.indices) {
        arr[i] = scanner.nextInt()
    }
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    var r = "NO"

    for (i in 0 until arr.lastIndex) {
        if (arr[i] == n && arr[i + 1] == m || arr[i + 1] == n && arr[i] == m) r = "YES"
    }
    println(r)
}