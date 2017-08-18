package utils.exceptions;

import utils.MessageUtils;

/**
 * Created by denglob on 8/17/17.
 */
public class ExceptionUtils {
    public static void notIllegalPriceException(int priceFrom, int priceTo) {
        if (priceFrom >= priceTo)
            throw new IllegalPriceException(MessageUtils.concat(
                    "Wrong price. ",
                    String.valueOf(priceTo),
                    " should be less than ",
                    String.valueOf(priceFrom)));
    }
}
