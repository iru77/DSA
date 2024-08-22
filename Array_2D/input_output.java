package Array_2D;
import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row size:- ");
        int n=sc.nextInt();
        System.out.print("Enter the col size :- ");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        // input
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        // output
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
