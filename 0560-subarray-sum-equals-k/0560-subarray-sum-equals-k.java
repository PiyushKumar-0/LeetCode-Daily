class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int currentsum=0;
        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        for(int r=0;r<n;r++){
            currentsum+=nums[r];
            if(map.containsKey(currentsum-k)){
                count+=map.get(currentsum-k);
            }
            map.put(currentsum,map.getOrDefault(currentsum,0)+1);
            }
           
        return count;

    }
}