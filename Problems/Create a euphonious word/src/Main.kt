fun main() {
    // write your code here
    val v = arrayOf('a', 'e', 'i', 'o', 'u', 'y')
    val c = arrayOf('q', 'w', 'r', 't', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm')
    val a = readLine()!!
    var r = 0
    var i = 0
    while (i < a.length - 2) {
        if (v.contains(a[i]) && v.contains(a[i + 1]) && v.contains(a[i + 2]) ||
            c.contains(a[i]) && c.contains(a[i + 1]) && c.contains(a[i + 2])) {
            r++
            i += 2
        } else i++
    }
    println(r)
}
