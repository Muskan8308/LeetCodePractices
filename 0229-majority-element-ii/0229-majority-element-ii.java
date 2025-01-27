class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Boyer Moore Voting Algorithm

        int n = nums.length;
        int cand1 = 0, cand2 = 0, cnt1 = 0, cnt2 = 0;

        // Step 1 : find the potential candidates

        for(int num : nums)
        {
            if(num == cand1)
            cnt1++;
            else if(num == cand2)
            cnt2++;
            else if(cnt1 == 0)
            {
                cand1 = num;
                cnt1 = 1;
            }
            else if(cnt2 == 0)
            {
                cand2 = num;
                cnt2 = 1;
            }
            else
            {
                cnt1--;
                cnt2--;
            }
        }

        // Step 2 : verify the candidates

        cnt1 = 0;
        cnt2 = 0;
        for(int num : nums)
        {
            if(num == cand1) cnt1++;
            else if(num == cand2) cnt2++;
        }

        // Step 3 : add valid candidates to the list
        List <Integer> list  = new ArrayList<>();
        if(cnt1 > n/3) list.add(cand1);
        if(cnt2 > n/3) list.add(cand2);

        return list;
    }
}