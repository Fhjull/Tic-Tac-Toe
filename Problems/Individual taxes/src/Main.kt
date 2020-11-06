import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val inc = DoubleArray(scanner.nextInt()) { scanner.nextDouble() }
    val tax = DoubleArray(inc.size) { scanner.nextDouble() }
    var c: Double = 0.0
    var r = 1
    for (i in inc.indices) {
        if (inc[i] * tax[i] / 100 > c) {
            r = i + 1
            c = inc[i] * tax[i] / 100
        }
    }
    println(r)
}