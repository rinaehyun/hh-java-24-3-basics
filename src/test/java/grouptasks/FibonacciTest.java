package grouptasks;

import org.junit.jupiter.api.Test;

import static grouptasks.Fibonacci.NthFibonacci;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void NthFibonacciTest_when1_thenReturn0 () {
        // GIVEN
        int n = 1;

        // WHEN
        int number = NthFibonacci(n);

        // THEN
        assertEquals(0, number);
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
        assertEquals(1, number);
    }
}