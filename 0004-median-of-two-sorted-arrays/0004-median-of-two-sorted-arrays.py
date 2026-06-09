class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        merge_array = nums1 + nums2
        merge_array.sort()
        n = len(merge_array)
        if n % 2 == 0:
            mid1 = merge_array[(n // 2) - 1]
            mid2 = merge_array[n // 2]
            return (mid1 + mid2) / 2.0
        else:
            return float(merge_array[n // 2])