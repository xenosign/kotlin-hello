package a_variable

fun main() {
    var stringBuffer: StringBuffer = StringBuffer("Hello, Kotlin");
    var stringBuilder: StringBuilder = StringBuilder("Hello, Kotlin");
    var stringValue: String = "Hello, Kotlin";

    println(stringBuffer);
    println(stringBuilder);
    println(stringValue);

    println(stringValue.length);
    println(stringValue.startsWith('H'));
    println(stringValue.startsWith('e'));

    var formatValue: String = String.format("%s %s", "Hello", "Kotlin");
    println(formatValue);
}