package Strings;

import java.util.*;

public class shortpath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str=sc.next();
        System.out.println(getshortedpath(str));
        sc.close();
    }

    public static float getshortedpath(String str)
    {
        int x=0,y=0;
        for(int i=0;i<str.length();i++)
        {
            char dir= str.charAt(i);
            // north
            if(dir=='N')
            {
                y++;
            }
            //south
            else if(dir=='S')
            {
                y--;
            }
            //East
            else if(dir=='E')
            {
                x++;
            }
            // west
            else
            {
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
}
