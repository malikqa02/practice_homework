package practice_homework9.task17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class IsValidPasswordTest {
    PasswordValidator passwordValidator;

    /**
     * Корректный пароль:
     * Вход: "Password1" → Выход: true.

     * negative:
     * Вход: "pass" → Выход: false.
     * Вход: "password" → Выход: false.
     * Вход: null → Выход: false.
     */

    @BeforeEach
    public void setUpTest(){
        passwordValidator = new PasswordValidator();
    }

    @Test
    public void userCanValidateValidPassword(){
        String password = "Password1";
        boolean isValid = passwordValidator.isValidPassword(password);
        assertTrue(isValid);
    }

    @Test
    public void userCanValidateInvalidPassword(){
        String password = "pass";
        boolean isValid = passwordValidator.isValidPassword(password);
        assertFalse(isValid);
    }

    @Test
    public void userCanValidateInvalidPassword2(){
        String password = "password";
        boolean isValid = passwordValidator.isValidPassword(password);
        assertFalse(isValid);
    }

    @Test
    public void userCanValidateEmptyPassword(){
        boolean isValid = passwordValidator.isValidPassword(null);
        assertFalse(isValid);
    }
}
