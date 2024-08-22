package Recursion;

public class fib {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fibno(n));
    }

    public static int fibno(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        int f1=fibno(n-1);
        int f2=fibno(n-2);
        int fn=f1+f2;
        return fn;
    }
}
