package Validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateValidatorTest {

    private DateValidator s = new DateValidator();

    @Test
    public void isDateValidTest() {
        assertFalse(s.isDateValid(null, "dd/MM/yyyy"));
        assertFalse(s.isDateValid("29/02/2012", null));
        assertFalse(s.isDateValid(null, null));
        assertFalse(s.isDateValid("32/02/2012", "dd/MM/yyyy"));
        assertTrue(s.isDateValid("29/02/2012", "dd/MM/yyyy"));
    }

}