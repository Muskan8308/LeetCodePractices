class Solution {
    public void setZeroes(int[][] matrix) {
        
        Set<Integer> rowZeros = new HashSet<>();
        Set<Integer> colZeros = new HashSet<>();
//   Identify rows and columns that need to be zeroed
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
               if(matrix[i][j] == 0)
               {
                    rowZeros.add(i);
                    colZeros.add(j);
               }
            }
        }

//  Set the identified rows to zero
        for(int row : rowZeros)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                matrix[row][j] = 0;
            }
        }

//  Set the identified columns to zero
        for(int col : colZeros)
        {
            for(int i = 0; i < matrix.length; i++)
            {
                matrix[i][col] = 0;
            }
        }
    }
}