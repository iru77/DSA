package Recursion;

public class friendPP {
    public static void main(String[] args) {
        int n=4;
        System.out.println(pair(n));
    }

    public static int pair(int n)
    {
        // base case
        if(n==1||n==2)
        {
            return n;
        }
        int single=pair(n-1);
        int Pairs=(n-1)*pair(n-2);
        int ways=single+Pairs;
        return ways;
    }
}
