package Stack_Queues;
import java.util.Stack;

public class bottom_of_stack {
   public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // push bottom of the stack
        bottom(s,4);
        
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
   }    

   public static void bottom(Stack<Integer> s, int data)
   {
        if(s.empty()) // base case
        {
            s.push(data);
            return;
        }

        // remove
        int top=s.pop();
        bottom(s, data); // recursion call
        s.push(top);
   }
}
