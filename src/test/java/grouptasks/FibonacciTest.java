package grouptasks;

import org.junit.jupiter.api.Test;

import static grouptasks.Fibonacci.NthFibonacci;
import static grouptasks.Fibonacci.generateFibonacci;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void NthFibonacciTest_when1_thenReturn0 () {
        // GIVEN
        int n = 1;

        // WHEN
        int number = NthFibonacci(n);

        // THEN
        assertEquals(1, number);
    }

    @Test
    void NthFibonacciTest_when2_thenReturn1 () {
        // GIVEN
        int n = 2;

        // WHEN
        int number = NthFibonacci(n);

        // THEN
        assertEquals(1, number);
    }

    @Test
    void NthFibonacciTest_when3_thenReturn1 () {
        // GIVEN
        int n = 3;

        // WHEN
        int number = NthFibonacci(n);

        // THEN
        assertEquals(2, number);
    }

    @Test
    void generateFibonacciTest_whenBiggerThan1_thenReturnArray() {
        // GIVEN
        int n = 3;

        // WHEN
        int[] fNumbers = generateFibonacci(n);

        // THEN
        assertArrayEquals(new int[] {1, 1, 2}, fNumbers);
    }

    @Test
    void generateFibonacciTest_when1_thenReturnArray() {
        // GIVEN
        int n = 1;

        // WHEN
        int[] fNumbers = generateFibonacci(n);

        // THEN
        assertArrayEquals(new int[] {1}, fNumbers);
    }

}