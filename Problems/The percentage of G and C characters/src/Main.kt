fun main() {
    // write your code here
    val a = readLine()!!.toLowerCase()
    val b = a.split("c", "g").count() - 1.0
    println(b / a.length * 100)
}