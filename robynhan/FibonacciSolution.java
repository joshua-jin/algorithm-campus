package org.robynhan;

public class FibonacciSolution {

    public int fibonacci(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        // as recursion will cause stack overflow.
        int n1 = 0, n2 = 1, sn = 0;
        for (int i = 2; i < n; i++) {
            sn = n1 + n2;
            n1 = n2;
            n2 = sn;
        }
        return sn;

//        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
