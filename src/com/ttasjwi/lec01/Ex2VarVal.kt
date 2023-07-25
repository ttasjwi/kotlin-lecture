/**
 * var : 재할당 가능
 * val : 재할당 불가능 (final)
 */
fun main() {
    var number1: Long = 10L
    number1 = 5L
    println("number1 = ${number1}")

    val number2: Long = 10L
    // number2 = 10L // (Compile Error) Val cannot be reassigned
    println("number2 = ${number2}")
}
