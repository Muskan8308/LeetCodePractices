class Solution {
    public int minimumChairs(String s) {
        char ch[] = s.toCharArray();
        int cnt = 0, maxi = 0;
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] == 'E')
            {
                cnt++;   
            }
            else
            {
                if(cnt > 0)
                    cnt--;
            }

            maxi = Math.max(maxi, cnt);
        }
        return maxi;
    }
}