package ch02;

import java.io.Console;

public class Input {
    public static void main(String args[]) throws Exception {
        Console console = System.console();
        int a = Integer.parseInt(console.readLine("a: "));
        if (a > 10) {
            System.out.println("a > 10");
        } else {
            System.out.println("a <= 10");
        }
    }
}