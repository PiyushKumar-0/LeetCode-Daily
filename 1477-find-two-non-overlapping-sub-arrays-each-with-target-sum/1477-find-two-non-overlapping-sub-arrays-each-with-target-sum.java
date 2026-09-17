class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] minbestlentillidx = new int[n];
        Arrays.fill(minbestlentillidx, Integer.MAX_VALUE);
        int i = 0;
        int currsum = 0;
        int bestminlen = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            currsum += arr[j];
            while (currsum > target) {
                currsum -= arr[i];
                i++;
            }
            if (currsum == target) {
                int len = j - i + 1;
                if (i > 0 && minbestlentillidx[i - 1] != Integer.MAX_VALUE) {
                    result = Math.min(result, len + minbestlentillidx[i - 1]);
                }
                bestminlen = Math.min(bestminlen, len);
            }
            minbestlentillidx[j] = bestminlen;
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}