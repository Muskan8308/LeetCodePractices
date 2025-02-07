class Solution {
    public void sortColors(int[] nums) {

        int zeroCnt = 0, oneCnt = 0, twoCnt = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
                zeroCnt++ ;
            else if(nums[i] == 1)
                oneCnt++;
            else
                twoCnt++;    
        } 

        int arrayIdx = 0;
        for(int i = 0; i < zeroCnt; i++)
        {
            nums[arrayIdx] = 0;
            arrayIdx++;
        }
        
         for(int i = 0; i < oneCnt; i++)
        {
            nums[arrayIdx] = 1;
            arrayIdx++;
        }
         for(int i = 0; i < twoCnt; i++)
        {
            nums[arrayIdx] = 2;
            arrayIdx++;
        }
        
    }
}