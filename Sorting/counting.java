public class counting {
    public static void main(String[] args) {
        int arr[]={2,3,3,4,5,6,7,5,9,6,4};
        Sorting(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void Sorting(int arr[])
    {
        int size=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            size=Math.max(size,arr[i]);
        }

        // counting or frequency
        int freq[]=new int[size+1];
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<freq.length;i++)
        {
            while (freq[i]>0) {
                arr[j]=i;
                j++;
                freq[i]--;
            }
        }
    }
}
