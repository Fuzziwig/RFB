package Validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationValidatorTest {

    private LocationValidator s = new LocationValidator();

    @Test
    void isLocationValidTest() {
        assertFalse(s.isLocationValid(null));
        assertFalse(s.isLocationValid("k"));
        assertFalse(s.isLocationValid("!"));
        assertFalse(s.isLocationValid(""));
        assertTrue(s.isLocationValid("r"));
        assertTrue(s.isLocationValid("b"));
        assertTrue(s.isLocationValid("v"));
    }
}