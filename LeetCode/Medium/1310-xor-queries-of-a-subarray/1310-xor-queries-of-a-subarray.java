class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {

        // firstly, we'll store the prefix xor of each element
        int n = arr.length;
        int[] pref = new int[n];
        int[] ans = new int[queries.length];
        pref[0] = arr[0];

        for(int i = 1; i < n; i++)
        {
            pref[i] = pref[i-1] ^ arr[i]; 
        }

        // Now we'll computing xor of the queries

        for(int i = 0; i < queries.length; i++)
        {
            int Qi = queries[i][0], Qj = queries[i][1];
            if(Qi != 0)
            ans[i] = pref[Qj] ^ pref[Qi-1];
            else
            ans[i] = pref[Qj];
        }

        return ans;
    }

   
}