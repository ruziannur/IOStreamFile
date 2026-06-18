/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.berkas;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author MSIrone
 */
public class LatihanMandiri1 {
     public static void main(String[] args) {

        System.out.println("=== LATIHAN STREAM DAN FILE ===\n");

        // Nomor 1
        System.out.println("1. Mengecek file laporan.txt");

        File laporan = new File("laporan.txt");

        try {
            if (!laporan.exists()) {
                laporan.createNewFile();
                System.out.println("File laporan.txt berhasil dibuat.");
            }

            if (laporan.exists()) {
                System.out.println("File tersedia.");
                System.out.println("Ukuran file: " + laporan.length() + " byte");
            } else {
                System.out.println("File tidak ditemukan.");
            }

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        System.out.println();

        // Nomor 2
        System.out.println("2. Membuat folder arsip");

        File folderArsip = new File("arsip");

        if (folderArsip.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip gagal dibuat atau sudah ada.");
        }

        System.out.println();

        // Nomor 3
        System.out.println("3. Membuat dan menghapus file sementara.txt");

        File sementara = new File("sementara.txt");

        try {
            sementara.createNewFile();

            System.out.println("Sebelum dihapus:");
            System.out.println("Apakah file ada? " + sementara.exists());

            if (sementara.delete()) {
                System.out.println("File berhasil dihapus.");
            } else {
                System.out.println("File gagal dihapus.");
            }

            System.out.println("Sesudah dihapus:");
            System.out.println("Apakah file ada? " + sementara.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
