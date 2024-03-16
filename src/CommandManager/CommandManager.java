package CommandManager;

import CollectionManager.CollectionManager;
import CommandManager.Commands.Help.Help;
import CommandManager.Commands.*;
import CommandManager.StringParser.StringParser;

import Exceptions.DuplicateValue;
import Exceptions.EmptyValue;
import Exceptions.UnknownValue;

import Main.Main;
import Model.HumanBeing.HumanBeing;

import java.io.IOException;


/**
 * Class CommandManager needed to work with user input.
 */
public class CommandManager {

    private final String file_name;
    private final CollectionManager collectionManager;

    public CommandManager() {
        this.collectionManager = new CollectionManager();
        this.file_name = System.getProperty(Main.value);

    }

    /**
     * Method searches for and executes a command entered by the user interactively.
     *
     * @param user_value is user string.
     */
    public void findCommand(String user_value) {
        StringParser parser = new StringParser();
        String[] CommandAndArgument = parser.find(user_value);

        if (CommandAndArgument.length >= 1) {
            String command = CommandAndArgument[0].trim().toLowerCase();

            switch (command) {

                case ("help") -> {

                    try {
                        System.out.println(Help.command());
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println("\nUnknown Error!\n");
                    }
                }

                case ("info") -> {

                    try {
                        System.out.println(this.collectionManager.getInfo());
                    } catch (EmptyValue e) {
                        System.out.println(e.get());
                    } catch (Exception e) {
                        System.out.println("\nUnknown Error!\n");
                    }
                }

                case ("show") -> {
                    try {
                        collectionManager.show();
                        for (Integer key : this.collectionManager.get().keySet()) {
                            System.out.println("\nKey: " + key + "\n" + this.collectionManager.get().get(key) + "\n");
                        }

                    } catch (EmptyValue e) {
                        System.out.println("\n" + e.get() + "\n");
                    }
                }

                case ("insert") -> {

                    try {

                        if (CommandAndArgument.length == 2) {

                            String argument = CommandAndArgument[1];

                            int key = Integer.parseInt(argument);
                            this.collectionManager.insert(key);

                            System.out.println("\nUser added!\n");
                        } else {
                            System.out.println("\nWrite Argument!\n");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("\nWrite a number!\n");
                    } catch (DuplicateValue e) {
                        System.out.println(e.get());
                    }

                }

                case ("update_id") -> {

                    try {

                        if (CommandAndArgument.length == 2) {
                            System.out.println();

                            String argument = CommandAndArgument[1];

                            int key = Integer.parseInt(argument);
                            this.collectionManager.updateID(key);

                            System.out.println("\nUser id updated!\n");
                        } else {
                            System.out.println("\nWrite Argument!\n");
                        }
                    } catch (UnknownValue e) {
                        System.out.println(e.get());
                    }
                }

                case ("remove_key") -> {

                    try {

                        if (CommandAndArgument.length == 2) {

                            String argument = CommandAndArgument[1];
                            int key = Integer.parseInt(argument);

                            System.out.println(this.collectionManager.removeKey(key));
                            System.out.println("\nKer removed!\n");
                        } else {
                            System.out.println("\nWrite Argument!\n");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("\nUnknown value!\n");

                    } catch (UnknownValue e) {
                        System.out.println(e.get());

                    } catch (Exception e) {
                        System.out.println("\nUnknown Error!\n");

                    }
                }

                case ("clear") -> {

                    try {
                        System.out.println();
                        this.collectionManager.clear();
                        System.out.println("\nCollection cleared!\n");
                    } catch (EmptyValue e) {
                        System.out.println(e.get());
                    } catch (Exception e) {
                        System.out.println("\nUnknown message!\n");
                    }
                }

                case ("save") -> {
                    Save.command(this.collectionManager.get(), this.file_name);
                }

                case ("execute_script") -> {

                    try {
                        if (CommandAndArgument.length == 2) {
                            String argument = CommandAndArgument[1];

                            ExecuteScript.command(argument);
                        } else {
                            System.out.println("\nWrite argument!\n");
                        }

                    } catch (Exception e) {
                        System.out.print("\nUnknown error!\n");
                    }
                }

                case ("exit") -> {

                    try {
                        Exit.command();
                    } catch (Exception e) {
                        System.out.println("\nUnknown error!\n");
                    }
                }

                case ("remove_greater") -> {

                    try {

                        if (CommandAndArgument.length == 2) {
                            String argument = CommandAndArgument[1];
                            int key = Integer.parseInt(argument);

                            for (HumanBeing human : this.collectionManager.removeGreater(key)) {
                                System.out.println("\n" + human + "\n");
                            }
                        } else {
                            System.out.println("\nWrite Argument!\n");
                        }
                    } catch (EmptyValue e) {
                        System.out.println(e.get());
                    } catch (NumberFormatException e) {
                        System.out.println("\nArgument must be integer!\n");
                    } catch (Exception e) {
                        System.out.println("\nUnknown error!\n");
                    }


                }

                case ("remove_lower") -> {

                    try {

                        if (CommandAndArgument.length == 2) {
                            String argument = CommandAndArgument[1];
                            int key = Integer.parseInt(argument);

                            for (HumanBeing human : this.collectionManager.removeLower(key)) {
                                System.out.println("\n" + human + "\n");
                            }

                        } else {
                            System.out.println("\nWrite Argument!\n");
                        }
                    } catch (EmptyValue e) {
                        System.out.println(e.get());
                    } catch (NumberFormatException e) {
                        System.out.println("\nArgument must be integer!\n");
                    } catch (Exception e) {
                        System.out.println("\nUnknown error!\n");
                    }
                }

                case ("replace_if_lowe") -> {

                    try {

                        if (CommandAndArgument.length == 2) {

                            String argument = CommandAndArgument[1];

                            int key = Integer.parseInt(argument);
                            HumanBeing human = new HumanBeing();

                            this.collectionManager.replaceIfLowe(human, key);
                        } else {
                            System.out.println("\nWrite Argument!\n");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("\nArgument must be integer!\n");
                    } catch (Exception e) {
                        System.out.println("\nUnknown error!\n");
                    }
                }

                case ("average_of_impact_speed") -> {

                    try {
                        System.out.println("\n" + this.collectionManager.getAverageOfImpactSpeed() + "\n");
                    } catch (EmptyValue e) {
                        System.out.println(e.get());
                    } catch (Exception e) {
                        System.out.println("\nUnknown error!\n");
                    }
                }

                case ("has_toothpick") -> {

                    try {
                        for (HumanBeing human : this.collectionManager.hasToothPick()) {
                            System.out.println("\n" + human + "\n");
                        }
                    } catch (EmptyValue e) {
                        System.out.println(e.get());
                    } catch (Exception e) {
                        System.out.println("\nUnknown error!\n");
                    }
                }

                case ("max_by_impact_speed") -> {

                    try {
                        System.out.println("\n" + this.collectionManager.getMaxByImpactSpeed() + "\n");
                    } catch (EmptyValue e) {
                        System.out.println(e.get());
                    } catch (Exception e) {
                        System.out.println("\nUnknown error!\n");
                    }
                }

                default -> {
                    System.out.println("\nUnknown command!\n");
                }
            }


        } else {
            System.out.println("\nYou can write command 'help' to see other commands.\n");
        }
    }
}
