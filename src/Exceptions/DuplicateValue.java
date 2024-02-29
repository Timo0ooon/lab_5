package Exceptions;

public class DuplicateValue extends RuntimeException {
    private final String message;

    public DuplicateValue(String message) {
        this.message = message;
    }

    public String get() { return this.message; }
}
