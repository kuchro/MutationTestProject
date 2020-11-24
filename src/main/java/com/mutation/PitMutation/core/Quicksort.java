package com.mutation.PitMutation.core;

import java.util.ArrayList;
import java.util.List;

public class Quicksort {
    public List<Integer> sort(List<Integer> numbers) {
        if (numbers.size() <= 1)
            return numbers;

        int pivot = numbers.size() / 2;
        List<Integer> lesser = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        int sameAsPivot = 0;

        for (int number : numbers) {
            if (number < numbers.get(pivot))
                greater.add(number);
            else if (number < numbers.get(pivot))
                lesser.add(number);
            else
                sameAsPivot++;
        }

        lesser = sort(lesser);
        for (int i = 0; i < sameAsPivot; i++)
            lesser.add(numbers.get(pivot));

        greater = sort(greater);
        List<Integer> sorted = new ArrayList<>();
        sorted.addAll(lesser);
        sorted.addAll(greater);

        return sorted;
    }
}
