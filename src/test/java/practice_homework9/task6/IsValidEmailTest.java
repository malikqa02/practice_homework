package practice_homework9.task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidEmailTest {
    EmailChecker emailChecker;

    /**
     * Корректные email: "test@example.com", "user.name@domain.co", "a@b.cc" → true
     * Некорректные email: "bad@.com", "no-at-symbol", "@missing-user.com", "user@domain" → false
     * Пустая строка: "" → false
     * null: null → false
     */

    @BeforeEach
    public void setUpTest(){
        emailChecker = new EmailChecker();
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "test@example.com",
            "user.name@domain.co",
            "a@b.cc"
    })
    public void userCanIfValidEmailsAreValid(String initialEmail){
        boolean isEmailValid = emailChecker.isValidEmail(initialEmail);
        assertTrue(isEmailValid);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "bad@.com", "no-at-symbol", "@missing-user.com", "user@domain"
    })
    public void userCanIfNotValidEmailsAreValid(String initialEmail){
        boolean isEmailValid = emailChecker.isValidEmail(initialEmail);
        assertFalse(isEmailValid);
    }

    @Test
    public void userCanCheckEmptyEmail(){
        boolean isValidEmail = emailChecker.isValidEmail("");
        assertFalse(isValidEmail);
    }

    @Test
    public void userCanCheckNullEmail(){
        boolean isValidEmail = emailChecker.isValidEmail(null);
        assertFalse(isValidEmail);
    }





}
