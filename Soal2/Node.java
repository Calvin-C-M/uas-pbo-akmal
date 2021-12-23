/*
 * Nama Project         : Node
 * Nama                 : Calvin Calfi Montolalu
 * NPM                  : 140810200053
 * Kelas                : A
 * Tanggal Buat         : 23/12/2021
 */

public class Node {
    private Mahasiswa mahasiswa;
    private Node next;

    Node() {
        this.mahasiswa=new Mahasiswa();
        this.next=null;
    }

    Node(Mahasiswa mhs) {
        this.mahasiswa=mhs;
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
