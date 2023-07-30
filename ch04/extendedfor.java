package ch04;
import java.io.Console;

public class extendedfor {
    public static void main(String[] args) {
        Console console = System.console();
        int[] scores = new int[10];
        for (int i = 0; i < 10; i++) {
            int inputScore = Integer.parseInt(console.readLine());
            scores[i] = inputScore;
        }
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += scores[i];

        }
        int average = total / scores.length;
        System.out.println(average);
    }
}