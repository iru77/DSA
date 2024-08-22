package Bit_Manipulation;

import java.util.Scanner;

public class count_sets_bit {

    public static int CountSet(int n)
    {
        int  Count=0;
        while (n>0) {
            // check our LSB
            if((n&(1<<0)) == 1) // ((n&1) !=0)
            {
                Count++;
            }
            n=n>>1;
        }
        return Count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(CountSet(n));
        sc.close();
    }
}
