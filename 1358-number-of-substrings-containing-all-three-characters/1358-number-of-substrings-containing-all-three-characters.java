class Solution {
    public int numberOfSubstrings(String s) {
        
        int n = s.length();
        int l = 0, r = 0;
        int subStr = 0;

        int cntA = 0, cntB = 0, cntC = 0;

        while(r < n)
        {
            if(s.charAt(r) == 'a')
            cntA++;
            else if(s.charAt(r) == 'b')
            cntB++;
            else
            cntC++;

            while(cntA > 0 && cntB > 0 && cntC > 0)
            {
                subStr += n - r;
                if(s.charAt(l) == 'a')
                cntA--;
                else if(s.charAt(l) == 'b')
                cntB--;
                else
                cntC--;
                l++;
            }

            r++;
        }
        return subStr;
    }
}