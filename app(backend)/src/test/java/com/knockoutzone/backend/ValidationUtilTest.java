package com.knockoutzone.backend;

import com.knockoutzone.backend.util.ValidationUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidationUtilTest {

    @Test
    void testValidEmail(){
        assertTrue(ValidationUtil.isValidEmail("test@gmail.com"));
        assertFalse(ValidationUtil.isValidEmail("invalid-email.com"));
    }

    @Test
    void testValidPhoneNumber(){
        assertTrue(ValidationUtil.isValidPhoneNumber("9780236712"));
        assertFalse(ValidationUtil.isValidPhoneNumber("23445"));
    }

    @Test
    void testValidSlug(){
        assertTrue(ValidationUtil.isValidSlug("knockout-zone123"));
        assertFalse(ValidationUtil.isValidSlug("KNOCKOUT-ZONE123!"));
    }

    @Test
    void testValidLength(){
        assertTrue(ValidationUtil.isValidLength("hello",3,10));
        assertFalse(ValidationUtil.isValidLength("hi",3,9));
        assertFalse(ValidationUtil.isValidLength("hey it is knckoutzone backend",3,10));
    }

    @Test
    void testMatchesRegex(){
        assertTrue(ValidationUtil.matchesRegex("^[A-Z0-9]+$", "ABC123"));
        assertFalse(ValidationUtil.matchesRegex("^[A-Z]+$", "Abc123"));
    }
}
