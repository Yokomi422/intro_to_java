package ch07;
public class instance {
    public static void main(String[] args) {
        UseReference a = new UseReference();
        a.setName("yokomi");
        UseReference b = a;
        a.sayHello();
        b.setName("yokomi422");
        a.sayHello();
        b.sayHello();
    }
}

class UseReference {
    public String name;
    public void sayHello() {
        System.out.println("Hello, I ` am " + name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}