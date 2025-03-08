class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int l = 0;
        int cnt = 0, minOp = Integer.MAX_VALUE;

        for(int r = k-1; r < blocks.length(); r++)
        {
            int i = l;
            while(i <= r)
            {
                if(blocks.charAt(i) == 'W')
                cnt++;
                i++;
            }
            minOp = Math.min(cnt, minOp);
            cnt = 0;
            l++;
        }
        return minOp;
    }
}