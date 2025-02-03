class Solution {

    public int findMax(int[] arr)
    {
        int maxi = Integer.MIN_VALUE;
        for(int a : arr)
        {
            maxi = Math.max(maxi, a);
        }
        return maxi;
    }

    public int heightChecker(int[] heights) {
        // find maximum element
        int num = findMax(heights);

        // make frequency array
        int[] freq = new int[num + 1];

        // fill freq array
        for(int i = 0; i < heights.length; i++)
        {
            freq[heights[i]]++;
        }

        // sort the array using freq array
        int[] expected = new int[heights.length];
        int k = 0;
        for(int i= 0; i < freq.length; i++)
        {
            for(int j = 0; j < freq[i]; j++)
            {
                expected[k++] = i;
            }
        }

        // compare expected and heights array
        int cnt = 0;
        for(int i = 0; i < heights.length; i++)
        {
            if(heights[i] != expected[i])
            cnt++;
        }

        return cnt;
    }
}