package Application;

import Application.ConsoleAppInterface.ConsoleAppInterface;
import CommandManager.CommandManager;
import MyScanner.MyScanner;

/**
 * ConsoleApp class to run Application
 */
public class ConsoleApp implements ConsoleAppInterface {
    private final String file_name;

    /**
     * @param FileName имя файла csv, где хранится коллекция. Файл должен храниться в папке Data.
     */
    public ConsoleApp(String FileName) {
        this.file_name = FileName;
    }

    /**
     * Запускает программу.
     */
    @Override
    public void run() {
        CommandManager commandManager = new CommandManager(this.file_name);
        System.out.println("Write command 'help' to see commands\n");

        while (true) {
            System.out.print("Write a command: ");
            String user_string = MyScanner.input();

            commandManager.findCommand(user_string);
        }
    }
}
