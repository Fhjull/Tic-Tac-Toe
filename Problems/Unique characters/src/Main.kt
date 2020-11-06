fun main() {
    val a = readLine()!!
    var r = 0
    for (i in 'a'..'z') {
        if (a.split(i).size == 2) r++
    }
    println(r)
}