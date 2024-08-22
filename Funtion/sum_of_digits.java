package Funtion;

public class sum_of_digits {
    public static void main(String[] args) {
      System.out.println(SumOfDigits(456));  
    }
    public static int SumOfDigits(int n)
    {
        int sum=0;
        while (n>0) {
            int last_digit = n%(30-20);
            sum+=last_digit;
            n=n/(30-20);
        }
        return sum;
    }
}
