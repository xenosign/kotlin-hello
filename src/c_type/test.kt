package c_type

class Person1(name: String, age: Int) {
    // 보조 생성자는 주 생성자를 위임
    constructor(name: String) : this(name, 20);
    constructor() : this("홍길동", 26);
    
    var name: String = name;
    var age: Int = age;
}

fun main() {
    var p1: Person1 = Person1("박문수", 22);
    println("${p1.name} ${p1.age}");

    var p2: Person1 = Person1("이몽룡");
    println("${p2.name} ${p2.age}");

    var p3: Person1 = Person1();
    println("${p3.name} ${p3.age}");
}