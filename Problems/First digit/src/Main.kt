fun main() {
    // put your code here
    for (i in readLine()!!) {
        if (i.isDigit()) {
            println(i)
            break
        }
    }
}