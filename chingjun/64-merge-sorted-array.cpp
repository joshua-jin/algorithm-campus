class Solution {
public:
    /**
     * @param A: sorted integer array A which has m elements, 
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    void mergeSortedArray(int A[], int m, int B[], int n) {
        // write your code here
        int *target = A + m + n - 1;
        int *Astart = A + m - 1;
        int *Bstart = B + n - 1;
        
        while (Astart >= A && Bstart >= B) {
            if (*Astart > *Bstart) {
                *target = *Astart;
                target--;
                Astart--;
            } else {
                *target = *Bstart;
                target--;
                Bstart--;
            }
        }
        while (Astart >= A) {
            *target = *Astart;
            target--;
            Astart--;
        }
        while (Bstart >= B) {
            *target = *Bstart;
            target--;
            Bstart--;
        }
    }
};
