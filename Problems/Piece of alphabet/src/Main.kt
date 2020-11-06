fun main() {
    // write your code here
    val a = readLine()!!
    var r = true
    if (a.length > 1) {
        for (i in 0 until a.lastIndex) {
            if (a[i] + 1 == a[i + 1]) {
                r = true
            } else {
                r = false
                break
            }
        }
    }
    println(r)
}