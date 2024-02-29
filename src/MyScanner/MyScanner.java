package MyScanner;

import java.util.Scanner;

/**
 * Для ввода строки пользователя.
 */
public class MyScanner {
    public static String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
