/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Calvin C M
 */
public class Karyawan {
    private String kode;
    private String nama;
    private Waktu datang;
    private Waktu pulang;

    Karyawan() {
        this.kode="";
        this.nama="";
        this.datang=new Waktu();
        this.pulang=new Waktu();
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public Waktu getDatang() {
        return datang;
    }

    public Waktu getPulang() {
        return pulang;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDatang(Waktu datang) {
        this.datang = datang;
    }

    public void setPulang(Waktu pulang) {
        this.pulang = pulang;
    }
}
