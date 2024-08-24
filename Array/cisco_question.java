package Array;
import java.util.Scanner;

public class cisco_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size:- ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array element :- ");
        for(int i=0;i<arr.length;i++) // input 
        {
            arr[i]=sc.nextInt();
        }
        MaxMin(arr);
        sc.close();

    }
    public static void MaxMin(int arr[])
    {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
    }
}
