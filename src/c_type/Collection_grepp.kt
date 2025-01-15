package c_type

fun main() {
    val readOnly: List<String> = listOf("구글", "페북", "마소");

    for (company in readOnly) {
        println(company);
    }

    // it!!
    readOnly.forEach({
        println(it);
    });

    // 리턴이 null 인 경우에만 ?: 수행
    println( readOnly.indexOf("네이버") ?: "없어요" );

    // val 에 Mutable 지정 가능
    val chageable: MutableList<String> = mutableListOf("구글", "페북", "마소");
    chageable[1] = "메타";
    chageable.forEach({
        println(it);
    });

    var chageable2: MutableList<String> = mutableListOf("구글", "페북", "마소");

    // val 이므로 새로운 컬렉션을 대입하면 에러 발생
    // chageable = mutableListOf("네이버", "카카오", "쿠팡"); // Err
    chageable2 = mutableListOf("네이버", "카카오", "쿠팡"); // var 라서 새로운 컬렉션 대입 가능

    chageable.sort()
    println(chageable);

    val mutableSet: MutableSet<String> = mutableSetOf("구글", "메타", "구글", "아마존");
    println(mutableSet);
    mutableSet.forEach({
        println(it);
    })
}