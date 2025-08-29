class Solution {
    public int totalFruit(int[] fruits) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;

        // variable sized windows
        int i = 0, j = 0;
        while(j < fruits.length)
        {
            if(map.containsKey(fruits[j])) map.put(fruits[j], map.get(fruits[j]) + 1);
            else map.put(fruits[j], 1);

            while(map.size() > 2)
            {
                if(map.get(fruits[i]) == 1) map.remove(fruits[i]);
                else map.put(fruits[i], map.get(fruits[i]) - 1);
                i++;
            }

            int len = j - i + 1;
            maxLen = Math.max(maxLen, len);
            j++;
        }
        return maxLen;
    }
}