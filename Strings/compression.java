package Strings;

public class compression {
    public static void main(String[] args) {
        String str ="aaaaabbccd";
        System.out.println(comp(str));
    }

    public static String comp(String str)
    {
        StringBuilder sb=new StringBuilder();
        // String str2="";
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while (i<str.length()-1&&str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));// str2+=str.char(i);
            if(count >1)
            {
                sb.append(count);// str2+=count.toString();
            }
        }
        return sb.toString();// str2;,
    }
}
