public class insertion {
    public static void main(String[] args) {
        int arr[]={2,4,8,9,6};
        Sorting(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sorting(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while (prev>=0 && arr[prev]>curr)// increasing order
             { // find the current position  
                arr[prev+1]=arr[prev];
                prev--;
            }

            arr[prev+1]=curr;
        }
    }
}
