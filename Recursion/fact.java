package Recursion;

public class fact {
    public static void main(String[] args) {
        int n=4;
        System.out.println(PrintFact(n));
    }

    public static int PrintFact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int factno=PrintFact(n-1);
        int Fact =n*factno;
        return Fact;
    }
}
