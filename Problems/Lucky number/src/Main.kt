fun main() {
    // write your code here
    val a = readLine()!!
    var r = 0
    for (i in 0 until a.length / 2) {
        r += a[i].toString().toInt()
    }
    var t = 0
    for (i in a.length / 2 until a.length) {
        t += a[i].toString().toInt()
    }
    if (r == t) println("YES") else println("NO")
}