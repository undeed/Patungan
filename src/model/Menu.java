/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author undeed
 */
public class Menu {

    private String nama;
    private double harga;
    private double pajak;
    private boolean dibayar;

    public Menu() {
        dibayar = false;
    }

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
        dibayar = false;
    }

    public boolean isDibayar() {
        return dibayar;
    }

    public void setDibayar() {
        dibayar = !dibayar;
    }

    public double getPajak() {
        return pajak;
    }

    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public double getHargaDibayar() {
        return harga + (harga * pajak / 100);
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
