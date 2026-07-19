class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int l=0; int zerocount=0;
        for(int r=0;r<n;r++){
            if(nums[r]==0){
                zerocount++;
            }
            if(zerocount>k){
                if(nums[l]==0){
                    zerocount--;
                }
            l++;
            }
        }
        return n-l;
    }
}