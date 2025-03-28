class Solution {
    public int totalNumbers(int[] digits) {
        
        if(digits.length == 0)
        return 0;
        return countNum(Arrays.toString(digits), "", 0);
    }

    private int countNum(String s, String currAns, int cnt)
    {
        if(s.length() == 0)
        {
            if(s.length() == 3 && Integer.parseInt(s) % 2 == 0)
            cnt++;

            return cnt;
        }

        char curr = s.charAt(0);
        String remString = s.substring(1);

        countNum(remString, currAns + curr, cnt);
        countNum(remString, currAns, cnt);
        
        return cnt;
    }
}