package Recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(Pow(2,5));
    }

    // its time complexity is O(n)
    public static int Pow(int a,int n)
    {
        //base case
        if(n==0)
        {
            return 1;
        }
        return a*Pow(a,n-1);
                   // int Pnm1=Pow(a, n-1);
                    // int Pn=a*Pnm1;
                    // return Pn;
    }

    // Optimize Its time ccomplexity is O(logn)

    public static int Powe(int a,int n)
    {
        if(n==0)
        {
            return 1;
        }

        int half=Powe(a, n/2);
        int halfsq=half*half;
        if(n%2!=0)
        {
            halfsq=a*halfsq;
        }
        return halfsq;

    }
}
