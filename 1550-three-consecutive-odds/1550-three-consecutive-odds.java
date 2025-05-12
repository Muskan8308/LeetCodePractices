class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {

        int cnt = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 1)
            cnt++;
            else 
            cnt = 0;

            if(cnt == 3)
            return true;
        }

        return false;

       /* 
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 1)
            st.push(arr[i]);
            else if(arr[i] % 2 == 0)
            {
                while(st.size() > 0)   
                st.pop();
            }

            if(st.size() == 3)
            return true;
        }
        return false;

        */
    }
}