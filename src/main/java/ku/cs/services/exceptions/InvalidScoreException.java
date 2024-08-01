package ku.cs.services.exceptions;

public class InvalidScoreException extends IllegalArgumentException {
    public InvalidScoreException(String message) {
        // เรียก constructor ของ super class ในที่นี้คือ IllegalArgumentException
        super(message);
    }
}
