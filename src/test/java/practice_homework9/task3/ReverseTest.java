package practice_homework9.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentAccessException;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReverseTest {
    protected StringReverser stringReverser;

    /**
     * Тесты для проверки, является ли четными:
     * позитивные кейсы:
     * Java - avaJ
     * негативные кейсы:
     * null - illegal
     * corner cases:
     * "" - ""
     * a - a
     */


    @BeforeEach
    public void setUPTest(){
        stringReverser = new StringReverser();
    }

    public static Stream<Arguments> validStringsToReverse(){
        return Stream.of(
                Arguments.of("Java", "avaJ"),
                Arguments.of("a", "a"),
                Arguments.of(null, null),
                Arguments.of("", ""));
    }

    @ParameterizedTest
    @MethodSource("validStringsToReverse")
    public void userCanReverseValidString(String initialString, String expectedString){
        String reversedString = stringReverser.reverse(initialString);
        assertEquals(expectedString, reversedString);
    }

}
