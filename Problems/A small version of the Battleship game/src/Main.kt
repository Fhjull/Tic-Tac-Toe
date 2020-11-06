fun main() {
    // put your code here 1 2 2 3 4 1
    val a = readLine()!!
    val xx: MutableList<Int> = mutableListOf()
    val yy: MutableList<Int> = mutableListOf()

    for (x in 1..5) {
        if (x == a[0].toString().toInt() ||
            x == a[4].toString().toInt() ||
            x == a[8].toString().toInt()) continue
        xx.add(x)
    }
    println()
    for (y in 1..5) {
        if (y == a[2].toString().toInt() ||
            y == a[6].toString().toInt() ||
            y == a[10].toString().toInt()) continue
        yy.add(y)
    }
    println(xx.joinToString(" "))
    println(yy.joinToString(" "))
}