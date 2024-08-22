package Recursion;

public class tile {
    public static void main(String[] args) {
        System.out.println(Tiles(4));
    }

    public static int Tiles(int n)
    {
        // base case
        if(n==0 || n==1)
        {
            return 1;
        }
        int fnm1=Tiles(n-1);// vertically
        int fnm2=Tiles(n-2);//Horizontily
        int totalways=fnm1+fnm2;
        return totalways;
    }
}
