package Array;
import java.util.Scanner;

public class linear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size:- ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements :- ");
        // input
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the key Search :- ");
        int key=sc.nextInt();
        int ans=search(arr,key);
        System.out.println("key index is :- "+ans);
        sc.close();
    }
    public static int search(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1; 
    }
}