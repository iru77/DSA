package Linked_List;

public class addLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node Head;
    public static Node Tail;
    public static int size; // LinkedList size 

    public  void addF(int data)
    {
        // Step 1:- Create New Node
        Node newnode=new Node(data);
        size++;
        if(Head==null)
        {
            Head=Tail=newnode;
            return;
        }
        //Step2:-new Node next assign head
        newnode.next=Head;
        // Step3:-Head assign newNode
        Head=newnode;
    }
    public  void addL(int data)
    { 
        //Step1:- Create new node
        Node newnode=new Node(data);
        size++;
        if(Head==null)
        {
            Head=Tail=newnode;
            return;
        }
        // Step2:- tail next assign newnode
        Tail.next=newnode;
        // Step3:- tail assign newNode
        Tail=newnode;
    }
    public void Print()
    {
        if(Head==null)
        {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp=Head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public void addM(int idx, int data)
    {
        if(idx==0)
        {
            addF(data);
            return;
        }
        Node newnode=new Node(data);
        size++;
        int i=0;
        Node temp=Head;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }      
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public int RemoveFirst()
    {
        if(size==0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val=Head.data;
            Head=Tail=null;
            size=0;
            return val;
        }
        int val=Head.data;
        Head=Head.next;
        size--;
        return val;

    }
    public int RemoveLast()
    {
        if (size==0) {
            System.out.print("LL is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val=Head.data;
            Head=Tail=null;
            return val;
        }
        Node prev=Head;
        for(int i=0;i<size-2;i++)
        {
            prev=prev.next;
        }
        int val=prev.next.data;// Tail.data
        prev.next=Tail.next;
        size--;
        return val;
    }
    public int IterSearch(int key){
        if(Head==null)
        {
            return -1;
        }
        int i=0;
        Node temp=Head;
        while (temp!=null) {
            if(temp.data==key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node temp, int key)
    {
        if(temp==null)
        {
            return -1;
        }
        if(temp.data==key)
        {
            return 0;
        }
        int idx=helper(temp.next, key)+1;
        return idx;
    }
    public int recSearch(int key)
    {
        return helper(Head,key);
    }
    public static void main(String[] args) {
        addLL ll=new addLL(); // Construction use its 
        ll.addF(2);
        ll.addF(1);
        ll.addL(4);
        ll.addL(5);
        ll.addM(2, 3);
        ll.Print();
        // ll.RemoveFirst();
        // ll.Print();
        // System.out.println(ll.size);
        // ll.RemoveLast();
        // ll.Print();
        
       
        // System.out.println(ll.size);

        System.out.println(ll.IterSearch(4));
        System.out.println(ll.IterSearch(20));

       // System.out.println(ll.recSearch(4));
        System.out.println(ll.recSearch(50));
    }
}

