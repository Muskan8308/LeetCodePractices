class Solution {
    public int findLucky(int[] arr) {
        
        int[] freq = new int[505];

        // making the frequency array for the given array 
        for(int a : arr)
        {
            freq[a]++;
        }

        int largestMax = -1;

        // iterate the array to check for the largest lucky number

        for(int i = 1; i < 501; i++)
        {
            if(i == freq[i])
            {
                largestMax = i;
            }
        }
        return largestMax;
    }
}