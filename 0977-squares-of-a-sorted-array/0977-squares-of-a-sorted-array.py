class Solution(object):
    def sortedSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        s_list = [num**2 for num in nums]
        s_list.sort()

        return s_list        