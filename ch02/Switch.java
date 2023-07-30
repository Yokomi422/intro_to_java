package ch02;

import java.io.Console;

public class Switch {
    public static void main(String args[]) throws Exception {
        Console console = System.console();
        int a = Integer.parseInt(console.readLine("a: "));
        switch (a) {
            case 1:
                System.out.println("a == 1");
                break;
            case 2:
                System.out.println("a == 2");
                break;
            default:
                System.out.println("a != 1 && a != 2");
                break;
        }
    }
}