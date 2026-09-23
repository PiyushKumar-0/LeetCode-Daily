class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }
        int target=totalsum-x;
        if(target==0){
            return nums.length;
        }
        if(target<0){
            return -1;
        }
        int maxlength=-1;
        int currsum=0;
        int left=0;
        for(int right=0;right<n;right++){
            currsum+=nums[right];

            while(currsum>target && left<=right){
                currsum-=nums[left];
                left++;
            }
            if(currsum==target){
                maxlength=Math.max(maxlength,right-left+1);
            }
        }
        return maxlength == -1?-1:n-maxlength;
   }
}