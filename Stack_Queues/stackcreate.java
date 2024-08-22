package Stack_Queues;

//import java.util.ArrayList;

public class stackcreate {
   //static class Stack{
    // ArrayList
//         static ArrayList<Integer> al=new ArrayList<>();
//         // isEmpty
//         public static boolean isEmpty()
//         {
//             return al.size()==0;
//         }
//         // add (push)
//         public static void push(int data)
//         {
//             al.add(data);
//         }

//         // delete(pop)
//         public static int pop()
//         {
//             if(isEmpty())
//             {
//                 return -1;
//             }
//             int top=al.get(al.size()-1);
//             al.remove(al.size()-1);
//             return top;
//         }

//         // viewing (peek)
//         public static int peek()
//         {
//             if (isEmpty()) {
//                 return -1;
//             }
//             return al.get(al.size()-1);
//         }
//    } 

    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    static class Stack {
        static Node head=null;
         
        //isEmpty
        public static boolean isEmpty()
        {
            return head==null;
        }

        //add (push)
        public static void push(int data)
        {
            // new node create
            Node temp=new Node(data);
            if(isEmpty())
            {
                head=temp;
                return;
            }
            temp.next=head;
            head=temp;
        }

        //delete (pop)
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        // viewing (peek)
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.data;
        }

    }

   public static void main(String[] args) {
        Stack.push(3);
        Stack.push(2);
        Stack.push(1);

        // print 
        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }
   }

}
