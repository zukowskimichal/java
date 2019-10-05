package pl.dev.java.essentials.exceptions;

public class PortException extends TechnicalException {

    PortException(String message, Exception cause) {
        super(message, cause);
    }
}
