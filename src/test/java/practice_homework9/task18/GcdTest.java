package practice_homework9.task18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GcdTest {
    FindGCD findGCD;

    /**
     * Happy path:
     * Вход: 24, 36 → Выход: 12.
     * Вход: 101, 103 → Выход: 1.
     * Corner:
     * Вход: 0, 10 → Выход: 10.
     */

    @BeforeEach
    public void setUpTest(){
        findGCD = new FindGCD();
    }

    @Test
    public void userCanFindGcdOfTwoValidNumbers(){
        int firstNum = 24;
        int secondNum = 36;
        int expectedGCD = 12;
        int actualGCD = findGCD.gcd(firstNum, secondNum);
        assertEquals(expectedGCD, actualGCD);
    }

    @Test
    public void userCanFindGcdOfTwoValidSimpleNumbers(){
        int firstNum = 101;
        int secondNum = 103;
        int expectedGCD = 1;
        int actualGCD = findGCD.gcd(firstNum, secondNum);
        assertEquals(expectedGCD, actualGCD);
    }

    @Test
    public void userCanFindGcdOfZeroAndTen(){
        int firstNum = 0;
        int secondNum = 10;
        int expectedGCD = 10;
        int actualGCD = findGCD.gcd(firstNum, secondNum);
        assertEquals(expectedGCD, actualGCD);
    }
}
