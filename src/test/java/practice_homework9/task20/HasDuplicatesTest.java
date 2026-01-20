package practice_homework9.task20;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HasDuplicatesTest {
    DuplicatesChecker duplicatesChecker;

    /**
    Вход: [1, 2, 3, 4, 5] → Выход: false.
    Массив не содержит повторяющихся элементов, поэтому результат будет false.
    С дубликатами:
    Вход: [1, 2, 2, 3] → Выход: true.
    В массиве присутствуют одинаковые элементы, в данном случае 2, поэтому метод должен вернуть true.
    Пустой массив:
    Вход: [] → Выход: false.
     */

    @BeforeEach
    public void setUpTest(){
        duplicatesChecker = new DuplicatesChecker();
    }

    @Test
    public void userCanCheckIfArrayWithNoDuplicateHasDuplicates(){
        int[] initialArray = {1,2,3,4,5};
        boolean isValid = duplicatesChecker.hasDuplicates(initialArray);
        assertFalse(isValid);
    }

    @Test
    public void userCanCheckIfArrayWithDuplicateHasDuplicates(){
        int[] initialArray = {1,2,2,4,5};
        boolean isValid = duplicatesChecker.hasDuplicates(initialArray);
        assertTrue(isValid);
    }

    @Test
    public void userCanCheckIfEmptyArrayHasDuplicates(){
        int[] initialArray = {};
        boolean isValid = duplicatesChecker.hasDuplicates(initialArray);
        assertFalse(isValid);
    }
}
