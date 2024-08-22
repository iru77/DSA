package Linked_List;


public class LinkedList {

    public class Node{
        int data;
        Node next;
        public Node(int data)
            {
                this.data=data;
                this.next=null;
            }
    }
    static Node head;
    static Node tail;
    static int Size=0;

    //print 
    public void Printf()
    {
        if(head==null)
        {
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");

    }

    //addfirst
    public void add(int data)
    {
        Node temp=new Node(data);
        Size++;
        if(head==null)
        {
            head=tail=temp;
            return;
        }
        temp.next=head;
        head=temp;
    }

    // Q.1  Reverse Linked List
    //i/p ->  1 2 3 4 5 o/p -> 5 4 3 2 1
    public void reverse()
    {

        Node curr=head;
        Node prev=null;
        Node next;
        while (curr != null) {
            next=curr.next;
            curr.next=prev;

            //updating 
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    // Q.2 Remove Nth Node from End 
    //i/p -> 1 2 3 4 5 N=3  i/p -> 1 2 3 4 5 N=2
    // o/p -> 1 2 4 5       o/p -> 1 2 3 5

    public void DeleteNthFromEnd(int n)
    {
        // calculate size 
        int size=0;
        Node temp=head;
        while (temp != null) {
            temp=temp.next;
            size++;
        }
        if(n==size)// one value
        {
            head=head.next;
            return;
        }
        int i=1;
        Node prev=head;
        while (i<(size-n)) {// prev value identify 
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;// delete the nth node
        Size--;
        return;
    }

    // Q.3 Check Palindrome
    // i/p:- 2 3 4 o/p :- 4 3 2
    public Node findmid(Node head)
    {
        Node slow=head;
        Node fast=head;
        while (fast !=null && fast.next !=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean Palindrome()
    {
        if(head==null || head.next==null)
        {
            return true;
        }
        //  find mid
        Node mid= findmid(head);

        // 2nd half reverse
        Node prev=null;
        Node curr=mid;
        while (curr !=null) {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node righthead=prev;
        Node lefthead=head;
        // comparing
        while (righthead !=null && lefthead !=null) {
            if(righthead.data != lefthead.data)
            {
                return false;
            }
            righthead=righthead.next;
            lefthead=lefthead.next;
        }
        return true;
        

    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(1);
        
        ll.Printf();
        //ll.reverse();
        //ll.DeleteNthFromEnd(2);
        System.out.println(ll.Palindrome());
        //ll.Printf();

        //System.out.println(Size);
    }
}
