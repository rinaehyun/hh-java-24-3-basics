package practices;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample {
    public static void main(String[] args) {
        BigDecimal a1 = new BigDecimal("5");
        int b = 10;
        BigDecimal b1 = BigDecimal.valueOf(b);



        BigDecimal sum = a1.add(b1);
        BigDecimal difference = b1.subtract(BigDecimal.valueOf(3));

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(a1);
        System.out.println(b1);

        BigDecimal number = new BigDecimal("123.45722");
        System.out.println(number.setScale(2, RoundingMode.UP));
        System.out.println(number.setScale(2, RoundingMode.DOWN));
        System.out.println(number.setScale(2, RoundingMode.CEILING));
        System.out.println(number.setScale(2, RoundingMode.FLOOR));
        System.out.println(number.setScale(2, RoundingMode.HALF_UP));
        System.out.println(number.setScale(2, RoundingMode.HALF_DOWN));
        System.out.println(number.setScale(2, RoundingMode.HALF_EVEN));
    }
}
