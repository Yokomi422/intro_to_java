package ch07;
public class constructor {
    public static void main(String[] args) {
        Person tanaka = new Person("tanaka", 10);
        tanaka.sayHello();
        Person ando = new Person("ando");
        ando.sayHello();
    }
}
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person(String name) {
        this(name, 0);
    }
    public void sayHello() {
        System.out.println("I am " + name + ". I am " + age + " years old.");
    }
}
