package Main;

import Application.ConsoleApp;

/**
 * Здесь запускается программа. В качестве переменной окружения нужно поставить имя файла, который дальше будет использоваться в программе
 */
public class Main {

    public static void main(String[] args) {
        String[] values = new String[args.length];
        System.arraycopy(args, 0, values, 0, values.length);

        String file_name = FileNameFind.find(values);
        FileName.set(file_name);

        if (FileValidator.check(file_name)) {
            ConsoleApp app = new ConsoleApp(file_name);
            app.run();
        }

        else {
            System.out.println("\nFile not found!\n");
        }
    }
}