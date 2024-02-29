package CommandManager.StringParser;

/**
 * Достает из строки пользователя команду и значение.
 */
public class StringParser {
    public final String string = "";

    /**
     * @param value строка пользователя.
     * @return массив, в котором есть команда и аргумент.
     */
    public String[] find(String value) {

        String[] values = value.trim().toLowerCase().split(" ");
        if (values.length == 2 && values[1].charAt(0) == '{' && values[1].charAt(values[1].length() - 1) == '}') {
            String argument = values[1].replaceAll("\\{", "").replaceAll("}", "");
            values[1] = argument;
            return values;
        }

        return values;
    }
}
