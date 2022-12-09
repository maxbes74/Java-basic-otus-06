public class DiameterException extends Exception{

    public DiameterException(String s) {
    }

    public DiameterException(String message, Throwable cause) {
        super(message, cause);
    }

    public DiameterException(Throwable cause) {
        super(cause);
    }

    public DiameterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DiameterException() {
    }
}
