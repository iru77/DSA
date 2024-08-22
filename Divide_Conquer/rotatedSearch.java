package Divide_Conquer;

public class rotatedSearch {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=7;
        int tarId=Searching(arr,target,0,arr.length-1);
        System.out.println(tarId);
    }

    public static int Searching(int arr[],int tar,int si,int ei)
    {
        // base case
        if(si>ei)
        {
            return -1;
        }

        int mid=si+(ei-si)/2;

        if(arr[mid]==tar)
        {
            return mid;
        }

        // L1 searching
        if(arr[si]<=arr[mid])
        {
            // left part searching
            if(arr[si]<=tar&&tar<=arr[mid])
            {
                return Searching(arr, tar, si, mid-1);
            }
            // right part searching
            else{
                return Searching(arr, tar, mid+1, ei);
            }
        }
        
        // L2 
        else{
            // left part seaching
            if(arr[mid]<=tar&&tar<=arr[ei])
            {
                return Searching(arr, tar, mid+1, ei);
            }
            else
            {
                return Searching(arr, tar, si, mid-1);
            }
        }
    }
}
