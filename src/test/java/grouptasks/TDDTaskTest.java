package grouptasks;

import org.junit.jupiter.api.Test;

import static grouptasks.TDDTask.validateHello;
import static org.junit.jupiter.api.Assertions.*;

class TDDTaskTest {

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

}