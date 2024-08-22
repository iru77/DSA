package Greedy_Algorithm;
import java.util.*;

public class Chocola_Problem {
    public static void main(String[] args) {
        int n=4,m=6;
        Integer costV[]={2,1,3,4,1}; // m-1
        Integer costH[]={1,2,4}; // n-1

        Arrays.sort(costV,Comparator.reverseOrder()); // decrease order sort
        Arrays.sort(costH,Comparator.reverseOrder());


        int h=0,v=0;
        int Hp=1,Vp=1;
        int cost=0;
        while (h<costH.length && v < costV.length) {
            if(costH[h]<=costV[v]) // Horizontal Cut
            {
                cost += (costV[v]*Hp);
                Vp++;
                v++;
            }else // Vertical Cuts
            {
                cost += (costH[h] * Vp);
                Hp++;
                h++;
            }
        }
        while (h<costH.length) {
            cost += (costH[h] * Vp);
            Hp++;
            h++; 
        }
        while (v<costV.length) {
            cost += (costV[v]*Hp);
            Vp++;
            v++;
        }
        int totalp=n*m;

        System.out.println("Minimum cost = "+cost+" Total pieces =  "+totalp);
    }
}
