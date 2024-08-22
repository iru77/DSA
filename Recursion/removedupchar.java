package Recursion;

public class removedupchar {
    public static void main(String[] args) {
        String str="appnacollege";
        duplicate(str,0,new StringBuilder(),new boolean [26]);
    }

    public static void duplicate(String str, int idx, StringBuilder newStr, boolean map[])
    {
        // base case
        if(idx==str.length())
        {
            System.out.println(newStr);
            return;
        }

        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true)
        {
            duplicate(str, idx+1, newStr, map);
        }
        else
        {
            map[currchar-'a']=true;
            duplicate(str, idx+1, newStr.append(currchar), map);
        }
    }
}
