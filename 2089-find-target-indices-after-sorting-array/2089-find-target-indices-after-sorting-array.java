class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        int s = 0, e = nums.length-1;
        List<Integer> list = new ArrayList<>();
        if(nums == null || nums.length == 0) return List.of();      // will return an empty list

        Arrays.sort(nums);
        while(s <= e)
        {
            int mid = s + (e-s)/2;

            if(target == nums[mid])
            {
                list.add(mid);
                e = mid - 1;
            }
            else if(target > nums[mid])
                s++;
            else
                e--;
        }
        Collections.sort(list);
        return list;
    }
}