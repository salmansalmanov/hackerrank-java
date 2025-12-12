package easy;

import java.util.Scanner;

public class Problem19JavaStringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        s = s.trim();
        String[] tokens = new String[s.length()];
        int tokenIndex = 0;
        int tokenCount = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isAlphabetic(currentChar)) {
                sb.append(currentChar);
            } else {
                tokens[tokenIndex++] = sb.toString();
                sb = new StringBuilder();
            }
        }

        if (!sb.isEmpty()) {
            tokens[tokenIndex++] = sb.toString();
        }

        for (String token : tokens) {
            if (token != null) {
                if (!token.isBlank()) {
                    tokenCount++;
                }
            }
        }
        System.out.println(tokenCount);

        for (String token : tokens) {
            if (token != null) {
                if (!token.isBlank()) {
                    System.out.println(token);
                }
            }
        }
    }
}
