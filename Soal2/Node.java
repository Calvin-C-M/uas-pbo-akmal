public class Node {
    private Mahasiswa mahasiswa;
    private Node next;

    Node() {
        this.mahasiswa=new Mahasiswa();
        this.next=null;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public Node getNext() {
        return next;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
