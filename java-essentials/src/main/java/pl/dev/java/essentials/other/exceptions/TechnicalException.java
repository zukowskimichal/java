package pl.dev.java.essentials.other.exceptions;

public class TechnicalException extends RuntimeException {

    private String message;

    TechnicalException(String message, Exception cause) {
        super(message, cause);
    }

    public String get() {
        return this.message;
    }
}
