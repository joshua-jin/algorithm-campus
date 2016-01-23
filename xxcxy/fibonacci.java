class Solution {
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        int first = 0;
        int second = 1;
        int current = n == 1 ? 0 : 1;
        for(int i = 2; i < n; i++) {
            current = first + second;
            first = second;
            second = current;
        }
        return current;
    }
}
