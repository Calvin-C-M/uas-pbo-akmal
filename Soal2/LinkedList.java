public class LinkedList {
    private Node head;

    LinkedList() {
        this.head=null;
    }

    LinkedList(Node head) {
        this.head=head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void insertFirst() {
        Node newElement=new Node();
        newElement.getMahasiswa().input();
        
        if(this.head==null) {
            this.head=newElement;
        } else {
            newElement.setNext(this.head);
            this.head=newElement;
        }
    }

    public void print() {
        Node curr=this.head;
        while(curr.getNext() != null) {
            curr.getMahasiswa().print();
            curr=curr.getNext();
        }
    }
}
