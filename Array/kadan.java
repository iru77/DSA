package Array;
import java.util.Scanner;
// kadan's Algorthim is less time prefix algorthim
// big negative number is update to zero
public class kadan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array size :- ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array element :- ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Kandan_Alg(arr);
        sc.close();
    }

    public static void Kandan_Alg(int arr[])
    {
        int currsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            currsum=currsum+arr[i];
            if(currsum<0)
            {
                currsum=0;
            }
            // if(max<currsum)
            // {
            //     max=currsum;
            // }
            max=Math.max(currsum, max);
        }
        System.out.println(currsum);
        System.out.println(max);
    }
}
