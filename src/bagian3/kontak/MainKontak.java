/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.kontak;

/**
 *
 * @author MSIrone
 */
public class MainKontak {
    public static void main(String[] args) {

        BukuKontak buku =
                new BukuKontak("kontak.txt");

        buku.tambahKontak(
                new Kontak(
                        "Andi",
                        "0811111",
                        "andi@gmail.com"));

        buku.tambahKontak(
                new Kontak(
                        "Budi",
                        "0822222",
                        "budi@gmail.com"));

        buku.tambahKontak(
                new Kontak(
                        "Citra",
                        "0833333",
                        "citra@gmail.com"));

        buku.tampilkanSemua();
    }
}
