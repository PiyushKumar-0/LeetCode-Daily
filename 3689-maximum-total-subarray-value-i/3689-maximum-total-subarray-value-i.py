class Solution(object):
    def maxTotalValue(self, nums, k):
        max_element=max(nums)
        min_element=min(nums)

        Array_max=max_element-min_element
        return Array_max*k

        