fun main() {
    // write your code here
    val a = readLine()!!.toLowerCase()
    var r = -1
    if (a.contains("the")) {
        val b = a.split("the")
        r = b[0].length
    }
    println(r)
}