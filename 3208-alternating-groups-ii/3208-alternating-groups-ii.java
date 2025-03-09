class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        
        int n = colors.length;
        int[] ext = new int[2 * n];
        int cnt = 0;

        // copying the array twice
        for(int i = 0; i < 2 * n; i++)
        {
            ext[i] = colors[i % n];
        }

        // using sliding window
        for(int i = 0; i < n; i++)
        {
            boolean flag = true;
            for(int j = i; j < i + k - 1; j++)
            {
                if(ext[j] == ext[j+1])
                {
                    flag = false;
                    break;
                }
            }
            if(flag) cnt++;
        }
        return cnt;
    }
}