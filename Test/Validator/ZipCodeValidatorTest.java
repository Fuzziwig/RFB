package Validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZipCodeValidatorTest {

    ZipCodeValidator s = new ZipCodeValidator();

    @Test
    void isZipCodeValidTest() {
        assertFalse(s.isZipCodeValid(null));
        assertTrue(s.isZipCodeValid("8000"));
        assertFalse(s.isZipCodeValid("0d90"));
    }
}