package homework.employee;

public class PositionNotFoundException extends RuntimeException {

    public PositionNotFoundException() {
    }

    public PositionNotFoundException(String message) {
        super(message);
    }

    public PositionNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PositionNotFoundException(Throwable cause) {
        super(cause);
    }

    public PositionNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
