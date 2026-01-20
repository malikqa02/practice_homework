package practice_homework9.task12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortByLengthTest {
    ListSorter listSorter;

    /**
     Вход: ["Java", "C", "Python"] → Выход: ["C", "Java", "Python"].
     Список с одинаковыми длинами:
     Вход: ["aa", "bb", "cc"] → Выход: ["aa", "bb", "cc"].
     Пустой список:
     Вход: [] → Выход: [] (пустой список).
     */

    @BeforeEach
    public void setUpTest(){
        listSorter = new ListSorter();
    }

    @Test
    public void userCanSortValidList(){
        List<String> initialList = new ArrayList<>(Arrays.asList("Java", "C", "Python"));
        List<String> expectedList = new ArrayList<>(Arrays.asList("C", "Java", "Python"));
        List<String> actualList = listSorter.sortByLength(initialList);
        assertEquals(actualList, expectedList);
    }

    @Test
    public void userCanSortValidListWithSameElements(){
        List<String> initialList = new ArrayList<>(Arrays.asList("aa", "bb", "cc"));
        List<String> expectedList = new ArrayList<>(Arrays.asList("aa", "bb", "cc"));
        List<String> actualList = listSorter.sortByLength(initialList);
        assertEquals(actualList, expectedList);
    }

    @Test
    public void userCanSortValidEmptyList(){
        List<String> initialList = new ArrayList<>();
        List<String> expectedList = new ArrayList<>();
        List<String> actualList = listSorter.sortByLength(initialList);
        assertEquals(actualList, expectedList);
    }

}
