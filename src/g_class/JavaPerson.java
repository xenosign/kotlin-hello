package g_class;

public class JavaPerson {
    private final String name;
    private int age;

    public JavaPerson(String name, int age) {
        if (this.age < 0) throw new IllegalArgumentException("나이는 0세 이상이여야 합니다");

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
