fun main() {
    // write your code here
    val a = readLine()!!
    if (a[0].toString().toInt() + a[1].toString().toInt() + a[2].toString().toInt() ==
        a[3].toString().toInt() + a[4].toString().toInt() + a[5].toString().toInt()) {
        println("Lucky")
    } else println("Regular")
}