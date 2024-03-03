package MyScanner;

import java.util.Scanner;

/**
 * To enter a user string.
 */
public class MyScanner {
    public static String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
