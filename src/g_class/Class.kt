package g_class

fun main() {
    val javaPerson = JavaPerson("이효석", 41);
    println(javaPerson.name);
    javaPerson.age = 42;
    println(javaPerson.age);

    val kotlinPerson = KotlinPerson2("이효석", 41);
    println(kotlinPerson.name);
    kotlinPerson.age = 42;
    println(kotlinPerson.age);
}

// 필드 선언 및 중괄호 생략 가능
class KotlinPerson2(
    val name: String,
    var age: Int
) {
    init {
        if (age < 0) throw IllegalArgumentException("나이는 0세 이상이어야 합니다");
    }
}

// constructor 생략 가능
class KotlinPerson1(name: String, age: Int) {
    val name = name;
    var age = age;
}


// Getter, Setter 자동 생성
class KotlinPerson constructor(name: String, age: Int) {
    val name = name;
    var age = age;
}
