package Array_2D;
import java.util.Scanner;
public class daigonal {
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
        int ans=DaigonalSum(matrix);
        System.out.println(ans);
        sc.close();
    }
    
    public static int DaigonalSum(int matrix[][])
    {
        // brute Force 
        int sum=0; 
        // for(int i=0;i<matrix.length;i++)
        // {
        //     for(int j=0;j<matrix[0].length;j++)
        //     {
        //         if(i==j)
        //         {
        //             sum+=matrix[i][j];
        //         }
        //         else if(i+j==matrix.length-1)
        //         {
        //             sum+=matrix[i][j];
        //         }
        //     }
        // } 

        // optimaze
        for(int i=0;i<matrix.length;i++)
        {
            // primary
            sum+=matrix[i][i];

            //secondary
            if(i != matrix.length-i-1)
                sum+=matrix[i][matrix.length-1-i];

        }
        return sum;
    }
}
