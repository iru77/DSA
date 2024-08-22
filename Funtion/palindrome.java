package Funtion;

public class palindrome{ 
    public static void main(String[] args) {
        isPalindrome(67676);
    }
    public static void isPalindrome(int n)
    {
        int reverse= rev(n);
        if(n==reverse)
        {
            System.out.println("yes it is palinodrome");
        }
        else{
            System.out.println("No it is not palinodrome");
        }

    }
    public static int rev(int n)
    {
        int rev=0;
        while (n>0) {
            int last_digit=n%10;
            rev=(rev*10)+last_digit;
            n=n/10;
        }
        return rev;
    }
}