class Solution {
    public int bestClosingTime(String customers) {
        
        int n = customers.length();
        int[] pref = new int[n+1];
        int[] suff = new int[n+1];

        // make prefix array for all 'N'
        pref[0] = 0;
        for(int i = 1; i < n; i++)
        {
            pref[i] = pref[i] + (customers.charAt(i-1) == 'N' ? 1 : 0);
        }

        // make suffix array for all 'Y'
        suff[n] = 0;
        for(int i = n-1; i >= 0; i--)
        {
            suff[i] = suff[i] + (customers.charAt(i) == 'Y' ? 1 : 0);
        }

        // find the best closing time i.e earliest hour (modifying pref array)
        int minHour = Integer.MAX_VALUE, minIdx = 0;
        for(int i = 0; i < n+1; i++)
        {
            pref[i] = pref[i] + suff[i];
            if(minHour > pref[i])
            {
                minHour = pref[i];
                minIdx = i;
            }
        }
        return minIdx;
    }
}