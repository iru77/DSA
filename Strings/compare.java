package Strings;

class compare {
    // value compare its means IRFAN is to IRFAN
    public static void main(String[] args) {
        String str="Irfan";
        String str2="Irfan";
        String str3=new String("Irfan");
        if(str == str2)
        {
            System.out.println("String is equal");
        }
        // when new string used and compare then use equals function
        if(str.equals(str3))
        {
            System.out.println("String is equal");
        }
    }
}