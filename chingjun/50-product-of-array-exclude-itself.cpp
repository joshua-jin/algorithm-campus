class Solution {
public:
    /**
     * @param A: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    vector<long long> productExcludeItself(vector<int> &nums) {
        // write your code here
        vector<long long> prodFront, prodBack;
        prodFront.resize(nums.size());
        prodBack.resize(nums.size());
        long long prodFrontSoFar = 1;
        long long prodBackSoFar = 1;
        for (int i = 0; i < nums.size(); i++) {
            prodFront[i] = prodFrontSoFar;
            prodFrontSoFar *= nums[i];
            int j = nums.size() - i - 1;
            prodBack[j] = prodBackSoFar;
            prodBackSoFar *= nums[j];
        }
        
        for (int i = 0; i < nums.size(); i++) {
            prodFront[i] *= prodBack[i];
        }
        
        return prodFront;
    }
};
