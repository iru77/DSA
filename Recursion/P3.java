package Recursion;
// inut 2345 output two three four five
public class P3 {
    public static void main(String[] args) {
        Printcovet(2345);
    }

    
    static String digit[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void Printcovet(int n)
    {
        // basecase
        if(n==0)
        {
            return;
        }
        
        int lastdigit=n%10;
        Printcovet(n/10);
        System.out.print(digit[lastdigit]+" ");
    }
}
