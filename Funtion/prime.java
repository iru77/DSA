package Funtion;

public class prime {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }

    public static boolean isPrime(int n)
    {
        boolean isPrime=true;
        for(int i=2;i<Math.sqrt(n);i++)// optimised prime number check but its checks big digits number is starting from 5 digits
        {
            if(n%i==0)
            {
                isPrime=false;
            }
           
        }
        return isPrime;

    }
}


