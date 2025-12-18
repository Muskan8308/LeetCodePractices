class Solution {

    // Best Approach - Bit Mask  TC - O(n)  SC - O(1)
    public int singleNumber(int[] nums) {

        int ans = 0;

        for(int ele : nums)
        {
            ans = ans ^ ele;
            System.out.print(ans+" ");
        }

        return ans;
    }

    // Using HashMap  TC - O(n)  SC - O(n)
    // public int singleNumber(int[] nums) {

    //     Map<Integer, Integer> map = new HashMap<>();

    //     for(int i = 0; i < nums.length; i++)
    //     {
    //         if(map.containsKey(nums[i]))
    //         map.put(nums[i], 2);            // Since, each element can have atmost 2 as frequency 
    //         else
    //         map.put(nums[i], 1);
    //     }

    //     for(int key : map.keySet())
    //     {
    //         if(map.get(key) == 1) return key;
    //     }
    //     return 1;
    // }

    // Sorting Approach  TC - O(nlogn)  SC - O(logn)
    // public int singleNumber(int[] nums) {

    //     Arrays.sort(nums);

    //     for(int i = 0; i < nums.length-1; i += 2)
    //     {
    //         if(nums[i] != nums[i+1])
    //         return nums[i];
    //     }
    //     return nums[nums.length-1];
    // }

    // Brute Force approach  TC - O(n^2)  SC - O(1)
    // public int singleNumber(int[] nums) {

    //     int n = nums.length;
    //     for(int i = 0; i < n; i++)
    //     {
    //         boolean flag = false;
    //         for(int j = 0; j < n; j++)
    //         {
    //             if(i == j) continue;
    //             if(nums[i] == nums[j]) flag = true;
    //         }
    //         if(!flag) return nums[i];
    //     }
    //     return 0;
    // }
}