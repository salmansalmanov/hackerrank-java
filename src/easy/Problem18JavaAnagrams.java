package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Problem18JavaAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();
        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] arrayA = new char[a.length()];
        char[] arrayB = new char[b.length()];

        for (int i = 0; i < a.length(); i++) {
            arrayA[i] = a.charAt(i);
        }
        for (int i = 0; i < b.length(); i++) {
            arrayB[i] = b.charAt(i);
        }
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        StringBuilder sbA = new StringBuilder();
        String resultA = sbA.append(arrayA).toString();

        StringBuilder sbB = new StringBuilder();
        String resultB = sbB.append(arrayB).toString();

        System.out.println(resultA.equals(resultB) ? "Anagrams" : "Not Anagrams");
    }
}
