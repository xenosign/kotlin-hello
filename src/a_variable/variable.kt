package a_variable

fun main() {
    // var 가변, val 불변
    // JS 처럼 일단 불변 변수를 쓰고, 필요시 가변으로 변경이 좋다
    var num1 = 10;
    val num2 = 10;

    // 타입 작성은 : 를 사용
    var num3: Long = 10L;
    val num4: Int = 10;

    // 초기값 지정
    // 모든 변수는 타입 지정을 하면 초기값을 안넣어도 된다. val 의 경우 최초 1회 값 지정 가능
    // 단, 사용하려고 하면 에러 발생
    var num5: Long;  // println(num5) 을 하여고 하면 에러 발생
    val num6: Int;
    num6 = 6;
    println(num3 + num6); // 정수형 데이터는 연산 가능

    // 코틀린은 객체형과 원시형을 알아서 변경해 준다
    // Tool -> Kotlin -> Kotlin 바이트 코드 표시 -> 디컴파일을 하면 Java 로 확인 가능
    
    // nullable 에 관련된 사항
    // 변수에 null 이 들어갈 수 있는 경우 타입에 ? 를 붙여줘야 한다. ? 없으면 에러
    var num7: Int? = 10;
    num7 = null;

    // 클래스에서는 클래스 타입과 new 사용 불필요
    var person = Person("이효석");
}