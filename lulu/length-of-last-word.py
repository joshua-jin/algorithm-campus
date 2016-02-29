class Solution:
    # @param {string} s A string
    # @return {int} the length of last word
    def lengthOfLastWord(self, s):
        # Write your code here
        if s == '':
            return 0
        return len(s.split()[-1])
