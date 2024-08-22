package Strings;

public class str_substr {
    public static void main(String[] args) {
        String str="IRFAN";
        System.out.println(str.substring(2,5));
        System.out.println(SubStr(str,0,3));
    }
    
    public static String SubStr(String str, int StartIND,int EndInd)
    {
        String str2="";
        for(int i=StartIND;i<EndInd;i++)
        {
            str2 +=str.charAt(i);
        }
        return str2;
    }
}
