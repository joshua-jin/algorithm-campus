class Solution:
    """
    @param a, b: Two integer
    return: An integer
    """
    def bitSwapRequired(self, a, b):
        # write your code here
        return self.countOnes(a^b)
        
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
