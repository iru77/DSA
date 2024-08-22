package Recursion;

public class P2 {
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        index(arr,2,0);
    }

    public static void index(int arr[],int key,int idx)
    {
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]==key)
        //     {
        //        System.out.println(i); 
        //     }
        // }
        // return;

        if(idx==arr.length)
        {
            return;
        }
        if(arr[idx]==key)
        {
            System.out.println(idx);
        }
        index(arr, key, idx+1);    
    }
}
