package CommandManager;

import CommandManager.Commands.Help.Help;
import CommandManager.Commands.*;
import CommandManager.StringParser.StringParser;

import DataProvider.Reader.CSVReader;

import Exceptions.DuplicateValue;
import Exceptions.EmptyValue;
import Exceptions.UnknownValue;

import Model.HumanBeing.HumanBeing;

import java.io.IOException;

import java.util.Hashtable;

/**
 * Ищет команду и исполняет ее, которую ввел пользователь в интерактивном режиме.
 */
public class CommandManager {

    private Hashtable<Integer, HumanBeing> collection;
    private final String file_name;

    /**
     * @param file_name файл в папке Data, которая используется для команд
     */
    public CommandManager(String file_name) {
        this.file_name = file_name;

        CSVReader reader = new CSVReader();

        this.collection = reader.read(this.file_name);


        if (this.collection == null)
            this.collection = new Hashtable<Integer, HumanBeing>();

    }

    public void findCommand(String user_value) {
        StringParser parser = new StringParser();
        String[] CommandAndArgument = parser.find(user_value);

        if (CommandAndArgument.length >= 1) {
            String command = CommandAndArgument[0].trim().toLowerCase();

            switch (command) {

                case ("help") -> {

                    try {
                        System.out.println(Help.command());
                    }

                    catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                    catch (Exception e) {
                        System.out.println("\nUnknown Error!\n");
                    }
                }

                case ("info") -> {

                    try {
                        System.out.println(Info.command(this.collection));
                    }

                    catch (EmptyValue e) {
                        System.out.println(e.get());
                    }

                    catch (Exception e) {
                        System.out.println("\nUnknown Error!\n");
                    }
                }

                case ("show") -> {
                    try {
                        for (HumanBeing human : Show.command(this.collection)) {
                            System.out.println("\n" + human + "\n");
                        }

                    }

                    catch (EmptyValue e) {
                        System.out.println("\n" + e.get() + "\n");
                    }
                }

                case ("insert") -> {

                    try {

                        if (CommandAndArgument.length == 2) {

                            String argument = CommandAndArgument[1];
                            int key = Integer.parseInt(argument);

                            Insert.command(this.collection, key);
                            System.out.println("\nUser added!\n");
                        }

                        else {
                            System.out.println("\nWrite Argument!\n");
                        }

                    }

                    catch (NumberFormatException e) {
                        System.out.println("\nWrite a number!\n");
                    }

                    catch (DuplicateValue e) {
                        System.out.println(e.get());
                    }

                }

                case ("update_id") -> {

                    try {

                        if (CommandAndArgument.length == 2) {
                            System.out.println();

                            String argument = CommandAndArgument[1];
                            int key = Integer.parseInt(argument);

                            UpdateId.command(collection, key);
                            System.out.println("\nUser id updated!\n");
                        }

                        else {
                            System.out.println("\nWrite Argument!\n");
                        }
                    }

                    catch (UnknownValue e) {
                        System.out.println(e.get());
                    }
                }

                case ("remove_key") -> {

                    try {

                        if (CommandAndArgument.length == 2) {
                            System.out.println();

                            String argument = CommandAndArgument[1];
                            int key = Integer.parseInt(argument);

                            System.out.println(RemoveKey.command(this.collection, key));
                            System.out.println("\nKer removed!\n");
                        }

                        else {
                            System.out.println("\nWrite Argument!\n");
                        }

                    }

                    catch (NumberFormatException e) {
                        System.out.println(e.getMessage());

                    }

                    catch (UnknownValue e) {
                        System.out.println(e.get());

                    }

                    catch (Exception e) {
                        System.out.println("\nUnknown Error!\n");

                    }
                }

                case ("clear") -> {

                    try {
                        System.out.println();
                        Clear.command(this.collection);
                        System.out.println("\nCollection cleared!\n");
                    }

                    catch (EmptyValue e) {
                        System.out.println(e.get());
                    }

                    catch (Exception e) {
                        System.out.println("\nUnknown message!\n");
                    }
                }

                case ("save") -> {
                    Save.command(this.collection, this.file_name);
                }

                case ("execute_script") -> {

                    try {
                        if (CommandAndArgument.length == 2) {
                            String argument = CommandAndArgument[1];

                            ExecuteScript.command(argument);
                        }
                        else {
                            System.out.println("\nWrite argument!\n");
                        }
                    }

                    catch (IOException e) {
                        System.out.println("\nError with file!\n");
                    }

                    catch (Exception e) {
                        System.out.println("\nUnknown error!\n");
                    }
                }

                case ("exit") -> {

                    try {
                        Exit.command();
                    }

                    catch (Exception e) {
                        System.out.println("\nUnknown error!\n");
                    }
                }

                case ("remove_greater") -> {

                    try {

                        if (CommandAndArgument.length == 2) {
                            String argument = CommandAndArgument[1];
                            int key = Integer.parseInt(argument);

                            for(HumanBeing human: RemoveGreater.command(this.collection, key)) {
                                System.out.println(human);
                            }
                        }

                        else {
                            System.out.println("\nWrite Argument!\n");
                        }
                    }

                    catch (EmptyValue e) {
                        System.out.println(e.get());
                    }
                    catch (NumberFormatException e) {
                        System.out.println("\nArgument must be integer!\n");
                    }

                    catch (Exception e) {
                        System.out.println("\nUnknown error!\n");
                    }


                }

                case ("remove_lower") -> {

                    try {

                        if (CommandAndArgument.length == 2) {
                            String argument = CommandAndArgument[1];
                            int key = Integer.parseInt(argument);

                            RemoveLower.command(this.collection, key);
                        }

                        else {
                            System.out.println("\nWrite Argument!\n");
                        }
                    }

                    catch (EmptyValue e) {
                        System.out.println(e.get());
                    }

                    catch (NumberFormatException e) {
                        System.out.println("\nArgument must be integer!\n");
                    }

                    catch (Exception e) {
                        System.out.println("\nUnknown error!\n");
                    }
                }

                case ("replace_if_lowe") -> {

                    try {

                        if (CommandAndArgument.length == 2) {
                            String argument = CommandAndArgument[1];
                            int key = Integer.parseInt(argument);

                            HumanBeing human = new HumanBeing();

                            ReplaceIfLowe.command(collection, key, human);
                        }

                        else {
                            System.out.println("\nWrite Argument!\n");
                        }
                    }

                    catch (NumberFormatException e) {
                        System.out.println("\nArgument must be integer!\n");
                    }

                    catch (Exception e) {
                        System.out.println("\nUnknown error!\n");
                    }
                }

                case ("average_of_impact_speed") -> {

                    try {
                        System.out.println("\n" + AverageOfImpactSpeed.command(collection) + "\n");
                    }

                    catch (EmptyValue e) {
                        System.out.println(e.get());
                    }

                    catch (Exception e) {
                        System.out.println("\nUnknown error!\n");
                    }
                }

                case ("has_toothpick") -> {

                    try {
                        for (HumanBeing human: HasToothpick.command(collection)) {
                            System.out.println("\n" + human + "\n");
                        }
                    }

                    catch (EmptyValue e) {
                        System.out.println(e.get());
                    }

                    catch (Exception e) {
                        System.out.println("\nUnknown error!\n");
                    }
                }

                case ("max_by_impact_speed") -> {

                    try {
                        System.out.println("\n" + MaxByImpactSpeed.command(collection) + "\n");
                    }

                    catch (EmptyValue e) {
                        System.out.println(e.get());
                    }

                    catch (Exception e) {
                        System.out.println("\nUnknown error!\n");
                    }
                }

                default -> {
                    System.out.println("\nUnknown command!\n");
                }
            }


        }

        else {
            System.out.println("\nYou can write command 'help' to see other commands.\n");
        }
    }
}
