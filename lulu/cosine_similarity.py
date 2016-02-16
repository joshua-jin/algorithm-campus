import math
class Solution:
    """
    @param A: An integer array.
    @param B: An integer array.
    @return: Cosine similarity.
    """
    def cosineSimilarity(self, A, B):
        # write your code here
        if A == [] or B == []:
            return 2
        denominator = (math.sqrt(sum([i * i for i in A])) * math.sqrt(sum([i * i for i in B])))
        if denominator == 0:
            return 2
        return sum([i * j for i, j in zip(A, B)]) / denominator




