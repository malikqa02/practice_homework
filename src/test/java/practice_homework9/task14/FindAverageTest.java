package practice_homework9.task14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FindAverageTest {
    AverageInt averageInt;

    /**
     * Вход: [1, 2, 3, 4, 5] → Выход: 3.0.
     * Среднее значение элементов массива: (1 + 2 + 3 + 4 + 5) / 5 = 3.0.
     * Массив с одним элементом:
     * Вход: [10] → Выход: 10.0.
     * Среднее значение для одного элемента равно самому элементу.
     * Пустой массив:
     * Вход: [] → Выход: Исключение NoSuchElementException.
     */

    @BeforeEach
    public void setUpTest(){
        averageInt = new AverageInt();
    }

    @Test
    public void userCanFindAverageIntOfValidArray() {
        int[] arrayOfInts = {1,2,3,4,5};
        Double averageIntOfArray = averageInt.findAverage(arrayOfInts);
        Double expectedAverageInt = 3.0;
        assertEquals(expectedAverageInt, averageIntOfArray);
    }

    @Test
    public void userCanFindAverageIntOfValidArrayWithOneInt() {
        int[] arrayOfInts = {10};
        Double averageIntOfArray = averageInt.findAverage(arrayOfInts);
        Double expectedAverageInt = 10.0;
        assertEquals(expectedAverageInt, averageIntOfArray);
    }

    @Test
    public void userCanFindAverageIntOfEmptyArray(){
        assertThrows(NoSuchElementException.class, () -> {
            int[] arrayEmptyOfInts = {};
            averageInt.findAverage(arrayEmptyOfInts);
        }, "Finding average int of empty array should lead to no such element exception");
    }
}
