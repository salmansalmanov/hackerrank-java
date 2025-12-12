package easy;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Java12JavaDateAndTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        System.out.println(findDay(month, day, year));
    }

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.getDisplayName(
                Calendar.DAY_OF_WEEK,
                Calendar.LONG,
                Locale.ENGLISH
        ).toUpperCase();
    }
}
