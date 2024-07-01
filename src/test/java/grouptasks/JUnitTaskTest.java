// 28.06.24 Part 1 - 06. Junit Test
package grouptasks;

import org.junit.jupiter.api.Test;

import static grouptasks.JUnitTask.*;
import static org.junit.jupiter.api.Assertions.*;

class TDDTaskTest {

    // *** Bonus Task *** //
    @Test
    public void validateHelloTest() {
        assertTrue(validateHello("hello"));
        assertTrue(validateHello("ciao bella!"));
        assertTrue(validateHello("salut"));
        assertTrue(validateHello("hallo, salut"));
        assertTrue(validateHello("hombre! Hola!"));
        assertTrue(validateHello("Hallo, wie geht\'s dir?"));
        assertTrue(validateHello("AHOJ!"));
        assertTrue(validateHello("czesc"));
        assertTrue(validateHello("Ahoj"));

        assertFalse(validateHello("halloween, hey"));
        assertFalse(validateHello("meh"));
    }


    // *** Basic Tasks *** //

    // Task1 - Write a test for a method that calculates the sum of two integers.
    @Test
    void addTest_when5and8_thenReturn13() {
        // GIVEN
        int a = 5;
        int b = 8;

        // WHEN
        int actual = add(a, b);

        // THEN
        assertEquals(13, actual);
    }

    // Task2 - Write a test for a method that calculates the product of two integers.
    @Test
    void productTest_when4and9_thenReturn36() {
        // GIVEN
        int a = 4;
        int b = 9;

        // WHEN
        int actual = product(a, b);

        // THEN
        assertEquals(36, actual);
    }


    // Task3 - Write a test for a method that checks if a given number is even.
    @Test
    void validateEvenTest_when10_thenReturnTrue() {
        // GIVEN
        int a = 10;

        // WHEN
        boolean actual = validateEven(a);

        // THEN
        assertTrue(actual);
    }

    @Test
    void validateEvenTest_when7_thenReturnFalse() {
        // GIVEN
        int a = 7;

        // WHEN
        boolean actual = validateEven(a);

        // THEN
        assertFalse(actual);
    }

    @Test
    void validateEvenTest_when0_thenReturnTrue() {
        // GIVEN
        int a = 0;

        // WHEN
        boolean actual = validateEven(a);

        // THEN
        assertTrue(actual);
    }


    // Task4 - Write a test for a method that converts a given string to uppercase.
    @Test
    void convertToUppercaseTest_whenfriDay_thenReturnFRIDAY() {
        // GIVEN
        String words = "friDay";

        // WHEN
        String wordsUppercase = convertToUppercase(words);

        // THEN
        assertEquals("FRIDAY", wordsUppercase);
    }

    @Test
    void convertToUppercaseTest_whenhello_world_thenReturnHELLOWORLD() {
        // GIVEN
        String words = "hello  world";

        // WHEN
        String wordsUppercase = convertToUppercase(words);

        // THEN
        assertEquals("HELLO  WORLD", wordsUppercase);
    }

    @Test
    void convertToUppercaseTest_whenEmptystring_thenReturnEmptystring() {
        // GIVEN
        String words = "  ";

        // WHEN
        String wordsUppercase = convertToUppercase(words);

        // THEN
        assertEquals("  ", wordsUppercase);
    }


    // Task5 - Write a test for a method that checks if a given number is positive.
    @Test
    void validatePositiveTest_when8_thenReturnTrue() {
        // GIVEN
        int a = 8;

        // WHEN
        boolean actual = validatePositive(a);

        // THEN
        assertTrue(actual);
    }

    @Test
    void validatePositiveTest_whenMinus4_thenReturnFalse() {
        // GIVEN
        int a = -4;

        // WHEN
        boolean actual = validatePositive(a);

        // THEN
        assertFalse(actual);
    }

    @Test
    void validatePositiveTest_when0_thenReturnFalse() {
        // GIVEN
        int a = 0;

        // WHEN
        boolean actual = validatePositive(a);

        // THEN
        assertFalse(actual);
    }
}