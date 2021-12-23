/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.SQLException;
import Database.*;

/**
 *
 * @author Calvin C M
 */
public class Karyawan {
    private String kode;
    private String nama;
    private Waktu datang;
    private Waktu pulang;
    private Waktu lama;
    private double upah;

    public Karyawan() {
        this.kode="";
        this.nama="";
        this.datang=new Waktu();
        this.pulang=new Waktu();
        this.lama=new Waktu();
        this.upah=0;
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

    public Waktu getLama() {
        return lama;
    }

    public double getUpah() {
        return upah;
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

    public void setLama(Waktu lama) {
        this.lama = lama;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public void insertData() throws SQLException {
        ConnectDB connectDB=new ConnectDB();
        String query="INSERT INTO karyawan VALUES ('" + this.kode +
                     "', '" + this.nama + 
                     "', '" + this.datang +
                     "', '" + this.pulang + 
                     "', '" + this.lama + 
                     "', '" + this.upah +
                     "');";

        connectDB.query(query);
    }

    public void updateData() throws SQLException {

    }

    public void deleteData() throws SQLException {

    }
}
