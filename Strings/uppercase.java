package Strings;

public class uppercase {
    public static void main(String[] args) {
        // first charactor change uppercase 
        // ex hi, i am irfan o/p:- Hi, I Am Irfan 
        String Str ="hi, i am irfan";
        System.out.println(Change(Str));

    }
    public static String Change(String str)
    {
        StringBuilder sb = new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' '&&i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }
}
