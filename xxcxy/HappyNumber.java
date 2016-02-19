package algorithm.lintcode.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        // Write your code here
        return happy(n, new HashSet<Integer>());
    }

    private boolean happy(int n, Set<Integer> processed) {
        if (n == 1) {
            return true;
        } else if (processed.contains(n)) {
            return false;
        } else {
            processed.add(n);
            return happy(calculate(n), processed);
        }
    }

    private int calculate(int n) {
        int num = 0;
        while (n >= 10) {
            num += (n % 10) * (n % 10);
            n = n / 10;
        }
        num += (n * n);
        return num;
    }
}
