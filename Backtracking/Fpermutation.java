package Backtracking;

public class Fpermutation {
    public static void main(String[] args) {
        String Str="abc";
        Permutation(Str,"");
    }

    public static void Permutation(String str, String ans)
    {
        // base case
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }

        // recurive

        // choices
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            // remove the string example
            // abcde c remove -> ab+de=abde
            String Newstr=str.substring(0, i)+str.substring(i+1);
            Permutation(Newstr, ans+curr);
        }
    }
}
