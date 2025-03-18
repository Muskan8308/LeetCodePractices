class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        // add elements of nums1 into set.
        for(int num : nums1)
        {
            set.add(num);
        }

        // check if elements of nums2 is present on nums1.
        for(int num : nums2)
        {
            if(set.contains(num))
            res.add(num);
        }

        // converting hashset into array
        int[] arr = new int[res.size()];
        int i = 0;
        for(int num : res)
        {
            arr[i++] = num;
        }
        return arr;
    }
}