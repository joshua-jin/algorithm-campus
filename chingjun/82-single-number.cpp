class Solution {
public:
	/**
	 * @param A: Array of integers.
	 * return: The single number.
	 */
    int singleNumber(vector<int> &A) {
        int out = 0;
        for (int i : A) out = out ^ i;
        return out;
    }
};
