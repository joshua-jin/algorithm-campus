class Solution:
    """
    @param n: An integer
    @return: An integer
    """
    def climbStairs(self, n):
        # write your code here
        a = b = 1
        for i in range(1, n):
            a, b = b, a + b
        return b
