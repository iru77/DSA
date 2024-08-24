package Array;
import java.util.Scanner;

/**
 * amazon1
 */
public class amazon1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size=sc.nextInt();
        System.out.println("Enter the element in an array");
        int arr []= new int[size];
        for(int i=0; i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(duplicate(arr));
        sc.close();
    }
    public static boolean duplicate(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
}