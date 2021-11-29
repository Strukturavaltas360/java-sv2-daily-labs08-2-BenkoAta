package day01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberSequenceTest {
    NumberSequence numberSequence = new NumberSequence(Arrays.asList(10, 15, 20, 13, 17));

    @Test
    void createTest() {
        assertEquals(5, numberSequence.getIntegers().size());

        numberSequence = new NumberSequence(10, 10, 20);
        assertEquals(10, numberSequence.getIntegers().size());
        assertTrue(getMin(numberSequence.getIntegers()) >= 10);
        assertTrue(getMax(numberSequence.getIntegers()) <= 20);
    }

    private int getMin(List<Integer> integers) {
        Integer min = null;
        for (int i: integers) {
            if (min == null || min < i) {
                min = i;
            }
        }
        return min;
    }

    private int getMax(List<Integer> integers) {
        Integer max = null;
        for (int i: integers) {
            if (max == null || max > i) {
                max = i;
            }
        }
        return max;
    }

    @Test
    void closeToAverage() {
        List<Integer> result = numberSequence.closeToAverage(2);
        assertEquals(Arrays.asList(15, 13, 17), numberSequence.closeToAverage(2));
        assertEquals(1, numberSequence.closeToAverage(1).size());
    }
}