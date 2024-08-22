package Backtracking;

public class gridway {
    public static void main(String[] args) {
        int n=3,m=3;
        // int ans=Countway(0,0,n,m);
        int ans=Countway(n,m);
        System.out.println(ans);
    }

   // public static int Countway(int i, int j, int n, int m)
    public static int Countway(int n, int m) 
    {

        // time complexity is O(2^n+m)
        
        // base case
        // if(i==n-1&&j==m-1)// condition for last cell
        // {
        //     return 1;
        // }
        // else if(i==n||j==m) // boundary cross condition
        // {
        //     return 0;
        // }

        // int Way1=Countway(i+1, j, n, m);
        // int Way2=Countway(i, j+1, n, m);
        // return Way1+Way2;

        

        // optimize solution its time complexity is O(n)
        int way1=PrintFact(n-1+m-1);
        int way2=PrintFact(n-1);
        int way3=PrintFact(m-1);
        int totalway=way1/(way2*way3);
        return totalway;
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
