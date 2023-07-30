package ch02;

public class Cond {
    public static void main(String args[]) {
        int a = 1, b = 2;
        if (a == b) {
            System.out.println("a == b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }
    }
}