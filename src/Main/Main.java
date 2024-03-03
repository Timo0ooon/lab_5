package Main;

import Application.ConsoleApp;

/**
 * This is where the program starts. You need to set the file name as an environment variable, which will then be used in the program
 */
public class Main {
    public static final String value = "path";

    public static void main(String[] args) {
        String[] values = new String[args.length];
        System.arraycopy(args, 0, values, 0, values.length);

        String file_name = FileNameFind.find(values);
        System.setProperty(value, file_name); // Set the environment variable.

        if (FileValidator.check(file_name)) {
            ConsoleApp app = new ConsoleApp();
            app.run();
        } else {
            System.out.println("\nFile not found!\n");
        }
    }
}
