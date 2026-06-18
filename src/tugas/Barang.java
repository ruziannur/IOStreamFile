/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author MSIrone
 */
public class Barang {
    private final String nama;
    private final double harga;
    private final int stok;

    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    public String info() {
        return "Nama: " + nama +
               ", Harga: Rp" + harga +
               ", Stok: " + stok;
    }
}
