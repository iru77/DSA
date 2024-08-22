package Recursion;

public class binaryStr {
    public static void main(String[] args) {
        BinaryString(3,0,"");
    }

    public static void BinaryString(int n, int lastplace, String Str)
    {
        // basecase
        if(n==0)
        {
            System.out.println(Str);
            return;
        }
        // kaam
        BinaryString(n-1, 0, Str+"0");
        if(lastplace==0)
        {
            BinaryString(n-1,1, Str+"1");
            
        }
        
    }
}
