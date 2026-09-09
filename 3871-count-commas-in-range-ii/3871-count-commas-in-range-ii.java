class Solution {
    public long countCommas(long n) {
        long count=0;
        long threshold=1000;
        while(n>=threshold){
            count+=(n-threshold+1);
            if(threshold > Long.MAX_VALUE/1000L){
                break;
            }
            threshold *=1000L;
        }
        return count;
    }
}