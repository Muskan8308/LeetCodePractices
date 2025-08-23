class NumArray {

    int[] nums;
    public NumArray(int[] arr) {

        nums = arr;         // shallow copy 
        for(int i = 1; i < nums.length; i++)
        nums[i] += nums[i-1];
    }
    
    public int sumRange(int left, int right) {
        
        if(left == 0) return nums[right];
        return nums[right] - nums[left-1];
    }
}

/*
    TC for prefix sum array = O(n)
    TC for 'm' queries = O(m)
    so, Total TC = O(m + n) ~ O(n)
    SC = O(n) and AS = O(n) extra space
*/

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */