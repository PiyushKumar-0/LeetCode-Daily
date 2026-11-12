class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n= nums.length;
        if(n==0) return 0;

        int maxLength=1;
        int inccount=1;
        int deccount=1;
        for(int i=0;i<n-1;i++){
            if(nums[i+1]>nums[i]){
                inccount+=1;
                deccount=1;
            }
            else if(nums[i+1]<nums[i]){
                deccount+=1;
                inccount=1;
            }else{
                inccount=1;
                deccount=1;
            }
            maxLength=Math.max(maxLength,Math.max(inccount, deccount));
            }
            return maxLength;
        }
}