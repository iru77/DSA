package Greedy_Algorithm;

import java.util.Comparator;
import java.util.*;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;

        double ratio[][]=new double[value.length][2];
        //  0th col = index, 1st col= ratio
        for(int i=0;i<value.length;i++)
        {
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }

        //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity= w;
        int finalvalue=0;
        for(int i=ratio.length-1;i>=0;i--)// reverse sort
        {
            int idx=(int)ratio[i][0];
            if(capacity >= weight[idx])
            //  include full item
            {
                finalvalue += value[idx];
                capacity -= weight[idx];
            }
            else
            {
                // include fraction item
                finalvalue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("Final Value = "+finalvalue);

    }
}
