package practice_homework9.task10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.*;


public class IsValidPhoneNumberTest {
    PhoneValidator phoneValidator;

    /**
     * "+1 1234567890" → true.
     * "+44 9876543210" → true.
     * "+999 1111111111" → true.
     * Некорректные номера:
     * "12345" → false.
     * "invalid" → false.
     * "+1 abcdefghij" → false.
     * "+1234 1234567890" (слишком длинный код страны) → false.
     * "+1 123" (недостаточно цифр) → false.
     * "" (пустая строка) → false.
     * null номер:
     * null → Должно выбрасываться NullPointerException.
     */

    @BeforeEach
    public void setUpTest(){
        phoneValidator = new PhoneValidator();
    }

    @ParameterizedTest
    @ValueSource(strings = {"+1 1234567890", "+44 9876543210", "+999 1111111111"})
    public void userCanCheckIfValidNumberIsValid(String number){
        boolean isValid = phoneValidator.isValidPhoneNumber(number);
        assertTrue(isValid);
    }

    @ParameterizedTest
    @ValueSource(strings = {"12345", "invalid", "+1 abcdefghij", "+1234 1234567890", "+1 123", "" })
    public void userCanCheckIfInvalidNumberIsValid(String number){
        boolean isValid = phoneValidator.isValidPhoneNumber(number);
        assertFalse(isValid);
    }

    @Test
    public void userCanValidateNullNumber(){
        assertThrows(NullPointerException.class, () -> {
            phoneValidator.isValidPhoneNumber(null);
        }, "checking null number leads to NullPointer Exception");
    }

}
