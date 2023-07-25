/**
 * 기본형의 boxing, unboxing을 고려할 필요 없도록 Kotlin이 알아서 처리해준다.
 */
fun main() {
    var number1: Long = 10L
    println("number1 = ${number1}")

    var number2: Long = 1_000L
    println("number2 = ${number2}")
}
