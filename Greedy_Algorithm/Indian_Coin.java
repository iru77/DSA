package Greedy_Algorithm;

import java.util.Comparator;

import java.util.*;
public class Indian_Coin {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins , Comparator.reverseOrder());
        int countCoin=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Amount = ");
        int amount=sc.nextInt();
        ArrayList <Integer>ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++)
        {
            if ((coins[i]<=amount)) {
                while (coins[i]<= amount) {
                    countCoin++;
                    ans.add(coins[i]);
                    amount -=coins[i];
                }
            }
        }

        System.out.println("Number of coins = " +countCoin);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
        sc.close();
    }
}
