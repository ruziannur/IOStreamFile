/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author MSIrone
 */
public class Gudang {
    private final ArrayList<Barang> daftarBarang = new ArrayList<>();
    private final String namaBerkas;

    public Gudang(String namaBerkas) {
        this.namaBerkas = namaBerkas;
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void tampilkanSemua() {
        System.out.println("===== DAFTAR BARANG =====");

        for (int i = 0; i < daftarBarang.size(); i++) {
            System.out.println((i + 1) + ". " +
                    daftarBarang.get(i).info());
        }
    }

    public void simpanKeBerkas() {
        try (PrintWriter penulis =
                     new PrintWriter(new FileWriter(namaBerkas))) {

            for (Barang b : daftarBarang) {
                penulis.println(b.keBaris());
            }

            System.out.println("Data berhasil disimpan ke "
                    + namaBerkas);

        } catch (IOException e) {
            System.out.println("Gagal menyimpan data: "
                    + e.getMessage());
        }
    }

    public void muatDariBerkas() {
        daftarBarang.clear();

        try (BufferedReader pembaca =
                     new BufferedReader(
                             new FileReader(namaBerkas))) {

            String baris;

            while ((baris = pembaca.readLine()) != null) {

                String[] data = baris.split(";");

                if (data.length == 3) {

                    String nama = data[0];
                    double harga = Double.parseDouble(data[1]);
                    int stok = Integer.parseInt(data[2]);

                    daftarBarang.add(
                            new Barang(nama, harga, stok)
                    );
                }
            }

            System.out.println("Data berhasil dimuat dari "
                    + namaBerkas);

        } catch (IOException e) {
            System.out.println("Gagal memuat data: "
                    + e.getMessage());
        }
    }

    public double totalNilai() {
        double total = 0;

        for (Barang b : daftarBarang) {
            total += b.getHarga() * b.getStok();
        }

        return total;
    }
}
