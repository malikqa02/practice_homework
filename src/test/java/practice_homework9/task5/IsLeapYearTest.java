package practice_homework9.task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLeapYearTest {
    LeapYearChecker leapYearChecker;
    /**
     * Обычные невисокосные годы: 2019, 2021, 2022 → false
     * Високосные годы: 2020, 2000, 1600 → true
     * Года, делящиеся на 100, но не на 400: 1900, 2100 → false
     * Граничные случаи: 0, 4, 400 → true
     */
    @BeforeEach
    public void setUpTest(){
        leapYearChecker = new LeapYearChecker();
    }

    @ParameterizedTest
    @ValueSource(ints = {2019, 2021, 2022})
    public void userCanCheckIfNotLeapYearsAreLeap(int year){
        boolean isYearLeap = leapYearChecker.isLeapYear(year);
        assertFalse(isYearLeap);
    }

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600})
    public void userCanCheckIfLeapYearsAreLeap(int year){
        boolean isYearLeap = leapYearChecker.isLeapYear(year);
        assertTrue(isYearLeap);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 400})
    public void userCanCheckIfYearsDividedBy100ButNotBy400AreLeap(int year){
        boolean isYearLeap = leapYearChecker.isLeapYear(year);
        assertTrue(isYearLeap);
    }

    @ParameterizedTest
    @ValueSource(ints = {1900, 2100})
    public void userCanCheckCornerCases(int year){
        boolean isYearLeap = leapYearChecker.isLeapYear(year);
        assertFalse(isYearLeap);
    }


}
