// //Rotate Image

// Rotate the given n x n 2D matrix in-place by 90 degrees clockwise. For example, if the input matrix is [[1,2,3],[4,5,6],[7,8,9]], the output should be [[7,4,1],[8,5,2],[9,6,3]].

class Solution
 {
    public void rotate(int[][] matrix) 
    {
        int r=matrix.length;
        int c=matrix[0].length;
        int a[][]=new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=c-1;j>=0;j--)
            {
                a[i][c-j-1]=matrix[j][i];
                System.out.print(a[i][c-j-1]);
            }
            
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=a[i][j];
            }
        }

    }
}