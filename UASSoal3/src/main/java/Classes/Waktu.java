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
public class Waktu {
    private int jam;
    private int menit;
    private int detik;
    
    public Waktu() {
        this.jam=0;
        this.menit=0;
        this.detik=0;
    }

    public Waktu(int jam, int mnt, int dtk) {
        this.jam=jam;
        this.menit=mnt;
        this.detik=dtk;
    }

    public int getJam() {
        return jam;
    }

    public int getMenit() {
        return menit;
    }

    public int getDetik() {
        return detik;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public void setDetik(int detik) {
        this.detik = detik;
    }

    @Override
    public String toString() {
        return this.jam + ":" + this.menit + ":" + this.detik;
    }
}
