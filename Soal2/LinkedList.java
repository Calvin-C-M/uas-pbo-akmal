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

    public Node createElement() {
        Node newElement=new Node();
        newElement.getMahasiswa().input();
        return newElement;
    }

    public Node createElement(Mahasiswa mhs) {
        Node newElement=new Node(mhs);
        return newElement;
    }

    public void insertFirst(Node newElement) {
        if(this.head==null) {
            this.head=newElement;
        } else {
            newElement.setNext(this.head);
            this.head=newElement;
        }
    }

    public void deleteFirst() {
        Node del=null;
        del=this.head;
        this.head=this.head.getNext();
    }

    public Node searchNilaiTertinggi() {
        Node curr=this.head;
        Node temp=curr;
        float tertinggi=0;
        while(curr.getNext() != null) {
            if(tertinggi < curr.getNext().getMahasiswa().getNilaiPbo()) {
                temp=curr;
            }
            curr=curr.getNext();
        }
        return temp;
    }

    public int getSize() {
        Node curr=this.head;
        int size=0;
        while(curr.getNext() != null) {
            size++;
            curr=curr.getNext();
        }
        return size;
    }

    public float getRataRata() {
        Node curr=this.head;
        float jumlah=0;
        while(curr.getNext() != null) {
            jumlah += curr.getMahasiswa().getNilaiPbo();
            curr=curr.getNext();
        }
        return jumlah/getSize();
    }

    public void print() {
        Node curr=this.head;
        while(curr.getNext() != null) {
            curr.getMahasiswa().print();
            curr=curr.getNext();
        }
    }
}
