package tutorials.immutability.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample {
    public static void main(String[] args) {
        // The data is stored as binary in computer so, there might be a little difference
        double d1 = 0.1;
        double d2 = 0.2;

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1 + d2);   // 0.30000000000000004


        // To get the exact result, use BigDecimal -> Bank, financial, scientific areas
        BigDecimal big1 = new BigDecimal("0.1");
        BigDecimal big2 = new BigDecimal("0.2");

        System.out.println(big1);
        System.out.println(big2);
        BigDecimal sum = big1.add(big2);
        BigDecimal subtraction = big1.subtract(big2);
        BigDecimal product = big1.multiply(big2);
        BigDecimal division = big1.divide(big2);
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);

        // To use int as an argument
        BigDecimal big3 = BigDecimal.valueOf(0.538);
        System.out.println(big3.getClass().getSimpleName());


        // Immutability of BigDevimal Objects -> the original value is not changed
        // After calculations, a new object will be generated
        BigDecimal origianl = new BigDecimal("5.1");
        BigDecimal calculated = origianl.multiply(big3);

        System.out.println(origianl);
        System.out.println(calculated);


        /*
        RoundingMode.* :
        UP = We ALWAYS round up (1.1 = 2)
        DOWN = We ALWAYS round down (4.9 = 4)
        CEILING = Positive num. = UP.  Negative num. =  DOWN
        FLOOR = Positive num. = DOWN.  Negative num. =  UP
        HALF_UP = Commercial rounding (every num. above incl. x.5 uses UP)
        HALF_DOWN = Commercial rounding (every num. up to incl. x.5 uses DOWN)
        HALF_EVEN = special rounding (every num. up to x.4 = DOWN | x.5 and higher if next num. is an even num (2, 4, 6, 8, etc.) = UP OR if next num is odd (1, 3, 5, 7, etc.) = DOWN.
        example. 2.5 = 2, because 2 is even. 1.6 = 2 because 2 is even | 5.5 = 6 beacause 6 is even)
        */

        // Rounding Behavior of BigDecimal
        BigDecimal big4 = BigDecimal.valueOf(0.238974332);
        BigDecimal roundedUp = big4.setScale(5, RoundingMode.UP);
        BigDecimal roundedDown = big4.setScale(5, RoundingMode.DOWN);
        BigDecimal roundedHalfUp = big4.setScale(5, RoundingMode.HALF_UP);
        BigDecimal roundedHalfDown = big4.setScale(5, RoundingMode.HALF_DOWN);
        BigDecimal roundedHalfEven = big4.setScale(5, RoundingMode.HALF_EVEN);
        BigDecimal roundedCeiling = big4.setScale(5, RoundingMode.CEILING);
        BigDecimal roundedFloor = big4.setScale(5, RoundingMode.FLOOR);

    }
}
