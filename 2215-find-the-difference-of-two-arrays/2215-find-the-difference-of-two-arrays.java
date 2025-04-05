class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Fill the sets
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        // Create new sets for result to avoid modifying original ones
        HashSet<Integer> onlyIn1 = new HashSet<>(set1);
        HashSet<Integer> onlyIn2 = new HashSet<>(set2);

        // Remove common elements
        onlyIn1.removeAll(set2);
        onlyIn2.removeAll(set1);

        // Convert to list and return
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(onlyIn1)); // elements only in nums1
        ans.add(new ArrayList<>(onlyIn2)); // elements only in nums2

        return ans;
   
    }
}