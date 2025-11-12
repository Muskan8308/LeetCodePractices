class Solution {
    public int findMinArrowShots(int[][] points) {
        
        // For large input constraints, we can't just simply do a[1] - b[1] bcoz it will give a very small negative number like -1324354657
        // therefore, we will use the traditional comparator for sorting.
        // If(true) return 1 i.e no swap, else return -1 i.e swap needed

        Arrays.sort(points, (a,b) -> (a[1] <= b[1]) ? -1 : 1);  

        int arrows = 1;     // Atleast 1 arrow is needed to brust a balloon 
        int lastEnd = points[0][1];

        for(int[] point : points)
        {
            if(point[0] > lastEnd)
            {
                arrows++;
                lastEnd = point[1];
            }
        }
        return arrows;
    }
}