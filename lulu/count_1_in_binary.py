class Solution:
    # @param num: an integer
    # @return: an integer, the number of ones in num
    def countOnes(self, num):
        # write your code here
        counter = 0
        a = 1
        for i in range(0, 32):
            digit = num & a
            if digit != 0:
                counter += 1
            a *= 2
        return counter
