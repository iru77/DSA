package Greedy_Algorithm;
import java.util.*;

public class Job_Sequencing {

    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i,int d, int p)
        {
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int JobInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job>Jobs=new ArrayList<>();

        for(int i=0;i<JobInfo.length;i++)
        {
            Jobs.add(new Job(i, JobInfo[i][0],JobInfo[i][1]));
        }

        Collections.sort(Jobs,(obj1, obj2) -> obj2.profit-obj1.profit);
        // Desecending order // Acesending  Collections.sort(Jobs,(obj1, obj2) -> obj1.profit-obj2.profit);

        ArrayList<Integer> Seq =new ArrayList<>();
        int time=0;
        for(int i=0;i<Jobs.size();i++)
        {
            Job curr=Jobs.get(i);
            if(curr.deadline > time)
            {
                Seq.add(curr.id);
                time++;
            }
        }

        // PRint
        System.out.println("Maximum job = "+Seq.size());
        for(int i=0;i<Seq.size();i++)
        {
            System.out.print(Seq.get(i));
        }

    }
}
