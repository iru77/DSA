package Array;

import java.util.Scanner;

/**
 * infosys1
 */
public class infosys1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array Size :- ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        System.out.print("Reverse no. is :- ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }

    public static void reverse(int arr[])
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