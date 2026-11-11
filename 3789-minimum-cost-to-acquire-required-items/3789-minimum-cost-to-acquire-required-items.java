class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long totalCost = 0;
        long commonNeed = Math.min(need1,need2);
        long unitBothCost = Math.min((long) costBoth, (long) cost1 + cost2);
        totalCost += commonNeed * unitBothCost;
        need1 -= commonNeed;
        need2 -= commonNeed;
        if(need1 > 0){
            long unit1Cost = Math.min((long) costBoth, (long) cost1);
            totalCost += need1 * unit1Cost;
        }
        if(need2 > 0){
            long unit2Cost = Math.min((long) costBoth, (long) cost2);
            totalCost += need2 * unit2Cost;
        }
        return totalCost;
    }
}