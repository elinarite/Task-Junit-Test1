package Matrix;

public class IncorrectIndexException extends RuntimeException {
    public IncorrectIndexException(String message) {
        super(message);
    }
}