package e_conditional

fun main() {
    println(judgeGrade(80));
    println("점수에 대한 학점은 ${judgeGrade2(80)}");
}

fun judgeGrade(score: Int): String {
    var grade: String = "";

    if (score >= 90) grade = "A";
    else if (80 <= score && score < 90) grade = "B";
    else if (70 <= score && score < 80) grade = "B";
    else if (60 <= score && score < 70) grade = "B";
    else grade = "F";

    return "점수에 대한 학점은 ${grade}";
}

fun judgeGrade2(score: Int): String {
    return when (score) {
        in 90 .. Int.MAX_VALUE -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        in 60 .. 69 -> "D"
        else -> "F"
    }
}