package algorithm.lintcode.easy;

public class CosineSimilarity {
    public double cosineSimilarity(int[] A, int[] B) {
        // write your code here
        long dividend = 0L;
        long divisorA = 0L;
        long divisorB = 0L;
        for (int i = 0, len = A.length; i < len; i++) {
            dividend += (A[i] * B[i]);
            divisorA += (A[i] * A[i]);
            divisorB += (B[i] * B[i]);
        }
        long divisor = divisorA * divisorB;
        if(divisor == 0) {
            return 2.0;
        }
        return ((double)dividend) / (Math.sqrt(divisor));
    }
}
