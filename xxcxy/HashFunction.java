package algorithm.lintcode.easy;

public class HashFunction {
    public int hashCode(char[] key, int HASH_SIZE) {
        long count = 0;
        for (int i = 0, len = key.length; i < len; i++) {
            count = key[i] + count * 33;
            count %= HASH_SIZE;
        }
        return (int) count;
    }
}
