import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var amm = scanner.nextInt()
    var ost = 1
    var a = 0
    do {
        a = scanner.nextInt()
        amm -= a
        if (amm >= 0) {
            ost = 1
        } else {
            ost = 0
        }
    }
    while (scanner.hasNextInt())
    if (ost == 1) {
        println("Thank you for choosing us to manage your account! You have $amm money.")
    } else {
        println("Error, insufficient funds for the purchase. You have ${amm + a}, but you need $a.")
    }

}