package easy;

import java.util.Scanner;

public class Problem5JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s = scanner.next();
            int x = scanner.nextInt();
            System.out.printf("%-15s%03d%n", s, x);
        }
        System.out.println("================================");
    }
}