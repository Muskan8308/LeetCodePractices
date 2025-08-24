class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        // using sliding window approach

        int avg = 0, sum = 0, cnt = 0;
        for(int i = 0; i < k; i++)
        {
            sum += arr[i]; 
        }
        avg = sum/k;
        if(avg >= threshold) cnt++;

        int i = 1, j = k;
        while(j < arr.length)
        {
            sum += arr[j] - arr[i-1];
            avg = sum / k;
            if(avg >= threshold) cnt++;
            i++; j++;
        }

        return cnt;
    }
}