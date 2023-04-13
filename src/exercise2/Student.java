package exercise2;

public class Student {

    private String name;
    private int age;

    public Student (final String name) {
        this.name = name;
        this.age = 15;
    }

    public Student (final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public String toString() {
        return name + ", " + age;
    }
}
