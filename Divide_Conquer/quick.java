package Divide_Conquer;


public class quick {
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
        quicksort(arr,0, arr.length-1);
        printa(arr);
    }

    public static void quicksort(int arr[],int si,int ei)
    {
        // base case
        if(si>=ei)
        {
            return;
        }
        int Pvt=partition(arr,si,ei);
        quicksort(arr, si, Pvt-1);// left part 
        quicksort(arr, Pvt+1, ei); // right part
        
    }

    public static int partition(int arr[],int si, int ei)
    {
        // last element
        int pivot=arr[ei];
        int i=si-1; // to make place for element smaller than pivot
        for(int j=si;j<arr.length;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                // swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot; // swap the pviot right position shift 
        arr[ei]=arr[i];
        arr[i]=temp;

        return i;
    }
}
