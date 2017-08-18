package utils;

/**
 * Created by denglob on 8/16/17.
 */
public class MessageUtils {

    public static String concat (String ... args) {
        StringBuilder row = new StringBuilder();
        for (String value : args) {
            row.append(value);
        }
        return row.toString();
    }
}
