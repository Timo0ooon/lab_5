package CommandManager.Commands.Help;

import WorkingWithFiles.Reader.Extensions;
import WorkingWithFiles.Reader.MyReader;

import java.io.IOException;

/**
 * Help is used in CommandsManager class.
 */
public class Help {

    /**
     * Method reads HelpMessage.txt file and returns string.
     *
     * @return help with commands.
     * @throws IOException exception with input and output.
     */
    public static String command() throws IOException {
        return (new MyReader()).read("src\\CommandManager\\Commands\\Help\\HelpMessage", Extensions.txt);
    }

}
