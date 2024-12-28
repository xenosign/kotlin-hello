package d_operator

fun main() {
    val money1 = Money(100);
    val money2 = money1;
    val money3 = Money(100);
    
    // 코틀린의 == -> 구조적 동일성(동등성), equals 호출과 동일, 객체의 값이 같은지 비교
    // 코틀린의 === -> 참조적 동일성(동일성), 객체의 주소를 비교

    println(money1 == money2);
    println(money1 === money2);
    println(money1 == money3);  // 값이 같으므로 true
    println(money1 === money3); // 주소는 다르므로 false
    
    // in, !in  -> 컬렉션에 포함되는지 연산
    // a..b -> 범위 객체 생성
    // 코틀린에서는 기본 연산자 직접 정의 가능 +, -, % 등
}
