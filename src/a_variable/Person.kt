package a_variable

class Person(name: String) {
    // 프로퍼티 자동 생성
    // getter, setter 역시 자동으로 생성

    // getter, setter 를 쓰는경우는 커스텀 로직 또는 접근 제어가 설정시 가능
    var name = name
        get() = field.uppercase()   // 커스텀 로직이 필요할 때만 명시적으로 작성
        public set                 // 접근 제어자 변경이 필요할 때
}