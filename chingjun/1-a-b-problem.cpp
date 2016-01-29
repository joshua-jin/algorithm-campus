class Solution {
public:
    /*
     * @param a: The first integer
     * @param b: The second integer
     * @return: The sum of a and b
     */
    int aplusb(int a, int b) {
        while (b) {
            int sum = a ^ b;
            int carry = a & b;
            a = sum;
            b = carry << 1;
        }
        return a;
    }
};
