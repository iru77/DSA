package Array;
import java.util.Scanner;

public class binary {
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
        System.out.print("Enter the key searching :- ");
        int key=sc.nextInt();
        System.out.println("Index for key is:- "+Searching(arr, key));
        sc.close();
    }
    public static int Searching(int arr[],int key)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]<key)
            {
                start=mid+1;
            }
            else{
                end =mid-1;
            }
        }
        return -1;
    }
}
