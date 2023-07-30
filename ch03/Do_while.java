package ch03;

import java.io.Console;

public class Do_while {
    public static void main(String[] args) {
        Console console = System.console();
        int a = Integer.parseInt(console.readLine("Enter a number: "));
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();
        }
    }
