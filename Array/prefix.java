package Array;
import java.util.Scanner;
// prefix algorithm is less time brute force
public class prefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array size :- ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array element :- ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        maxsubarray(arr);
        sc.close();
    }
    public static void maxsubarray(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int prifix[]=new int[arr.length];
        prifix[0]=arr[0];
        for(int i=1;i<prifix.length;i++)
        {
            prifix[i]=prifix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            int currsum=0;
            for(int j=i;j<arr.length;j++)
            {
                if(i==0)
                {
                    currsum=prifix[j];
                }
                else{
                    currsum=prifix[j]-prifix[i-1];
                }
            }
            System.out.println(currsum);
            if(max<currsum)
            {
                max=currsum;
            }
        }
        System.out.println("max sum of subarray is;- "+max);
    }
}
