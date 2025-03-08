class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int l = 0;
        int cnt = 0, minOp = Integer.MAX_VALUE;
        StringBuilder str = new StringBuilder(blocks);

        for(int r = k-1; r < str.length(); r++)
        {
            int i = l;
            while(i <= r)
            {
                if(str.charAt(i) == 'W')
                {
                    
                    cnt++;
                }
                i++;
            }
            minOp = Math.min(cnt, minOp);
            cnt = 0;
            l++;
        }
        return minOp;
    }
}