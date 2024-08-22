package Recursion;


public class lastOcc {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,5};
        System.out.println(LastOcc(arr,5,0));
    }

    public static int LastOcc(int arr[],int key,int index)
    {
        // base case
        if(index==arr.length)
        {
            return -1;
        }

        int IsFound=LastOcc(arr, key, index+1);
        if(IsFound ==-1 && arr[index]==key)
        {
            return index;
        }

        return IsFound;
    }

}
