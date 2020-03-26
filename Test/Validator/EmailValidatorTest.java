package Validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    private EmailValidator s = new EmailValidator();

    @Test
    void isEmailValidTest() {
        assertFalse(s.isEmailValid(null));
        assertFalse(s.isEmailValid("aaaaa"));
        assertFalse(s.isEmailValid("a@a"));
        assertFalse(s.isEmailValid("a@a."));
        assertTrue(s.isEmailValid("a@a.com"));
        assertTrue(s.isEmailValid("et_navn@a_b.com"));
        assertTrue(s.isEmailValid("et_navn5@a_b5.com"));
        assertTrue(s.isEmailValid("sandra@rfb.dk"));
        assertFalse(s.isEmailValid("et_navn#@a_b.dk"));
        assertFalse(s.isEmailValid("!et_navn@a_b.dk"));
    }
}