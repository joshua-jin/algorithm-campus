class Solution:
    # @param {int} n an integer
    # @return {boolean} true if this is a happy number or false
    def isHappy(self, n):
        # Write your code here
        sum = n
        nums = {}
        while sum != 1:
            sum = self.cal_square_sum(sum)
            if sum in nums:
                return False
            nums[sum] = 1
        return True
            
    def cal_square_sum(self, n):
        sum = 0
        while n > 0:
            sum += (n % 10) ** 2
            n = n / 10
        return sum
