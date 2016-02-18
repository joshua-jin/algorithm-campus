class Solution:
    # @param {int} n the nth
    # @return {string} the nth sequence
    def countAndSay(self, n):
        # Write your code here
        say = '1'
        for x in xrange(0, n-1):
            tmp = ''
            count = 0
            former = say[0]
            for i in say:
                if i == former:
                    count += 1
                else:
                    tmp += str(count) + former
                    count = 1
                former = i
            tmp += str(count) + former
            say = tmp
        return say
