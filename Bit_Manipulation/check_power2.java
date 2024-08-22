package Bit_Manipulation;

import java.util.Scanner;

public class check_power2 {

    public static void PowerOFtwo(int n)
    {
        if((n&(n-1))==0)
        {
            System.out.println("This number  is  power of  2");
        }
        else
        {
            System.out.println("This number is not power of 2");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PowerOFtwo(n);
        sc.close();
    }
}
