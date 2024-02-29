package Exceptions;

public class EmptyValue extends RuntimeException {
    private final String message;
    public EmptyValue(String message) {
        this.message = message;
    }

    public String get() {
        return this.message;
    }
}
