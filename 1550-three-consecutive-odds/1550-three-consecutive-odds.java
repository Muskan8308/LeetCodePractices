class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 1)
            st.push(arr[i]);
            else if(st.size() > 0 && arr[i] % 2 == 0)
            st.pop();

            if(st.size() == 3)
            return true;
        }
        return false;
    }
}