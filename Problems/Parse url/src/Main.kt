fun main() {
    // write your code here
    val a = readLine()!!.split("?", "=", "&")
    for (i in 1..a.lastIndex step 2) {
        println(
            "${a[i]} : " +
                    if (a[i + 1].isNotEmpty()) {
                        a[i + 1]
                    } else "not found"
        )
    }
    for (i in a.indices) {
        if (a[i] == "pass") {
            println("password : ${a[i + 1]}")
        }
    }
}