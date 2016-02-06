class Solution:
    # @param {string} a a number
    # @param {string} b a number
    # @return {string} the result
    def addBinary(self, a, b):
        # Write your code here
        max_len = max(len(a), len(b))
        a = a.zfill(max_len)
        b = b.zfill(max_len)

        result = ''
        carry = 0
        for a, b in zip(a, b)[::-1]:
            bits_sum = carry
            bits_sum += int(a) + int(b)
            result = ('0' if bits_sum % 2 == 0 else '1') + result
            carry = 0 if bits_sum < 2 else 1

        result = ('1' if carry > 0 else '') + result

        return result
