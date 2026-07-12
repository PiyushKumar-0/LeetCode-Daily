class Solution {
    public int maxSubArray(int[] nums) {
       int n= nums.length;
       int crrsum=0;
       int maxsum=Integer.MIN_VALUE;
       for(int i=0;i<n;i++)
       {  
          if(n==1){
            return nums[i];
          }
          else{
          crrsum=crrsum+nums[i];
          maxsum=Math.max(crrsum,maxsum);
          if(crrsum<0)
          {
            crrsum=0;
          }
        } 
       }

       return maxsum;
    }
}