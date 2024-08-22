package Array;
import java.util.Scanner;

/**
 * largest
 */
public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array size:- ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Element :- ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("largest number:- "+greatest(arr));
        sc.close();
    }
    public static int greatest(int arr[])
    {
        int max=Integer.MIN_VALUE;// -infinity
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
}