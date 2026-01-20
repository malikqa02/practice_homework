package practice_homework9.task9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest {
    WordCounter wordCounter;

    /**
     Обычная строка: "Hello world" → countWords() → 2.
     Строка с лишними пробелами: " Java is awesome " → countWords() → 3.
     Пустая строка: "" → countWords() → 0.
     Строка с пробелами: " " → countWords() → 0.
     null строка: null → Должно выбрасываться NullPointerException.
     */

    @BeforeEach
    public void setUpTest() {
        wordCounter = new WordCounter();
    }

    @Test
    public void userCanCountWordsOfValidStringOf2Words(){
        String initialString = "Hello world";
        int actualCount = wordCounter.countWords(initialString);
        int expectedCount = 2;
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void userCanCountWordsOfValidStringOf3Words(){
        String initialString = " Java is awesome ";
        int actualCount = wordCounter.countWords(initialString);
        int expectedCount = 3;
        assertEquals(expectedCount, actualCount);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    public void userCanCountWordsWithEmptyStringAndStringWIthSpaceOnly(String initialString){
        int expectedCount = 0;
        int actualCount = wordCounter.countWords(initialString);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void userCanCountWordsOfNullParameter(){
        assertThrows(NullPointerException.class, () -> {
            wordCounter.countWords(null);
        }, "counting words of null leads to null pointer exception");
    }
}
