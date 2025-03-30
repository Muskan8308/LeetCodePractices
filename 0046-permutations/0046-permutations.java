class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        return permuteHelper(nums,0);
        
    }

    private List<List<Integer>> permuteHelper(int[] nums, int start)
    {
        List<List<Integer>> list = new ArrayList<>();

        // base case 
        if(start == nums.length)
        {
            // add the permutation
            list.add(new ArrayList<>(copyArrayToList(nums)));
            return list;
        }

        for(int i = start; i < nums.length; i++)
        {
            swap(nums, start, i);       // swapping to fix nums[i] at start
            list.addAll(permuteHelper(nums, start + 1));
            swap(nums, start, i);       // Undo the swap i.e backtarck
        }
        return list;
    }

    private void swap(int[] nums, int l, int r)
    {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    private List<Integer> copyArrayToList(int[] nums)
    {
        List<Integer> list = new ArrayList<>();
        for(int num : nums)
        list.add(num);

        return list;
    }
}