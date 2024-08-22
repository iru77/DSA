package Array;
import java.util.*;

public class rainwater_trap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int height[]=new int[size];
        for(int i=0;i<height.length;i++)
        {
            height[i]=sc.nextInt();
        }
        System.out.println(trapping(height));
        sc.close();
    }

    public static int trapping(int height[])
    {
        int left[]=new int[height.length];
        left[0] = height[0];
        for(int i=1;i<height.length;i++)
        {
            left[i]=Math.max(height[i],left[i-1]);
        }

        int right[]=new int[height.length];
        right[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            right[i]=Math.max(height[i],right[i+1]);
        }

        int trap_water=0;
        for(int i=0;i<height.length;i++)
        {
            int water=Math.min(left[i],right[i]);
            trap_water+=water-height[i];
        }
        return trap_water;
    }
}
