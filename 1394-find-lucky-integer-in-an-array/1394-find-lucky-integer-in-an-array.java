class Solution {
    public int findLucky(int[] arr) {
        
        int[] freq = new int[505];

        // making the frequency array for the given array 
        for(int a : arr)
        {
            freq[a]++;
        }

        int maxi = arr[0];
        int largestMax = -1;

        // iterate the array to check for the largest lucky number

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == freq[arr[i]])
            {
                maxi = arr[i];
                largestMax = Math.max(maxi, largestMax);
            }
        }
        return largestMax;
    }
}