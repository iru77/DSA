

import java.util.Scanner;

/**
 * solid_rhombus
 */
public class solid_rhombus {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++)// outer loop
       {
            // inner loop
            for(int j=1;j<=n-i+1;j++)// space print
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++)//star
            {
                System.out.print("* ");
            }
            System.out.println();
       }
       sc.close();
    }
}