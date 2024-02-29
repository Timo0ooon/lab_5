package Exceptions;

public class UnknownValue extends RuntimeException {
    private final String message;

    public UnknownValue(String message) {
        this.message = message;
    }

    public String get() { return this.message; }
}
