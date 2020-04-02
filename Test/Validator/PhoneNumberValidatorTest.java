package Validator;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberValidatorTest {

    PhoneNumberValidator s = new PhoneNumberValidator();

    @Test
    void isPhoneNumberValidTest() {
        assertFalse(s.isPhoneNumberValid(null));
        assertTrue(s.isPhoneNumberValid("25252525"));
        assertFalse(s.isPhoneNumberValid("2525f525"));
    }
}