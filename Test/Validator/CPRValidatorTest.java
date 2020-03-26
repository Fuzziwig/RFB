package Validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPRValidatorTest {

    CPRValidator s = new CPRValidator();

    @Test
    void isCPRValidTest() {
        assertFalse(s.isCPRValid(null));
        assertTrue(s.isCPRValid("0610101212"));
        assertTrue(s.isCPRValid("1210101225"));
        assertFalse(s.isCPRValid("3213240000"));
        assertFalse(s.isCPRValid("25d"));
    }
}