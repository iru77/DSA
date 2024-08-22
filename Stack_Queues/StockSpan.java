package Stack_Queues;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int Stock[]={100,80,60,70,60,85,100};
        int Span[]= new int [Stock.length];

        CalcStockSpan(Stock,Span);
        for(int i=0;i<Span.length;i++)
        {
            System.out.println(Span[i]);
        }
    }

    public static void CalcStockSpan(int st[],int sp[])
    {
        Stack<Integer>s=new Stack<>();
        sp[0]=1;
        s.push(0);
        for(int i=1;i<st.length;i++)
        {
            int currentPrice=st[i];
            while (!s.isEmpty() && currentPrice > st[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty())
            {
                sp[i]=i+1;
            }
            else{
                int prevHigh=s.peek();
                sp[i]=i-prevHigh;
            }
            s.push(i);
        }
    }
}
