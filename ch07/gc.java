package ch07;
public class gc {
    public static void main(String[] args) {
        Sample s = new Sample("tanaka");
        s.sayHello();
        s = null;
    }
}

class Sample {
    String name;
    Sample(String name) {
        this.name = name;
    }
    public void sayHello() {
        System.out.println("hello");
    }
}