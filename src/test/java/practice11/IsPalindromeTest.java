package practice11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IsPalindromeTest extends StringProcessorTest {
    /**
     * Тесты для проверки, является ли палиндромом:
     * позитивные кейсы:
     * - четное кол-во: "abba" -> true
     * - нечетное кол-во: "hah" -> true
     * негативные кейсы:
     * - "john" -> false
     * corner cases:
     * - "a" -> true
     * - "" -> true
     * - null -> IllegalArgumentException
     */

    @ParameterizedTest
    @ValueSource(strings = {
            // позитивные кейсы
            "abba", "hah",
            // угловые кейсы
            "a", ""})
    public void UserCanCheckIfValidStringIsPalindrome(String initialString) {
        boolean actualResult = stringProcessor.isPalindrome(initialString);
        assertTrue(actualResult); //проверь что тру
    }

    @Test
    public void UserCanCheckIfValidStringIsNotPalindrome() {
        String initialString = "john";
        boolean actualResult = stringProcessor.isPalindrome(initialString);
        assertFalse(actualResult); //проверь что тру
    }

    @Test
    public void userCannotCheckIfNullStringIsPalindrome(){
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.reverse(null);
        }, "checking if null is palindrome leading to Illegal arg exception");
    }

}
