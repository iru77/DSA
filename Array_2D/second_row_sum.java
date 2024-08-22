package Array_2D;
public class second_row_sum {
    public static void main(String[] args) {
        int nums[][]={{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;

        // for(int i=1;i<=1;i++) brute force approch
        // {
        //     for(int j=0;j<nums[0].length;j++)
        //     {
        //         sum+=nums[i][j];
        //     }
        // }
        

        // optimize
        int i=1;
        for(int j=0;j<nums[0].length;j++)
        {
            sum+=nums[i][j];
        }
        System.out.println(sum);
    }
}
