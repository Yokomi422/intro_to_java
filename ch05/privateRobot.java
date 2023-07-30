package ch05;
public class privateRobot {
    private String name;
    public void sayHello() {
        System.out.println(name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}