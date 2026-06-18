/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.kontak;

/**
 *
 * @author MSIrone
 */
public class Kontak {
    private final String nama;
    private final String nomor;
    private final String email;

    public Kontak(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    public String getEmail() {
        return email;
    }

    public String keBaris() {
        return nama + ";" + nomor + ";" + email;
    }

    public String info() {
        return nama + " - " + nomor + " - " + email;
    }
}
