package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {
    private List<Integer> integers;

    public NumberSequence(List<Integer> integers) {
        this.integers = integers;
    }

    public NumberSequence(int count, int origin, int bound) {
        integers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            integers.add(random.nextInt(origin, bound));
        }
    }

    public List<Integer> closeToAverage(int value) {
        List<Integer> result = new ArrayList<>();
        int average = calculateAverage(integers);
        for (int i: integers) {
            if (Math.abs(i - average) <= value) {
                result.add(i);
            }
        }
        return result;
    }

    private int calculateAverage(List<Integer> integers) {
        int sum = 0;
        for (int i: integers) {
            sum += i;
        }
        return sum / integers.size();
    }

    public List<Integer> getIntegers() {
        return integers;
    }
}
