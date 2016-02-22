package org.robynhan.week4;

import java.util.ArrayList;

public class FizzBuzzSolution {
    public ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> results = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                results.add("fizz buzz");
            } else if (i % 5 == 0) {
                results.add("buzz");
            } else if (i % 3 == 0) {
                results.add("fizz");
            } else {
                results.add(String.valueOf(i));
            }
        }
        return results;
    }
}
