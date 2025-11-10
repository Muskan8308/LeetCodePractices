class Solution {
    public int minCost(int n, int[] cuts) {

        int m = cuts.length;
        int[] arr = new int[m+2];
        int i;
        for(i = 0; i < m; i++)
        arr[i] = cuts[i];

        arr[i++] = 0;
        arr[i] = n;

        Arrays.sort(arr);

        return cost(1, arr.length-2, arr);
        
    }

    private int cost(int i, int j, int[] arr)
    {
        if(i > j) return 0;

        int minCost = Integer.MAX_VALUE;
        for(int k = i; k <= j; k++)
        {
            int len = arr[j+1] - arr[i-1];
            int totalCost = cost(i, k-1, arr) + cost(k+1, j, arr) + len;
            minCost = Math.min(minCost, totalCost);
        }

        return minCost;
    }
}