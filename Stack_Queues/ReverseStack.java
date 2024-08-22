package Stack_Queues;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);

        //PrintS(s);

        reverse(s);

        PrintS(s);


        // while (!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }
    }

    public static void reverse(Stack <Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        reverse(s);
        bottom(s,top);
    }

    public static void PrintS(Stack<Integer> s)
    {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void bottom(Stack<Integer>s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        bottom(s, data);
        s.push(top);
    }
}
