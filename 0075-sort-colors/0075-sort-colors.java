class Solution {
    public void sortColors(int[] nums) {

        // Using Dutch National Flag Algo

        int lo = 0, mid = 0, hi = nums.length-1;

        while(mid <= hi)
        {
            if(nums[mid] == 0)
            {
                swap(nums, mid, lo);
                mid++;
                lo++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else if(nums[mid] == 2)
            {
                swap(nums, mid, hi);
                hi--;
            }
        }
    }

    private void swap(int[] arr, int l, int r)
    {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}