fun main() {
    // write your code here
    val a = readLine()!!
    if (a.length % 2 != 0) {
        println(a.substring(0, a.length / 2) + a.substring(a.length / 2 + 1, a.lastIndex + 1))
    } else {
        println(a.substring(0, a.length / 2 - 1) + a.substring(a.length / 2 + 1, a.lastIndex + 1))
    }
}