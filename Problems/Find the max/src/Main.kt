import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    val arr = IntArray(n)
    for (i in arr.indices) {
        arr[i] = scanner.nextInt()
    }
    var r = 0
    var c = 0
    for (i in arr.indices) {
        if (arr[i] > c) {
            r = i
            c = arr[i]
        }
    }
    println(r)
}