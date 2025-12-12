package easy;

import java.util.Scanner;

public class Problem7JavaLoops2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int s = a;
            for (int j = 0; j < n; j++) {
                s += b * (int) Math.pow(2, j);
                if (j != n - 1) {
                    System.out.print(s + " ");
                } else {
                    System.out.println(s);
                }
            }
        }
    }
}