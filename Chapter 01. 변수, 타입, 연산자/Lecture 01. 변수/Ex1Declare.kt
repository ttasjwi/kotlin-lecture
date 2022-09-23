/**
 * 변수 선언 및 할당
 */
fun main() {

    var number1: Long  // var number 초기화 없이 선언할 때, 타입을 반드시 지정해야한다.
    number1 = 1L // 변수에 값 할당
    println("number1 = $number1")

    val number2: Long // final
    number2 = 2L
    println("number2 = $number2")

    var number3: Int = 3 // 선언, 할당
    println("number3 = $number3")

    val number4 = 4 // 타입 생략 가능
    println("number4 = $number4")

}
