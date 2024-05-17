package ovningfyra;

public class MyOwnException extends Exception {
    private static final long serialVersionUID = 19294021L;

    public MyOwnException() {
    }

    public MyOwnException(String message) {
        super(message);
    }

    public MyOwnException(String message, Throwable cause) {
        super(message, cause);
    }
}