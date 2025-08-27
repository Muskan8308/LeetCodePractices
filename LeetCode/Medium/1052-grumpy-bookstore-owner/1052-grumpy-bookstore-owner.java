class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int n = customers.length, i = 0, j = minutes-1, unsatisfied = 0;
        int maxUnSatisfy = 0, a = i, b = j;

        // first sliding window
        for(int x = i; x <= j; x++)
        {
            if(grumpy[x] == 1) unsatisfied += customers[x];
        }

        while(j < n)
        {
            if(maxUnSatisfy < unsatisfied)
            {
                maxUnSatisfy = unsatisfied;
                a = i;
                b = j; 
            }

            i++; j++;
            if(j < n && grumpy[j] == 1) unsatisfied += customers[j];
            if(grumpy[i-1] == 1) unsatisfied -= customers[i-1];
        }

        for(int x = a; x <= b; x++)
        {
            grumpy[x] = 0;
        }

        int satisfied = 0;
        for(int x = 0; x < n; x++)
        {
            if(grumpy[x] == 0) satisfied += customers[x];
        } 

        return satisfied;
    }
}