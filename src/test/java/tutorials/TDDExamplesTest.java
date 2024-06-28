package tutorials;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tutorials.TDDExamples.frizzBuzz;

class TDDExamplesTest {

    @Test
    public void frizzBuzzTest_whenNumber1_thenReturn1AsString() {
        // GIVEN
        int num = 1;

        // WHEN
        String actual = frizzBuzz(num);

        // THEN
        assertEquals("1", actual);
    }


    @Test
    public void frizzBuzzTest_whenNumber7_thenReturn7AsString() {
        // GIVEN
        int num = 7;

        // WHEN
        String actual = frizzBuzz(num);

        // THEN
        assertEquals("7", actual);
    }
}