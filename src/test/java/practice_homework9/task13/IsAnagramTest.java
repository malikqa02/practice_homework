package practice_homework9.task13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class IsAnagramTest {
    IsAnagramChecker isAnagramChecker;
    /**
     * Вход: "listen", "silent" → Выход: true.
     * Строки являются анаграммами, так как после сортировки символов они совпадают.
     * Не анаграммы:
     * Вход: "java", "python" → Выход: false.
     * Строки не являются анаграммами, так как их символы не совпадают после сортировки.
     * null:
     * Вход: null, "word" → Выход: false.
     * Если одна из строк равна null, метод возвращает false.
     */
    @BeforeEach
    public void setUpTest(){
        isAnagramChecker = new IsAnagramChecker();
    }

    @Test
    public void userCanCheckIfNonAnagramsAreAnagrams(){
        String initialString1 = "java";
        String initialString2 = "python";
        boolean isAnagram = isAnagramChecker.isAnagram(initialString1, initialString2);
        assertFalse(isAnagram);
    }

    @Test
    public void userCanCheckIfAnagramsAreAnagrams(){
        String initialString1 = "listen";
        String initialString2 = "silent";
        boolean isAnagram = isAnagramChecker.isAnagram(initialString1, initialString2);
        assertTrue(isAnagram);
    }

    @Test
    public void userCanCheckIfNullAndStringAreAnagrams(){
        assertThrows(NullPointerException.class, () -> {
            String initialString2 = "silent";
            isAnagramChecker.isAnagram(null, initialString2);
        }, "checking if null as a first parameter and valid string as a second parameter are anagrams should lead to NullPointerException");
    }

    @Test
    public void userCanCheckIfStringAndNullAreAnagrams(){
        assertThrows(NullPointerException.class, () -> {
            String initialString2 = "silent";
            isAnagramChecker.isAnagram(initialString2, null);
        }, "checking if valid string as a first parameter and null as a second parameter are anagrams should lead to NullPointerException");
    }


    }
