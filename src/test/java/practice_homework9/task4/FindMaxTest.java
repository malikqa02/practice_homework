package practice_homework9.task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class FindMaxTest {
    FindMaxNum findMaxNum;

    /**
     * :
     * позитивные кейсы:
     * Обычный массив ([3, 5, 7, 2]) - 7
     * null - illegal
     * corner cases:
     * ([5]) - 5
     * ([-3, -5, -7, -2]) - -2
     */
    @BeforeEach
    public void setUpTest() {
        findMaxNum = new FindMaxNum();
    }

    public static Stream<Arguments> validIntsToFindMax() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{3}, 3),
                Arguments.of(new int[]{-3, -5, -7, -2}, -2));
    }

    @ParameterizedTest
    @MethodSource("validIntsToFindMax")
    public void userCanFindMaxInValidArrays(int[] validArray, int expectedNum){
        int maxNum = findMaxNum.findMax(validArray);
        assertEquals(expectedNum, maxNum);
    }

    @Test
    public void userCanPassNull(){
        assertThrows(NullPointerException.class,()  -> {
            findMaxNum.findMax(null);
        }, "passing null as parameter leads to NullPointerException");
    }


}
