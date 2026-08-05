class Solution {
    public int kadanes(int[] A) {
        int n = A.length;
        int currsum = A[0];
        int maxsum = A[0];
        
        for (int i = 1; i < n; i++) {
            currsum = Math.max(A[i], currsum + A[i]);
            maxsum = Math.max(maxsum, currsum);
        }
        
        return maxsum;
    }

    public int maxSubarraySumCircular(int[] nums) {
        if (nums.length == 0) return 0;
        
        int x = kadanes(nums);
        int y = 0;
        
        for (int i = 0; i < nums.length; i++) {
            y += nums[i];
            nums[i] *= -1;
        }
        
        int z = kadanes(nums);
        
        if (y + z == 0) return x;
        
        return Math.max(x, y + z);
    }
}