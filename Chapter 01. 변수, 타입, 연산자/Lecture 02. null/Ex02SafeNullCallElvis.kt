/**
 SafeNullCall : ?변수의 메서드를 호출하면, 변수 평가값이 null이면 결과값도 null이다.

 Elvis 연산자
 - 표현식 ?: 표현식
 - 앞에 있는 표현식을 평가한 결과가 null일때, 뒤의 값을 대신 반환하도록 함.

 */

fun main() {
    val str: String? = null
    // str.length null 가능 변수는 일반적인 방법으로 바로 호출 불가능하다. null일 수 있으면 '?'를 명시적으로 달아야함
    println(str?.length) // str?이  null 이면 결과값도 null이 된다.
    println(str?.length ?: 0) // elvis 연산자 : 앞의 표현식을 평가한 값이 null이면 뒤의 값을 반환
}
