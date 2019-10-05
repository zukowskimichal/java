package pl.dev.java.essentials.exceptions;

public class TechnicalException extends RuntimeException {

    private String message;

    TechnicalException(String message, Exception cause) {
        super(message, cause);
    }

    public String get() {
        return this.message;
    }
}
