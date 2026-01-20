package practice11;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("class StringPrecessor, method reverse")
public class ReverseStringTest extends StringProcessorTest{
    //это можно все параметризировать
    @Test
    public void userCanReverseValidString() {
        String initialString = "sasha";
        String expectedString = "ahsas";
        String reversedString = stringProcessor.reverse(initialString);
        assertEquals(expectedString, reversedString, "String reversed incorrectly");
    }

    @Test
    public void userCanReverseValidStringForCornerCase() {
        String initialString = "";
        String expectedString = "";
        String reversedString = stringProcessor.reverse(initialString);
        assertEquals(expectedString, reversedString, "String reversed incorrectly");
    }

    @Test
    public void userCanReverseValidStringWithOneLetter() {
        String initialString = "a";
        String expectedString = "a";
        String reversedString = stringProcessor.reverse(initialString);
        assertEquals(expectedString, reversedString, "String reversed incorrectly");
    }

    //пример как параметризировать
    public static Stream<Arguments> validStringsToReverse() { //это метод который возвращает стрим аргументов,
        //эта строка arguments.of мы тут передаем аргументы (параметры). одна строка = один кейс
        return Stream.of(
                //happy path - sasha -> ashas
                Arguments.of("sasha", "ahsas"),
                //corner cases - "" -> ""
                Arguments.of("", ""),
                //corner cases - "a" -> "a"
                Arguments.of("a", "a"));
    }

    @ParameterizedTest //аннотация указывающая что тест параметризирован
    @MethodSource("validStringsToReverse")
    //аннотация указывающая что этот тест принимает как параметр - готовый метод validStringsToReverse
    public void userCanReverseValidStringParam(String initialString, String expectedString) {
        String reversedString = stringProcessor.reverse(initialString);
        assertEquals(expectedString, reversedString, "incoorrectly reversed!");
    }

    @Test
    public void UserCannotReverseNullToString() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.reverse(null);
        }, "reversing null leads to illegal arg exeption");
    }

}
