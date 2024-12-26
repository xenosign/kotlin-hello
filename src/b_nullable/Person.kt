package b_nullable

fun main() {
    val person = Person("테츠");
    // startWithA(person.name);
    // @Nullable 어노테이션으로 인해서 타입 안정성 위배, 컴파일 타임 에러 발생

    val person2 = Person2(null);
    println(startWithA(person2.name));
    // @Nullable 어노테이션이 없어서 코틀린이 컴파일 타임에서 타입 체크가 불가능 -> 런타임 에러 발생
}

fun startWithA(str: String): Boolean {
    return str.startsWith("A")
}