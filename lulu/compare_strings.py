class Solution:
    """
    @param A : A string includes Upper Case letters
    @param B : A string includes Upper Case letters
    @return :  if string A contains all of the characters in B return True else return False
    """
    def compareStrings(self, A, B):
        # write your code here
        A = list(A)
        for x in B:
            if not self.letter_in_list(A, x):
                return False
        return True
    def letter_in_list(self, li, letter):
        for x in li:
            if letter == x:
                li.remove(x)
                return True
        return False
                