package Glava11;

public class BadExeption extends Exception{
    public BadExeption() {
        super();
    }

    public BadExeption(String message) {
        super(message);
    }

    public BadExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public BadExeption(Throwable cause) {
        super(cause);
    }

    protected BadExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
