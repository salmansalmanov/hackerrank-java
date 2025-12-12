package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Problem16JavaSubstringComparisons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int k = scanner.nextInt();
        scanner.close();

        String smallest;
        if (k > s.length()) {
            smallest = s;
        } else {
            smallest = s.substring(0, k);
        }
        String largest = smallest;

        for (int i = 1; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);

            if (sub.compareTo(smallest) < 0) {
                smallest = sub;
            }

            if (sub.compareTo(largest) > 0) {
                largest = sub;
            }
        }

        System.out.println(smallest);
        System.out.println(largest);
    }
}
