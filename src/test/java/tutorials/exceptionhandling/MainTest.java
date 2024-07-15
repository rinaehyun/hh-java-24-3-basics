package tutorials.exceptionhandling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    // Check which Exception will be thrown
    @Test
    void whenReadFile_thenThrowFileNotFoundException() {
        try {
            Main.readFile();
            Assertions.fail("Exception was not thrown.");
        } catch (IOException e) {

        }
    }
}