public class bubble {
    public static void main(String[] args) {
        int arr[]={5,7,9,2,4};
        BubbleSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void BubbleSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                // increasing order
                if(arr[j]>arr[j+1])  //if(arr[j]<arr[j+1])  decreasing order
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
