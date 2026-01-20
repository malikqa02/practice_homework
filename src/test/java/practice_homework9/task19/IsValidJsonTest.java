package practice_homework9.task19;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class IsValidJsonTest {
    JSONValidator jsonValidator;

    /**
     * Вход: "{"key":"value"}" → Выход: true.
     * Некорректный JSON:
     * Вход: "invalid json" → Выход: false.
     * null:
     * Вход: null → Выход: false.
     */

    @BeforeEach
    public void setUpTest(){
        jsonValidator = new JSONValidator();
    }

    @Test
    public void userCanCheckIfJsonIsValid(){
        String initialString = "{\"key\":\"value\"}";
        boolean isJson = jsonValidator.isValidJson(initialString);
        assertTrue(isJson);
    }

    @Test
    public void userCanCheckIfInvalidJsonIsValid(){
        String initialString = "invalid json";
        boolean isJson = jsonValidator.isValidJson(initialString);
        assertFalse(isJson);
    }

    @Test
    public void userCanCheckIfNullIsValid(){
        boolean isJson = jsonValidator.isValidJson(null);
        assertFalse(isJson);
    }
}
