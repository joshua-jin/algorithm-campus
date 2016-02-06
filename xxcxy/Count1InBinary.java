package algorithm.lintcode.easy;

public class Count1InBinary {
    public int countOnes(int num) {
        // write your code here
        if(num == 0) {
            return 0;
        }
        return (num & 1) + countOnes(num >>> 1);
    }
}
