// 28.06.24 Part 2 - 07. Test Driven Development
package tutorials.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tutorials.basics.TDDExamples.fizzBuzz;

class TDDExamplesTest {

    @Test
    public void fizzBuzzTest_whenNumber1_thenReturn1AsString() {
        // GIVEN
        int num = 1;

        // WHEN
        String actual = fizzBuzz(num);

        // THEN
        assertEquals("1", actual);
    }


    @Test
    public void fizzBuzzTest_whenNumber7_thenReturn7AsString() {
        // GIVEN
        int num = 7;

        // WHEN
        String actual = fizzBuzz(num);

        // THEN
        assertEquals("7", actual);
    }


    @Test
    public void frizzBuzzTest_whenNumber3_thenReturnFizz() {
        // GIVEN
        int num = 3;

        // WHEN
        String actual = fizzBuzz(num);

        // THEN
        assertEquals("Fizz", actual);
    }


    @Test
    public void frizzBuzzTest_whenNumber5_thenReturnBuzz() {
        // GIVEN
        int num = 5;

        // WHEN
        String actual = fizzBuzz(num);

        // THEN
        assertEquals("Buzz", actual);
    }


    @Test
    public void frizzBuzzTest_whenNumber15_thenReturnFizzBuzz() {
        // GIVEN
        int num = 15;

        // WHEN
        String actual = fizzBuzz(num);

        // THEN
        assertEquals("FizzBuzz", actual);
    }
}