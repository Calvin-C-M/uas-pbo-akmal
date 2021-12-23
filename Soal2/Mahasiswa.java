import java.util.Scanner;

public class Mahasiswa {
    private String nama;
    private String npm;
    private float nilaiPbo;

    Mahasiswa() {
        this.nama="";
        this.npm="";
        this.nilaiPbo=0;
    }

    Mahasiswa(String nama, String npm, float nilai) {
        this.nama=nama;
        this.npm=npm;
        this.nilaiPbo=nilai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setNilaiPbo(float nilaiPbo) {
        this.nilaiPbo = nilaiPbo;
    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public float getNilaiPbo() {
        return nilaiPbo;
    }

    public void input() {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa: ");
        this.nama=input.nextLine();
        System.out.print("Masukkan NPM Mahasiswa: ");
        this.npm=input.nextLine();
        System.out.print("Masukkan Nilai PBO Mahasiswa: ");
        this.nilaiPbo=Float.parseFloat(input.nextLine());
    }
}
