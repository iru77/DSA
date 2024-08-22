package Bit_Manipulation;

import java.util.Scanner;
public class operation {

    // clear Range of Bits
    public static int ClearRangeBit(int n,int i, int j)
    {
        int a=~0<<j+1;
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }

    // clear last bit
    public static int clearlastbit(int n, int i)
    {
        int bitmask = ~0<<i;  // -1<<i
        return n&bitmask;
    }

    // update ith bit
    public static int updateIthbit(int n,int i,int newbit)
    {
        // if(newbit==0)
        // {
        //     return clearIthbit(n, i);
        // }
        // else{
        //     return setIthbit(n, i);
        // }
        
        n=clearIthbit(n, i);
        int Bitmask=newbit<<i;
        return n|Bitmask;
    }

    // clear ith bit
    public static int clearIthbit(int n, int i)
    {
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    // set ith bit
    public static int setIthbit(int n,int i)
    {
        int bitmask=1<<i;
        return (n|bitmask);
    }
    

    //Get ith Bits
    public static int getIthBit(int n,int i)
    {
        int bitmask = 1<<i;

        if((n & bitmask)==0)
        {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int j=sc.nextInt();
        System.out.println(ClearRangeBit(n, i, j));
        sc.close();
    }
}
