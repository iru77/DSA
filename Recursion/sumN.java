package Recursion;


public class sumN {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }

    public static int sum(int n)
    {
        if(n==1)
        {
            return n;
        }
        int Sn1=sum(n-1);
        int Sn=n+Sn1;
        return Sn;
    }
}
