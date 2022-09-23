/**
 * 기본적으로 변수에 null을 할당할 수 없다.
 * null을 할당할 수 있으려면 타입에 ?을 붙여야한다.
 */
fun main() {

    var number1 = 10L
    // number1 = null // 기본적인 변수에는 null이 들어갈 수 없게 설계됐다.
    println("number1 = ${number1}")

    var number2: Long? = 1000L
    number2 = null
    println("number2 = $number2")
}
