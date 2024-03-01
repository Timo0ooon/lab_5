package CommandManager.Commands;

import CommandManager.CommandManager;
import DataProvider.Values;
import Main.Main;
import WorkingWithFiles.Reader.Extensions;
import WorkingWithFiles.Reader.MyReader;

import java.io.IOException;

/**
 * Считывает и исполняет скрипт из файла csv. Файл должен храниться в папке Files.
 */
public class ExecuteScript {

    /**
     * @param file_name имя файла в папке Files.
     * @throws IOException исключение ввода-вывода.
     */
    public static void command(String file_name) throws IOException {
        CommandManager commandManager = new CommandManager(System.getProperty(Main.value));
        MyReader reader = new MyReader();
        String[] commands = reader.read(Values.root_folder.get() + Values.separator.get() + "Files" + Values.separator.get() + file_name, Extensions.csv).split("\n");

        for (String command: commands) {
            commandManager.findCommand(command);
        }
    }
}
