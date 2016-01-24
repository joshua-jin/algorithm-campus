/**
 * http://www.lintcode.com/zh-cn/problem/fibonacci/
 * http://blog.zhaojie.me/2011/11/does-tail-recursion-improve-time-and-space-complexities-1.html
 */
public class Fibonacci {
    public int fibonacci(final int n) {
        return doFibonacci(n, 0, 1);
    }
    private int doFibonacci(int n, int f1, int f2) {
        return n < 2 ? f1 : doFibonacci(n - 1, f2, f1 + f2);
    }
}