class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int n = arr.length;
        for(int i = 0; i < n-1; i++)
        {
            if(arr[i] > arr[i+1])
            return i;
        }
        return n-1;
    }
}