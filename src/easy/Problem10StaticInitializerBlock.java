package easy;

import java.util.Scanner;

public class Problem10StaticInitializerBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if (b > 0 && h > 0) {
            System.out.println(b * h);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
