class Solution {
    public int countDistinctIntegers(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int s : nums)
        {
            set.add(s);
            set.add(reverse(s));
        }

        return set.size();
    }

    private int reverse(int num)
    {
        int r = 0;
        while(num != 0)
        {
            r = r * 10 + num % 10;
            num /= 10;
        }
        return r;
    }
}