package practice_homework9.task16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice_homework9.task16.StringSeparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SplitStringTest {
    StringSeparator stringSeparator;

    /**
     * positive - Вход: "Java,Python,C++", разделитель: "," → Выход: ["Java", "Python", "C++"].
     * corner:
     * Вход: "", разделитель: "," → Выход: [""].
     * Вход: "word", разделитель: "," → Выход: ["word"].
     * Вход: "Java", разделитель: "" → Выход: ["J", "a", "v", "a"].
     */

    @BeforeEach
    public void setUpTest() {
        stringSeparator = new StringSeparator();
    }

    @Test
    public void userCanSplitValidString() {
        String initialString = "Java,Python,C++";
        String separator = ",";
        String[] expectedList = {"Java", "Python", "C++"};
        String[] actualList = stringSeparator.splitString(initialString, separator);
        assertArrayEquals(expectedList, actualList);
    }

    @Test
    public void userCanSplitEmptyStringAndSeparator() {
        String initialString = "";
        String separator = ",";
        String[] expectedList = {""};
        String[] actualList = stringSeparator.splitString(initialString, separator);
        assertArrayEquals(expectedList, actualList);
    }

    @Test
    public void userCanSplitStringOfOneWord() {
        String initialString = "Java";
        String separator = ",";
        String[] expectedList = {"Java"};
        String[] actualList = stringSeparator.splitString(initialString, separator);
        assertArrayEquals(expectedList, actualList);
    }

    @Test
    public void userCanSplitStringOfOneWordAndEmptySeparator() {
        String initialString = "Java";
        String separator = "";
        String[] expectedList = {"J", "a", "v", "a"};
        String[] actualList = stringSeparator.splitString(initialString, separator);
        assertArrayEquals(expectedList, actualList);
    }


}
