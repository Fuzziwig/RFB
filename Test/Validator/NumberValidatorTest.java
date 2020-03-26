package Validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberValidatorTest {

    NumberValidator s = new NumberValidator();

    @Test
    void isNumberValidTest() {
        assertFalse(s.isNumberValid(null));
        assertTrue(s.isNumberValid("25"));
        assertFalse(s.isNumberValid("25d"));
    }
}