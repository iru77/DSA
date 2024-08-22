package Bit_Manipulation;

import java.util.Scanner;

public class fast_expo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int n= sc.nextInt();
        System.out.println(Exponentiation(a,n));
        sc.close();
    }

    public static int Exponentiation(int a,int n)
    {
        int ans=1;
        while (n>0) {
            // check our LSB
            if((n&1) !=0)
            {
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
}
