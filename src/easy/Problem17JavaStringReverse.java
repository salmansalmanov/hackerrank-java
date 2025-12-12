package easy;

import java.util.Scanner;

public class Problem17JavaStringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed.concat(String.valueOf(s.charAt(i)));
        }
        System.out.println(reversed.equals(s) ? "Yes" : "No");
    }
}
