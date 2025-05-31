class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] isValid = new boolean[nums.length];

        helper(nums, temp, isValid, ans);
        return ans;
    }

    private void helper(int[] nums, List<Integer> temp, boolean[] isValid, List<List<Integer>> ans)
    {
        // base case
        if(temp.size() == nums.length)
        {
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < temp.size(); i++)
            list.add(temp.get(i));

            ans.add(list);
            return;
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(isValid[i] == false)
            {
                temp.add(nums[i]);
                isValid[i] = true;
                helper(nums, temp, isValid, ans);
                isValid[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }
}