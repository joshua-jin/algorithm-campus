package org.robynhan.week4;

public class CountOnesSolution {
    public int countOnes(int num) {
        int count = 0;
        while (num != 0) {
            // 将高位1依次清零.
            num = num & (num - 1);
            count++;
        }
        return count;
    }
}
