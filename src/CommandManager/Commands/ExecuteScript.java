package CommandManager.Commands;

import CommandManager.CommandManager;
import DataProvider.Values;
import Main.Main;
import WorkingWithFiles.Reader.Extensions;
import WorkingWithFiles.Reader.MyReader;

import java.io.IOException;

/**
 * Class used in CommandManager class.
 */
public class ExecuteScript {

    /**
     * Method reads and executes a script from a csv file. The file should be stored in the Files folder.
     *
     * @param file_name is name of file where file must be located in Files folder.
     * @throws IOException exception with input and output.
     */
    public static void command(String file_name) throws IOException {
        CommandManager commandManager = new CommandManager();
        MyReader reader = new MyReader();
        String[] commands = reader.read(Values.root_folder.get() + Values.separator.get() + "Files" + Values.separator.get() + file_name, Extensions.csv).split("\n");

        for (String command : commands) {
            commandManager.findCommand(command);
        }
    }
}
