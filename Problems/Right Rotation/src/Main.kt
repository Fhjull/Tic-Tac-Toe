import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val arr = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val n = scanner.nextInt()
    var b = 0
    repeat(n % arr.size) {
        b = arr[arr.lastIndex]

        for (i in arr.lastIndex downTo 1) {
            arr[i] = arr[i - 1]
        }
        arr[0] = b

    }
    for (i in arr.indices) {
        print(arr[i])
        print(" ")
    }
}