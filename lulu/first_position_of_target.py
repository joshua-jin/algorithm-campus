class Solution:
    # @param nums: The integer array
    # @param target: Target number to find
    # @return the first position of target in nums, position start from 0 
    def binarySearch(self, nums, target):
        # write your code here
        return self.search(nums, 0, len(nums)-1, target)
        
    def search(self, nums, start, end, target):
        
        if start == end:
            if nums[start] == target:
                return start
            else:
                return -1
        i = (start + end) / 2
        if nums[i] >= target:
            return self.search(nums, start, i, target)
        elif nums[i] < target:
            return self.search(nums, i+1, end, target)
