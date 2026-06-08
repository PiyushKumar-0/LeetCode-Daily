class Solution:
    def pivotArray(self, nums, pivot):
        n = len(nums)

        ans = [pivot] * n

        smaller_count = 0
        greater_count = 0

        for num in nums:
            if num < pivot:
                smaller_count += 1

            if num > pivot:
                greater_count += 1

        sp = 0
        gp = n - greater_count

        for num in nums:

            if num < pivot:
                ans[sp] = num
                sp += 1

            if num > pivot:
                ans[gp] = num
                gp += 1

        return ans