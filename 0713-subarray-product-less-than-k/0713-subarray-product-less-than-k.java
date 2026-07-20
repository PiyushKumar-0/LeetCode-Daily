class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int l=0;
        int prod=1;
        if(k<=1){return 0;}
        for(int r=0;r<n;r++){
            prod=prod*nums[r];
            while(prod>=k){
                prod=prod/nums[l];
                l++;
            }
            count+=r-l+1;
        }
        return count;
    }
}