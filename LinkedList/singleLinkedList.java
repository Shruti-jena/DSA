package LinkedList;


//Basic structure of a node in LinkedList
public class singleLinkedList {

    private Node head;
    private Node tail;
    private Node current;
    private int size;

    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
    
    public void insertFirst(int value)
    {
        Node node = new Node(value);
        node.next=head;
        head=node;
        if(head == null)
        {
            head=node;
            head.next=null;
        }
        if(tail==null)
        {
            tail=head;
        }
        size++;
    }

    public void insertlast(int value){
        Node node = new Node(value);
        tail.next=node;
        tail=node;
        node.next=null;
        if(tail==head)
        {
            head=node;
        }
        size++;
    }

    public void insertAtIndex(int value,int index) 
    {
        Node curr = head;
         if(index==0)
         {
            insertFirst(value);
            return;
         }
       for(int i=1;i<index;i++)
       {
         curr=curr.next;
       }
       Node node = new Node(value,curr.next);
       curr.next=node;
       size++;
    }

    public int deleteFirst()
    {
        int value=head.value;
        head=head.next;
        if(head==null)
        tail=null;

        return value;
    }

    public Node getNode(int index)
    {
        Node node=head;
        for(int i=0;i<index;i++)
        {
            node=node.next;
        }
        return node; 
    }

    public int deleteLast()
    {
        if(head.next==null)
        return deleteFirst();

        Node secondLast = getNode(size-2);
        int value=tail.value;
        tail=secondLast;
        tail.next=null;
        return value;

    }

    public int deleteAtIndex(int index)
    {
        if(index==0)
        return deleteFirst();

        if(index==size-1)
        return deleteLast();

        Node prev = getNode(index-1);
        int val =  prev.next.value;
        Node curr = getNode(index);
        prev.next=curr.next;
        return val;
    }

    public Node find(int value){
        Node node=head;
        while(node!=null)
        {
            if(node.value==value)
            {
                return node;
            }
            node=node.next;
        }
        return node;
    }

    public void display(){
        Node current = head;
        while(current!=null)
        {
            System.out.print(current.value + " -> ");
            current=current.next;
        }
        Node n = find(11);
        System.out.println(n.value);
    }
    public static void main(String[] args) {
        //Creating first node head of the list
        singleLinkedList list = new singleLinkedList();
        list.insertFirst(9);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(7);
        list.insertlast(14);
        list.insertAtIndex(11, 3);
        int result=list.deleteFirst();
        System.out.println(result);
        int res=list.deleteLast();
        System.out.println(res);
        System.out.println(list.deleteAtIndex(4));
        list.display();
    }
}
