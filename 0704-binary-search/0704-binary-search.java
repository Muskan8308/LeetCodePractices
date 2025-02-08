class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0)
        return -1;

        return binarySearch(nums, 0, nums.length-1, target);
    }

    private int binarySearch(int[] nums, int s, int e, int target)
    {
        if(s > e) return -1;

        int mid = s + (e-s)/2;
        
        if(nums[mid] == target)
            return mid;
        else if(target > nums[mid])
            return binarySearch(nums, mid+1, e, target);
        else
            return binarySearch(nums, s, mid-1, target);

    }
}