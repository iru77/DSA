public class selection {
    public static void main(String[] args) {
        int arr[]={2,9,5,7,3,4};
        Sorting(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void Sorting(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int curr=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[curr]>arr[j])// increasing order
                {
                    curr=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[curr];
            arr[curr]=temp;
        }
    }
}
