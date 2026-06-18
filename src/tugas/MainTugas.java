/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
Nama : M Ruziannur
NPM  : 2410010352
 */
public class MainTugas {
    public static void main(String[] args) {

        // Array kategori (minimal 3)
        String[] kategori = {
                "Elektronik",
                "Makanan",
                "Minuman"
        };

        System.out.println("===== KATEGORI BARANG =====");

        for (String k : kategori) {
            System.out.println("- " + k);
        }

        System.out.println();

        // Membuat gudang
        Gudang gudang = new Gudang("barang.txt");

        // Menambahkan minimal 5 barang
        gudang.tambahBarang(
                new Barang("Laptop", 8500000, 5));

        gudang.tambahBarang(
                new Barang("Mouse", 150000, 20));

        gudang.tambahBarang(
                new Barang("Keyboard", 300000, 15));

        gudang.tambahBarang(
                new Barang("Monitor", 2500000, 8));

        gudang.tambahBarang(
                new Barang("Printer", 1800000, 4));

        System.out.println("DATA BARANG AWAL");
        gudang.tampilkanSemua();

        System.out.println();
        gudang.simpanKeBerkas();

        System.out.println();

        // Membuat objek baru
        Gudang gudangBaru =
                new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        System.out.println();
        System.out.println("DATA HASIL BACA FILE");

        gudangBaru.tampilkanSemua();

        System.out.println();
        System.out.println(
                "Total Nilai Persediaan = Rp"
                        + gudangBaru.totalNilai());
    }
}
