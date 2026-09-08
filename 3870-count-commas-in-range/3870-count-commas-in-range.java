class Solution {
    public int countCommas(int n) {
        int count=0;
        if(n<1000){
            return 0;
        }
        for(int nums=1000;nums<=n;nums++){
            count+=1;
        }
        return count;
    }
}