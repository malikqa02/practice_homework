package practice_homework9.task8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMaxNumTest {
    FindSecondMax findSecondMax;

    /**
     * Обычный массив: [3, 5, 7, 2] → findSecondMax() → 5
     * Массив с одинаковыми числами: [4, 4, 4, 4] → Должно выбрасываться NoSuchElementException.
     * Один элемент: [8] → Должно выбрасываться NoSuchElementException.
     * Пустой массив: [] → Должно выбрасываться NoSuchElementException.
     */
    @BeforeEach
    public void setUpTest() {
        findSecondMax = new FindSecondMax();
    }

    @Test
    public void userCanCheckArrayOfValidNumbers() {
        int[] array = {3, 5, 7, 2};
        int expectedSecondMaxNum = 5;
        int secondMaxNum = findSecondMax.findSecondMaxNum(array);
        assertEquals(secondMaxNum, expectedSecondMaxNum);
    }

    @Test
    public void userCanCheckArrayOf4SameNumbers() {
        int[] array = {4, 4, 4, 4};
        assertThrows(NoSuchElementException.class, () -> {
            findSecondMax.findSecondMaxNum(array);
        });
    }

    @Test
    public void userCanCheckEmptyArray() {
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> {
            findSecondMax.findSecondMaxNum(array);
        });
    }

    @Test
    public void userCanCheckArrayWithOnlyZero() {
        int[] array = {0};
        assertThrows(IllegalArgumentException.class, () -> {
            findSecondMax.findSecondMaxNum(array);
        });
    }

}
