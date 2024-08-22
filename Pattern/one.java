
public class one{
    public static void main(String[] args) {
        int num1=5;
        int mid=num1/2+1;
        //int num2=6;
        for (int i=1;i<=num1;i++)
        {
            for(int j=1;j<=num1;j++)
            {    
                if(j==mid || i+j==mid && j<=mid )
                {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            if(i==num1)
            {
                for(int j=0;j<num1;j++)
                {
                    System.out.print(" * ");
                }
            }
           
        }
    }
}