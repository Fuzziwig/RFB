package Validator;

import org.junit.jupiter.api.Test;

import javax.naming.Name;

import static org.junit.jupiter.api.Assertions.*;

class NameValidatorTest {

    NameValidator s = new NameValidator();

    @Test
    void isNameValidTest() {
        assertFalse(s.isNameValid(null));
        assertTrue(s.isNameValid("noget"));
        assertFalse(s.isNameValid("no!get"));
    }
}