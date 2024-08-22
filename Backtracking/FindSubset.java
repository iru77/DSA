package Backtracking;

public class FindSubset {
    public static void main(String[] args) {
        String str="abc";
        FindS(str,0,"");

    }

    public static void FindS(String str, int index, String ans)
    {
        // base case
        if(index==str.length())
        {
            if(ans.length()==0)
            {
                System.out.println("null");
            }
            else
            {
                System.out.println(ans);
            }
            return;
        }

        //choices yes
        FindS(str, index+1, ans+str.charAt(index));
        // choice No
        FindS(str, index+1, ans);
    }
}
