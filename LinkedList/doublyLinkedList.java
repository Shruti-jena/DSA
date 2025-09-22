package LinkedList;

public class doublyLinkedList {
    Node head;
    Node tail;
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next,Node prev)
        {
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }

    public void insertFirst(int value)
    {
        Node node =  new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null)
        head.prev=node;
        head=node;
    }

    public void insertLast(int value)
    {
        Node node = new Node(value);
        Node last=head;
        node.next=null;
        if(head==null)
        {
            node.prev=null;
            head=node;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;    
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
       Node node = new Node(value,curr.next,curr.prev);
       curr.next=node;
    }

    //Insert a node after the given node
    public void insertAfterNode(int after,int val)
    {
        Node prev_node=find(after);
        Node node=new Node(val);
        node.next=prev_node.next;
        node.prev=prev_node;
        prev_node.next=node;
        node.next.prev=node;
    }

    public Node find(int value){
        Node node=head;
        while(node!=null)
        {
            if(node.val==value)
            {
                return node;
            }
            node=node.next;
        }
        return node;
    }

    public void display()
    {
        Node node=head;
        Node last=null;
        while(node!=null)
        {
            System.out.print(node.val+ "->");
            last=node;
            node=node.next;
        }
        System.out.println("END");
        while(last!=null)
        {
            System.out.print(last.val+ "->");
            last=last.prev;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        doublyLinkedList list =  new doublyLinkedList();
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(11);
        list.insertFirst(8);
        list.insertFirst(19);
        list.insertLast(99);
        list.insertAfterNode(11, 12);
        list.display();
    }
    
}
