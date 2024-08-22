package Strings;
import java.util.Scanner;

public class palindrome_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str=sc.next();
        System.out.println(Ispalindrome(str));
        sc.close();
    }

    public static boolean Ispalindrome(String str)
    {
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i) != str.charAt(str.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
}
