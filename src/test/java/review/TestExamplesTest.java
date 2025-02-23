package review;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static review.TestExamples.*;

class TestExamplesTest {

    @Test
    void addTest_when2and3Given_thenReturn5() {
        // GIVEN
        int a = 2;
        int b = 3;

        // WHEN
        int actual = add(a, b);

        // THEN
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void isEvenTest_when4Given_thenReturnTrue() {
        // GIVEN
        int a = 4;

        // WHEN
        boolean actual = isEven(a);

        // THEN
        boolean expected = true;
        assertEquals(expected, actual);
        assertTrue(actual);
    }

    @Test
    void isEvenTest_when7Given_thenReturnFalse() {
        // GIVEN
        int b = 7;

        // WHEN
        boolean actual = isEven(b);

        // THEN
        boolean expected = false;
        assertEquals(expected, actual);
        assertFalse(actual);
    }

    @Test
    void convertToUppercase_whenhelloGiven_thenReturnHELLO() {
        // Given
        String str = "hello";

        // WHEN
        String actual = convertToUppercase(str);

        // THEN
        String expected = "HELLO";
        assertEquals(expected, actual);
    }

    @Test
    void productTest_when4and5Given_thenReturn20() {
        // GIVEN
        int a = 4;
        int b = 5;

        // WHEN
        int actual = product(a, b);

        // THEN
        int expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    void makePositiveTest_when5Given_thenReturn5() {
        // GIVEN
        int a = 5;

        // WHEN
        int actual = makePositive(a);

        // THEN
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void makePositiveTest_givenminus5_thenReturn5() {
        // GIVEN
        int a = -5;

        // WHEN
        int actual = makePositive(a);

        // THEN
        int expected = 5;
        assertEquals(expected, actual);
    }
}