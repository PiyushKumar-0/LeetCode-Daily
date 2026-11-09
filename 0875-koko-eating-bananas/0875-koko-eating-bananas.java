class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int pile: piles){
            if(pile>high){
                high=pile;
            }
        }
        int ans=high;
        while(low<=high){
            int mid=low + (high-low) / 2;
            if(canEatInTime(piles, mid, h)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    private boolean canEatInTime(int[] piles,int k,int h){
        long totalHours = 0;
        for(int pile : piles){
            totalHours += (pile + k - 1)/k;
        }
        return totalHours <= h;
    }
}