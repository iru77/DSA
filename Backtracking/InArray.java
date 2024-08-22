package Backtracking;

/**
 * InArray
 */
public class InArray {

    public static void prinf(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void ChangeArr(int arr[],int i, int val)
    {
        // base case
        if(i==arr.length)
        {
            prinf(arr);
            return;
        }

        // recursive
        arr[i]=val;
        ChangeArr(arr, i+1, val+1); // recursive call
        arr[i]=arr[i]-2;// after complete recursive call than backtracking use
        
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        ChangeArr(arr,0,1);
        prinf(arr);
    }
}