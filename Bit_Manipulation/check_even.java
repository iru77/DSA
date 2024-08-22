package Bit_Manipulation;

import java.util.Scanner;

class check_even {
    public static void evenodd(int n)
    {
        int bitmask=1;
        if((n&bitmask)==0)
        {
            System.out.print("It is Even number");
        }
        else
        {
            System.out.print("It is Odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        evenodd(n);
        sc.close();
    }    
}