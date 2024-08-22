package Array;
import java.util.Scanner;

public class reverse {
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
        Swapping(arr);
        System.out.println("Reverse no. is :- ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
    public static void Swapping(int arr[])
    {
        int first=0;
        int last=arr.length-1;
        while(first<last)
        {
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }

    }
}
