package c_type

fun main() {
    // 코틀린은 초기값을 통해 타입을 추론한다
    val num1 = 3.0f; // float
    val num2 = 3.0; // double

    // 코틀린은 암시적 형변환을 컴파일 레벨에서 막는다
    // 따라서 toLong 같은 형변환 지시자 사용 필요
    val num3 = 4;
    // val num4: Long = num3; // 컴파일 에러 발생
    val num5: Long = num3.toLong(); // toLong 형변환 사용

    // 코틀린 문법을 사용해서 좀 더 Null Safe 한 코드 작성 가능
    val num6: Int? = 3;
    val num7: Long = num6?.toLong() ?: 0;
}

fun printAgeIfPerson(obj: Any?) {
    // if (obj !is Person) -> ! 를 사용해서 !(obj is Person) 과 같은 구문을 간단히 작성 가능
    if (obj is Person) {    // instance of 처럼 사용 가능
        println(obj.age);   // 스마트 캐스트를 통해서 알아서 형 변환을 해줌
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person;  // obj 가 null 이면 null 리턴, 아니면 Person 으로 형 변환
    println(person?.age);   // ? 연산자이므로 null 일 경우 실행을 안해서 NPE 발생 X
}