package utils.exceptions;

/**
 * Created by denglob on 8/16/17.
 */
public class IllegalPriceException extends IllegalArgumentException {

    private final static String MESSAGE = "Wrong price";

    public IllegalPriceException() {
        super(MESSAGE);
    }

    public IllegalPriceException(String s) {
        super(s);
    }
}
