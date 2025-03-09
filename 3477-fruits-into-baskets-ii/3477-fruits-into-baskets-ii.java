class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {

        int n = baskets.length;
        int unPlaced = 0;
        boolean[] usedPlaced = new boolean[n];

        for(int i = 0; i < n; i++)
        {
            boolean placed = false;
            for(int j = 0; j < n; j++)
            {
                if(!usedPlaced[j] && baskets[j] >= fruits[i])
                {
                    usedPlaced[j] = true; 
                    placed = true;
                    break;
                }
            }
            if(!placed)
            unPlaced++;
        }
        return unPlaced;
    }
}