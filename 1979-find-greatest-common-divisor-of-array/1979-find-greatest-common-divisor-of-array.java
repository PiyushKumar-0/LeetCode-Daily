class Solution {
    public int gcd(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            max=Math.max(num,max);
            min=Math.min(num,min);
        }
        return gcd(max,min);
    }
}