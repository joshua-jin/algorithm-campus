class Solution:
    """
    @param a: The first integer
    @param b: The second integer
    @return:  The sum of a and b
    """
    # Actually both of these methods fail to work in Python
    # because Python supports infinite integer
    # Non-recursive
    def aplusb(self, a, b):
        # write your code here, try to do it without arithmetic operators.
        while b != 0:
            carry = a & b
            a = a ^ b
            b = carry << 1
        return a

    # Recursive
    def aplusb(self, a, b):
        carry = a & b
        result = a ^ b
        return result if carry == 0 else self.aplusb(result, carry << 1)
