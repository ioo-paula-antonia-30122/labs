package isp.lab7.safehome;

public class TooManyAttemptsException extends RuntimeException{
    public TooManyAttemptsException(String message) {
        super(message);
    }
}
