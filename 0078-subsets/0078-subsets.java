class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        return findSubsets(nums, 0, new ArrayList<>());
    }

    private List<List<Integer>> findSubsets(int[] nums, int idx, List<Integer> currAns)
    {
        List<List<Integer>> list = new ArrayList<>();
        if(idx >= nums.length)
        {
            list.add(new ArrayList<>(currAns));
            return list;
        }

        // Inclusion
        currAns.add(nums[idx]);
        list.addAll(findSubsets(nums, idx+1, currAns));

        // Exclusion
        currAns.remove(currAns.size()-1);
        list.addAll(findSubsets(nums, idx+1, currAns));

        return list;
    }
}