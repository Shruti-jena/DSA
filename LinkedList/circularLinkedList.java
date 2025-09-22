package LinkedList;

public class circularLinkedList {
    private Node head;
    private Node tail;

    public circularLinkedList(){
        this.head=null;
        this.tail=null;
    }
    private class Node{
        int val;
        Node next;

        public Node(int val)
        {this.val=val;}
    }

    public void insert(int val){
        Node node =  new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void delete(int val){
        Node node = head;
        if(node==null)
        return;
        if(node.val==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n = node.next;
            if(n.val==val){
                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head);
    }

    public void display(){
        Node node = head;
        do
        {
            System.out.print(node.val+"->");
            node=node.next;
        }
        while(node!=tail);
        System.out.println("HEAD");
    }

    public static void main(String[] args) {
        circularLinkedList list = new circularLinkedList();
        list.insert(10);
        list.insert(2);
        list.insert(13);
        list.insert(9);
        list.insert(90);
        list.delete(13);
        list.display();

    }
    
}
