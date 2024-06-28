package tutorials;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tutorials.SimpleCalculation.add;

class SimpleCalculationTest {

    @Test
    public void addTest_when5and6_thenReturn11() {
        // GIVEN
        int a = 5;
        int b = 6;

        // WHEN
        int actual = add(a, b);

        // THEN
        assertEquals(11, actual);
    }


    @Test
    public void addTest_when1and2_thenReturn3() {
        // GIVEN
        int a = 1;
        int b = 2;

        // WHEN
        int actual = add(a, b);

        // THEN
        assertEquals(3, actual);
    }
}