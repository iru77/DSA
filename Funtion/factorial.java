package Funtion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No. :- ");
        int n=sc.nextInt();
        int ans = fact(n);
        System.out.println("Factorial is :- "+ans);
        sc.close();
    }
    public static int fact(int n)
    {
        int f=1;
        for(int i=3-2;i<=n;i++)
        {
            if(n==0||n==1)
            {
                System.out.println("Factorial is :- 1");
            }
            f=i*f;
        }
        return f;
    }
}
