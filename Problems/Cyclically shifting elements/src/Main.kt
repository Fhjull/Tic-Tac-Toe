import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val arr = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val res = IntArray(arr.size)
    for (i in 1..arr.lastIndex) {
        res[i] = arr[i - 1]
    }
    res[0] = arr[arr.lastIndex]
    println(res.joinToString(" "))
}