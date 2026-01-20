package practice_homework9.task15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MapToLengthsTest {
    StringConverter stringConverter;

    /**
     * positive: java, c++, go - 4,3,2
     * negative: [] - []
     */

    @BeforeEach
    public void setUpTest() {
        stringConverter = new StringConverter();
    }

    @Test
    public void userCanConvertValidList() {
        List<String> initialList = new ArrayList<>(Arrays.asList("Java", "C++", "Go"));
        List<Integer> expectedResponseList = new ArrayList(Arrays.asList(4, 3, 2));
        List<Integer> actualResponseList = stringConverter.mapToLengths(initialList);
        assertEquals(expectedResponseList, actualResponseList);
    }

    @Test
    public void userCanConvertEmptyList() {
        List<String> initialList = new ArrayList<>();
        List<Integer> expectedResponseList = new ArrayList();
        List<Integer> actualResponseList = stringConverter.mapToLengths(initialList);
        assertEquals(expectedResponseList, actualResponseList);
    }
}
