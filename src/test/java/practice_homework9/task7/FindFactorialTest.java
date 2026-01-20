package practice_homework9.task7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class FindFactorialTest {
    FindFactorial findFactorial;

    /**
     * Базовый случай: factorial(0) → 1
     * Обычные числа: factorial(1) → 1, factorial(5) → 120, factorial(7) → 5040
     * Отрицательные числа: factorial(-3) → Должно выбрасывать IllegalArgumentException.
     */

    @BeforeEach
    public void setUpTest(){
        findFactorial = new FindFactorial();
    }


    @Test
    public void userCanFindFactorialOf0(){
        int findedFactorial = findFactorial.factorial(0);
        int expectedFactorial = 1;
        assertEquals(expectedFactorial, findedFactorial);
    }

    public static Stream<Arguments> ints(){
        return Stream.of(
                Arguments.of(1,1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040)
        );
    }

    @ParameterizedTest
    @MethodSource("ints")
    public void userCanFindFactorialOfValidInts(int initialNum, int expectedFactorial){
        int findedFactorial = findFactorial.factorial(initialNum);
        assertEquals(expectedFactorial, findedFactorial);
    }

    @Test
    public void userCanFindFactorialOfNull(){
        assertThrows(IllegalArgumentException.class, () -> {
            findFactorial.factorial(-3);
        },"finding factorial for null leads to illegal arg exception");
    }


}
