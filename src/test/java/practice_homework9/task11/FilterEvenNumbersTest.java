package practice_homework9.task11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FilterEvenNumbersTest {
    EvenNumbersFilter evenNumbersFilter;

    /**
     * happy path: [1, 2, 3, 4, 5, 6] → Выход: [2, 4, 6].
     * corner:
     * Вход: [1, 3, 5] → Выход: [] (пустой список).
     * Вход: [] → Выход: [] (пустой список).
     * negative:
     * null - exception
     */
    @BeforeEach
    public void setUpTest(){
        evenNumbersFilter = new EvenNumbersFilter();
    }

    @Test
    public void userCanFilterValidArray(){
        List<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> filteredArray = evenNumbersFilter.filterEvenNumbers(array);
        List<Integer> expectedArray = new ArrayList<>(Arrays.asList(2,4,6));
        assertEquals(filteredArray, expectedArray);
    }

    @Test
    public void userCanFilterValidArrayWithNoEvenNumber(){
        List<Integer> array = new ArrayList<>(Arrays.asList(1,3,5));
        List<Integer> filteredArray = evenNumbersFilter.filterEvenNumbers(array);
        List<Integer> expectedArray = new ArrayList<>();
        assertEquals(filteredArray, expectedArray);
    }

    @Test

    public void userCanFilterValidArrayWithNoNumber(){
        List<Integer> array = new ArrayList<>();
        List<Integer> filteredArray = evenNumbersFilter.filterEvenNumbers(array);
        List<Integer> expectedArray = new ArrayList<>();
        assertEquals(filteredArray, expectedArray);
    }

    @Test

    public void userCanFilterNullArray(){
        assertThrows(NullPointerException.class, () -> {
            evenNumbersFilter.filterEvenNumbers(null);
        }, "filtering even number should lead to null pointer exception");
    }


}
