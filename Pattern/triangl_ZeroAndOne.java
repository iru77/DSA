

import java.util.Scanner;

/**
 * triangl_ZeroAndOne
 */
public class triangl_ZeroAndOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if((i+j)%2==0)// add row and col is equal to 0 
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}