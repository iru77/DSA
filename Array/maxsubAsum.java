package Array;
import java.util.Scanner;
// Brute Force
public class maxsubAsum {
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
        subarray(arr);
        sc.close();
    }
    public static void subarray(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int currsum=0;
                for(int k=i;k<=j;k++)
                {
                    currsum+=arr[k];
                }
                System.out.println("Sum of Subarray is:- "+currsum);
                if(max<currsum)
                {
                    max=currsum;
                }
            }
        }
        System.out.println("Maximum subarray is :- "+max);
    }
}
