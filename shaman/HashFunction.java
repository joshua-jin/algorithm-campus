public class HashFunction {
    public int hashCode(char[] key, int HASH_SIZE) {
        int FACTOR = 33;
        long sum = 0;
        long base = 1;
        for (int i = key.length - 1; i >= 0; i--) {
            sum += key[i] * base % HASH_SIZE;
            sum %= HASH_SIZE;
            base = base * FACTOR % HASH_SIZE;
        }
        return (int) sum;
    }
}