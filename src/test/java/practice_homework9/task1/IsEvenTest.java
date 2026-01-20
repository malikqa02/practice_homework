package practice_homework9.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsEvenTest {
    /**
     * Тесты для проверки, является ли четными:
     * позитивные кейсы:
     * 2 - четное
     * 3 - нечетное
     * -2 четное негативное
     * -3 - нечетноенегативное
     * corner cases:
     * 0 - true
     */
    protected EvenChecker evenChecker;
    @BeforeEach
    public void setUpTest() {
        evenChecker = new EvenChecker();
    }

    @Test
    public void userCanCheckIfZeroIsEven() {
        boolean actualResult = evenChecker.isEven(0);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {
            2, -2
    })
    public void userCanCheckIfNegativeAndPositiveEvenNumAreEven(int initialInt) {
        boolean actualResult = evenChecker.isEven(initialInt);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {
            3, -3
    })
    public void userCanCheckIfNegativeAndPositiveNotEvenNumAreEven(int initialInt) {
        boolean actualResult = evenChecker.isEven(initialInt);
        assertFalse(actualResult);
    }

}