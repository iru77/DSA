package Divide_Conquer;

public class mergeSort {

    public static void printa(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        merge(arr,0, arr.length-1);
        printa(arr);
    }

    public static void merge(int arr[],int si, int ei)
    {
        // base case
        if(si>=ei)
        {
            return;
        }
        // kaam
        int mid=si+(ei-si)/2;
        merge(arr, si, mid); // left part divide
        merge(arr, mid+1, ei); // right part divide
        MergeSort(arr,si,mid,ei);
    }

    public static void MergeSort(int arr[],int si,int mid, int ei)
    {
        int temp[]=new int[ei-si+1];// copy the array 
        int i=si;// iteration of left part;
        int j=mid+1; // iteration of right part;
        int k=0; // iteration of temp part;

        while (i<=mid && j<=ei) {

            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        // some left part not sort
        while (i<=mid) {
            temp[k++]=arr[i++];
        }

        // some right part not sort
        while(j<=ei)
        {
            temp[k++]=arr[j++];
        }

        // copy temp to original array
        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
    }
}
