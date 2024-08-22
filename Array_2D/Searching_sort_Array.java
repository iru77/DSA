package Array_2D;
import java.util.Scanner;

public class Searching_sort_Array {
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
        System.out.print("Enter the search key:- ");
        int key=sc.nextInt();
        searhing(matrix,key);
        sc.close();
    }

    public static boolean searhing(int matrix[][], int key)
    {
        // // brute force
        // for(int i=0;i<matrix.length;i++)
        // {
        //     for(int j=0;j<matrix[0].length;j++)
        //     {
        //         if(key==matrix[i][j])
        //         {
        //             System.out.println("key is found :- "+"( "+i+","+j+" )");
        //             return true;
        //         }
        //     }
        // }
        // System.out.println("Not found");

        //optimise row and col sorted
        int row=0;
        int col=matrix.length-1;    
        while(row < matrix.length && col >= 0)
        {
            if(key==matrix[row][col])
            {
                System.out.println("key is found :- "+"( "+row+","+col+" )");
                return true;
            }
            
            else if(key<matrix[row][col])
            {
                col--;
            }

            else
            {
                row++;
            }
        }
        System.out.println("Not found");
        return false;
    }

    
}
