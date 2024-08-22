package Stack_Queues;

import java.util.Stack;


public class Queuesfirst {
    static class Queue{
        static Stack<Integer> s=new Stack<>();
        static Stack<Integer> s2= new Stack<>();

        public boolean isEmpty()
        {
            return s.isEmpty();
        }

        // add
        public void add(int data)
        {
            while (!s.isEmpty()) {
                s2.push(s.pop()); 
                
            }
            s.push(data);
            while (!s2.isEmpty()) {
                s.push(s2.pop());
            }
        }

        // remove
        public int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s.pop();
        }
        // peek
        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s.peek();
        }

    }
    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
