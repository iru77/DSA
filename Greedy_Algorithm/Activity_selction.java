package Greedy_Algorithm;

import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Activity_selction { // tc =O(n) 
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};


        // Agar start sort hai aur end nhi hai tu end ko sort kaise kare
        // sorting 2D array
        int activity[][]= new int[start.length][3];
        for(int i=0;i<start.length;i++) // tc=O(nlogn)
        {
            activity[i][0]=i; // index
            activity[i][1]=start[i];// start elment
            activity[i][2]=end[i];// end element

        }

        // l ambda fuction -> shortform
        // 2D array sort
        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        // end time basis sort
        int maxAct=0;
        ArrayList<Integer>ans=new ArrayList<>();

        // 1st Activity
        maxAct=1;
        ans.add(activity[0][0]);//ans.add(0);  // End Element
        int lastEnd=activity[0][2]; //end[0];
        for(int i=1;i<end.length;i++)
        {
            if(activity[i][1]>= lastEnd)//if(start[i]>= lastEnd)
            {
                //activity select
                maxAct++;
                ans.add(activity[i][0]);//ans.add(i);
                lastEnd= activity[i][2]; // end[i];
            }
        }

        System.out.println("Maximum activity = "+ maxAct);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
