package Funtion;

public class binomial_coeff {
    public static void main(String[] args) {
       System.out.println(binomial(5, 2)); 
    }
    public static int binomial(int n, int r)
    {
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);
        int binCoeff=fact_n/(fact_r*fact_nmr);
        return  binCoeff;
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
