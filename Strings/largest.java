package Strings;

public class largest {
    public static void main(String[] args) {
        String fruit[]={"apple","mango","banana"};
        System.out.println(LarString(fruit));
    }

    public static String LarString(String str[])
    {
        String Largest=str[0];
        for(int i=1; i<str.length;i++)
        {
            if(Largest.compareTo(str[i])<0)// all charactor same ex a,a 
            // if(Largest.compareToIgnoreCase(str[i])<0) all charactor not same ex a,A
            {
                Largest=str[i];
                
            }
        }
        return Largest;
    }
}
