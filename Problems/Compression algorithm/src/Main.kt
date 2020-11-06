fun main() {
    // write your code here
    val a = readLine()!!
    if (a.isNotEmpty()) {
        val l = mutableListOf(a[0].toString())
        var c = 1
        for (i in 1..a.lastIndex) {
            if (a[i] == a[i - 1]) {
                c++
            } else {
                l.add(c.toString())
                l.add(a[i].toString())
                c = 1
            }
        }
        l.add(c.toString())
        println(l.toTypedArray().joinToString(""))
    }
}