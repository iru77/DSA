package Greedy_Algorithm;
import java.util.*;
public class Max_l_Chain_of_Pairs {
   public static void main(String[] args) {
        int pair[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pair,Comparator.comparingDouble(o -> o[1]));

        int ChainLength=1;// answer
        int ChainEnd = pair[0][1];// Last selected pair

        for(int i=1;i<pair.length;i++)
        {
            if(pair[i][0]>ChainEnd)
            {
                ChainLength++;
                ChainEnd=pair[i][1];
            }
        }

        System.out.println("Max Length of Chain = "+ChainLength);
   } 
}
