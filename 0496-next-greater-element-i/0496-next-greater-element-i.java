class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i = nums2.length - 1; i >= 0; i--)
        {
            while(st.size() > 0 && st.peek() <= nums2[i])
            st.pop();

            if(st.size() == 0)
            map.put(nums2[i] , -1);
            else
            map.put(nums2[i], st.peek());

            st.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];
        for(int i = 0; i < ans.length; i++)
        ans[i] = map.getOrDefault(nums1[i], -1);

        return ans;
    }
}