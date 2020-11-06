import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val arr = IntArray(scanner.nextInt()) { scanner.nextInt() }
    var c = 0
    val m = scanner.nextInt()
    for (i in arr.indices) {
        if (arr[i] == m) c++
    }
    println(c)
}