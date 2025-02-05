class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        
        int[] ans = new int[2];

        int ans1 = findValue(nums1, nums2);
        int ans2 = findValue(nums2, nums1);

        ans[0] = ans1;
        ans[1] = ans2;
        return ans;
    }

    private int findValue(int[] arr1, int[] arr2)
    {
        int res = 0;

        for(int i = 0; i < arr1.length; i++)
        {
            for(int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    res++;
                    break;
                }
            }
        }

        return res;
    }
}