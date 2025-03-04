class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        // 2nd appraoch

        int n = nums.length;
        int left = 0;
        int[] res = new int[n];

        for(int i = 0; i < n; i++)
        {
            if(nums[i] < pivot)
            res[left++] = nums[i];
        } 

        for(int i = 0; i < n; i++)
        {
            if(nums[i] == pivot)
            res[left++] = nums[i];
        } 

        for(int i = 0; i < n; i++)
        {
            if(nums[i] > pivot)
            res[left++] = nums[i];
        } 

        return res;

/*
        // 1st approach
        int n = nums.length;
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        // puting pivot on its correct position
        for(int i = 0; i < n; i++)
        {
            if(nums[i] == pivot)
            a2.add(nums[i]);
        }

        // puting other elements on their positions
        for(int i = 0; i < n; i++)
        {
            if(nums[i] < pivot)
                a1.add(nums[i]);
            else if(nums[i] > pivot)
                a2.add(nums[i]);
        }

        // creating the res
        int idx = 0;
        for(int i = 0; i < a1.size(); i++)
            nums[idx++] = a1.get(i);
        for(int i = 0; i < a2.size(); i++)
            nums[idx++] = a2.get(i);

        return nums;
*/
    }
}