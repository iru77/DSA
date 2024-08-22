package Array_2D;
import java.util.Scanner;
public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Matrix Size :- ");
        int n=sc.nextInt();
        int matrix[][]= new int[n][n];
        // input
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        Spiral_Matrix(matrix);
        sc.close();
    }

    public static void Spiral_Matrix(int matrix[][])
    {
        int Srow=0;
        int Scol=0;
        int Erow=matrix.length-1;
        int Ecol=matrix[0].length-1;

        while (Srow<=Erow && Scol<=Ecol) {
            //Top
            for(int j=Scol;j<=Ecol;j++)
            {
                System.out.print(matrix[Srow][j]+" ");
            }
            
            // right
            for(int i=Srow+1;i<=Erow;i++)
            {
                System.out.print(matrix[i][Ecol]+" ");
            }

            //bottom
            for(int j=Ecol-1;j>=Scol;j--)
            {
                System.out.print(matrix[Erow][j]+" ");
            }

            //left
            for(int i=Erow-1;i>=Srow+1;i--)
            {
                System.out.print(matrix[i][Scol]+" ");
            }
            Srow++;
            Scol++;
            Erow--;
            Ecol--;
        }
    }
}
