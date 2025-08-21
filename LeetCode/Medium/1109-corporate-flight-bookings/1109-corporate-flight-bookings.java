class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        
        // Brute Force Approach
        int[] ans = new int[n];

        for(int i = 0; i < bookings.length; i++)
        {
            int first = bookings[i][0];
            int last = bookings[i][1];
            int seat = bookings[i][2];

            for(int j = first-1; j < last; j++)
            ans[j] += seat; 
        }
        return ans;
    }
}