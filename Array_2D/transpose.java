package Array_2D;
public class transpose {
    public static void main(String[] args) {
        int row=2,col=3;
        int matrix[][]={{2,3,4},{5,6,7}};
        // original matrix
        printMatrix(matrix);

        // transpose
        int trans[][]=new int[col][row]; // transpose kar se pehla row and col ka size pta kar na us ke baad hp ga 
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                trans[j][i] = matrix[i][j];
            }
        }

        printMatrix(trans);
    }

    public static void printMatrix(int matrix[][])
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
