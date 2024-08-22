package Recursion;

public class firstOcc {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,5};
        System.out.println(Foccur(arr,5,0));
    }

    public static int Foccur(int arr[],int key,int index)
    {
        //Base case
        if(index==arr.length)
        {
            return -1;
        }

        if(arr[index]==key)
        {
            return index;
        }
        return Foccur(arr, key, index+1);
    }
}
