/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Faros
 */

public class Kendaraan {
    // Properties (private -> encapsulation)
    private String nama;
    private String jenis;
    private double harga;

    // Constructor
    public Kendaraan(String nama, String jenis, double harga) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }

    // Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
