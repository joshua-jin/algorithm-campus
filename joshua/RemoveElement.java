package com.lintcode;

/**
 * @author : Joshua
 * Date:     4/8/16
 * @see <a href="http://www.lintcode.com/zh-cn/problem/remove-element/">删除元素</a>
 */
public class RemoveElement {
    /**
     *@param A: A list of integers
     *@param elem: An integer
     *@return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
        if (A.length == 0) {
            return 0;
        }

        if (A.length == 1) {
            if (A[0] == elem) {
                return 0;
            }
            else {
                return 1;
            }
        }

        int i = 0;
        int j = 0;

        while (i < A.length) {
            if (A[j] != elem) {
                i++;
                j++;
            } else {
                if (A[i] != elem) {
                    A[j] = A[i];
                    A[i] = elem;
                    j++;
                }
                i++;
            }
        }
        return j;
    }
}
