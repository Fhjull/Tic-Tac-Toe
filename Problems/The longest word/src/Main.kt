fun main() {
    // write your code here
    val a = readLine()!!.split(" ")
    var r = ""
    for (i in a.indices) {
        if (a[i].length > r.length) r = a[i]
    }
    println(r)
}