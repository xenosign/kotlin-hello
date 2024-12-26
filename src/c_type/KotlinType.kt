package c_type

// 코틀린 만의 타입 3가지
// 1. Any -> 아무 타입이나 가능 -> Object 역할
// Any 는 null 을 포함할 수 없어 Any? 로 사용해야 함

// 2. Unit -> void 와 같은 역할
// Unit 은 타입 인자로도 사용 가능
// 함수형 코딩에서 인스턴스가 하나인 타입을 의미한다

// 3. Nothing -> 함수가 정상적으로 끝나지 않았다는 것을 표현
// 무조건 예외를 던지는 함수 / 무한 루프 함수 등에서 사용 가능
fun fail(msg: String): Nothing {
    throw IllegalArgumentException(msg);
}

fun main() {
    // JS 와 같이 문자열 내부에서 ${} 사용 가능, String interpolation
    val person = Person("이효석", 40);
    System.out.println(String.format("이름 : %s", person.name));
    println("이름 : ${person.name}");

    val name = "이효석";
    println("이름 : $name"); // 이거도 가능 하지만 ${} 추천

    // 백틱처럼 쓰기 -> """ 따옴표 3개
    val str = """
        ABC
        EFG
        ${name}
    """.trimIndent();

    println(str);

    // charAt() 말고 JS 처럼 문자열 배열 바로 접근 가능
    val str2 = "ABCD";
    println(str2[1]); // B
}
