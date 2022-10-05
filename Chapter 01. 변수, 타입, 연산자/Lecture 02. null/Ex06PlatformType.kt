fun main() {
    val person: Person = Person("땃쥐")
    startsWithA(person.name)
    // java 클래스를 가져올 경우, @NotNull, @Nullable 과 같은 어노테이션을 통해 null 인지 여부를 판단해야한다.
    // 이런 어노테이션이 없는 경우, Null 가능성을 알 수 없는데 이들을 Platform Type 이라 한다.
    // 코틀린에서는 플랫폼타입을 무슨 타입으로 다룰지 모른다.
    // 사용 입장에서는 null인지 null 아닌지 양쪽을 염두하고 사용해야하는 것이다.
    // 플랫폼 타입은 최대한 사용하지 않도록 하는 것이 좋고 있다면 빠르게 제거할 수 있도록 하라.
}

fun startsWithA(str: String) : Boolean {
    return str.startsWith("A")
}
