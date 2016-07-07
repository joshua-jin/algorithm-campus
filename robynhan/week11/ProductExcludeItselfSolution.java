package org.robynhan.week11;

import java.util.ArrayList;

public class ProductExcludeItselfSolution {
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        ArrayList list = new ArrayList();
        for (int i = 0; i < A.size(); i++) {
            long tmp = 1;
            for (int j = 0; j < A.size(); j++) {
                if (j != i) tmp *= A.get(j);
            }
            list.add(tmp);
        }
        return list;
    }
}
