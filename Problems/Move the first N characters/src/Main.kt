fun main() {
    val o = readLine()!!
    val a = o.split(" ")[0]
    val n = o.split(" ")[1].toInt()
    if (a.length < n) {
        println(a)
    } else {
        val b = a.substring(0, n)
        val c = a.substring(n, a.length)
        println("$c$b")
    }
}
