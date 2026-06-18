/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author MSIrone
 */
public class LatihanBacaTulis {
      public static void main(String[] args) {

        String namaFile = "hari.txt";

        try {

            // ==========================
            // Nomor 1
            // ==========================
            System.out.println("=== Nomor 1 ===");

            try (BufferedWriter writer = new BufferedWriter(
                    new FileWriter(namaFile))) {
                writer.write("Senin");
                writer.newLine();
                writer.write("Selasa");
                writer.newLine();
                writer.write("Rabu");
                writer.newLine();
                writer.write("Kamis");
                writer.newLine();
                writer.write("Jumat");
                writer.newLine();
            }

            System.out.println("Isi file hari.txt:");

            BufferedReader reader = new BufferedReader(
                    new FileReader(namaFile));

            String baris;

            while ((baris = reader.readLine()) != null) {
                System.out.println(baris);
            }

            reader.close();

            // ==========================
            // Nomor 2
            // ==========================
            System.out.println("\n=== Nomor 2 ===");

            BufferedWriter appendWriter = new BufferedWriter(
                    new FileWriter(namaFile, true));

            appendWriter.write("Sabtu");
            appendWriter.newLine();
            appendWriter.write("Minggu");
            appendWriter.newLine();

            appendWriter.close();

            System.out.println("Isi file setelah ditambah:");

            reader = new BufferedReader(
                    new FileReader(namaFile));

            while ((baris = reader.readLine()) != null) {
                System.out.println(baris);
            }

            reader.close();

            // ==========================
            // Nomor 3
            // ==========================
            System.out.println("\n=== Nomor 3 ===");

            int jumlahBaris = 0;

            Scanner scan = new Scanner(new File(namaFile));

            while (scan.hasNextLine()) {
                scan.nextLine();
                jumlahBaris++;
            }

            scan.close();

            System.out.println("Jumlah baris dalam file = "
                    + jumlahBaris);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: "
                    + e.getMessage());
        }
    }
}
