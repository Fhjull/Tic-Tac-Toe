import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val arr = IntArray(scanner.nextInt()) { scanner.nextInt() }
    var r = 0
    for (i in 0..arr.size - 3) {
        if (arr[i] + 1 == arr[i + 1] && arr[i] + 2 == arr[i + 2]) r++
    }
    println(r)
}