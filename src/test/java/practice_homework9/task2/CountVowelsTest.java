package practice_homework9.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountVowelsTest {
    protected VowelsCounter vowelsCounter;
    /**
     * Тесты для проверки, является ли четными:
     * позитивные кейсы:
     * hello - 2
     * aieou - 5
     * негативные кейсы:
     * null - illegal
     * corner cases:
     * "" - 0
     * bcd - 0
     */

    @BeforeEach
    public void setUpTest(){
        vowelsCounter = new VowelsCounter();
    }

    @Test
    public void userCanCountVowelsOfValidStringWith2Vowels() {
        int actualResult = vowelsCounter.countVowels("hello");
        int expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCanCountVowelsOfValidStringWith5Vowels() {
        int actualResult = vowelsCounter.countVowels("aieou");
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCanCountVowelsOfNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            vowelsCounter.countVowels(null);
        }, "checking count of null leads to illegal arg exception");
    }

    @Test
    public void userCanCountVowelsOfEmptyString() {
        int actualResult = vowelsCounter.countVowels("");
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCanCountVowelsOfValidStringWithNoVowels() {
        int actualResult = vowelsCounter.countVowels("bcd");
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }
}
