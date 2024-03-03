package Application;

import Application.ConsoleAppInterface.ConsoleAppInterface;
import CommandManager.CommandManager;
import Main.Main;
import MyScanner.MyScanner;

/**
 * ConsoleApp class to run Application
 */
public class ConsoleApp implements ConsoleAppInterface {

    /**
     * Method starts a program.
     */
    @Override
    public void run() {
        CommandManager commandManager = new CommandManager();
        System.out.println("Write command 'help' to see commands\n");

        while (true) {
            System.out.print("Write a command: ");
            String user_string = MyScanner.input();

            commandManager.findCommand(user_string);
        }
    }
}
