package algorithm.lintcode.easy;

import java.util.ArrayList;

public class ProductOfArrayExcludeItself {
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        ArrayList<Long> result = new ArrayList<Long>(A.size());
        long[] lProduct = new long[A.size()];
        long[] rProduct = new long[A.size()];
        lProduct[0] = 1;
        rProduct[0] = 1;
        for (int i = 1, len = A.size(); i < len; i++) {
            lProduct[i] = lProduct[i - 1] * A.get(i - 1);
            rProduct[i] = rProduct[i - 1] * A.get(len - i);
        }
        for (int i = 0, len = A.size(); i < len; i++) {
            result.add(lProduct[i] * rProduct[len - i - 1]);
        }
        return result;
    }
}
