package easy;

import java.util.Scanner;

public class Problem21JavaRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(input.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    String pattern =
            "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.)){3}" +
                    "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
}
