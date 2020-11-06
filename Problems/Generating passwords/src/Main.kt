fun main() {
    // write your code here
    val s = readLine()!!.split(" ")
    val upC = s[0].toInt()
    val lowC = s[1].toInt()
    val dig = s[2].toInt()
    val n = s[3].toInt() - upC - lowC - dig
    if (upC > 26) {
        repeat(upC / 26) {
            for (i in 'A'..'Z') print(i)
        }
    }
    var l = 'A'
    repeat(upC % 26) {
        print(l)
        l++
    }
    if (lowC > 26) {
        repeat(lowC / 26) {
            for (i in 'a'..'z') print(i)
        }
    }
    var k = 'a'
    repeat(lowC % 26) {
        print(k)
        k++
    }
    if (dig > 9) {
        repeat(dig / 9) {
            for (i in 1..9) print(i)
        }
    }
    var j = 1
    repeat(dig % 9) {
        print(j)
        j++
    }
    if (n > 26) {
        repeat(n / 25) {
            for (i in 'B'..'Z') print(i)
        }
    }
    var h = 'B'
    repeat(n % 25) {
        print(h)
        h++
    }
}