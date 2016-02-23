package org.robynhan.week5;

public class HashCodeSolution {
    public int hashCode(char[] key, int HASH_SIZE) {
        // write your code here
        int len = key.length;
        long hashcode = 0;
        long base = 1;
        for (int i = len - 1; i >= 0; i--) {
            hashcode += Integer.valueOf(key[i]) * base % HASH_SIZE;
            hashcode %= HASH_SIZE;
            base = base * 33 % HASH_SIZE;
        }
        return (int) hashcode;
    }
}
