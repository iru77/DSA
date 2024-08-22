package Recursion;

public class sort {
    public static void main(String[] args) {
        int arr[]={3,4,5,2};
        int i=0;
        System.out.println(IsSorted(arr,i));
    }

    public static boolean IsSorted(int arr[],int i)
    {
        // base case
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return IsSorted(arr, i+1);
    }
}
