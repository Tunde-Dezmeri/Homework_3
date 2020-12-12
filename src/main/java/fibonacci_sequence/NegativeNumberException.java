package fibonacci_sequence;

public class NegativeNumberException extends Exception {
    String message;

    public NegativeNumberException(String message) {
        super(message);
    }
    @Override
    public String toString() {
        return ("Output String = "+message);
    }
}
