package CommandManager.Commands.Help;

import WorkingWithFiles.Reader.Extensions;
import WorkingWithFiles.Reader.MyReader;

import java.io.IOException;

public class Help {

    public static String command() throws IOException {
        return (new MyReader()).read("src\\CommandManager\\Commands\\Help\\HelpMessage", Extensions.txt);
    }

}
