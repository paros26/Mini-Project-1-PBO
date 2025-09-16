/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Model.Kendaraan;
import java.util.ArrayList;
import java.util.Scanner;

public class KendaraanService {
    private ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // CREATE
    public void tambahKendaraan() {
        System.out.print("Masukkan nama kendaraan: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan jenis kendaraan (Mobil/Motor): ");
        String jenis = sc.nextLine();

        double harga = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Masukkan harga sewa: ");
                harga = Double.parseDouble(sc.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println(" Input harga tidak valid. Harap masukkan angka!");
            }
        }

        daftarKendaraan.add(new Kendaraan(nama, jenis, harga));
        System.out.println(" Kendaraan berhasil ditambahkan!");
    }

    // READ
    public void tampilkanKendaraan() {
        if (daftarKendaraan.isEmpty()) {
            System.out.println(" Belum ada data kendaraan.");
            return;
        }
        System.out.println("\n=== Daftar Kendaraan ===");
        for (int i = 0; i < daftarKendaraan.size(); i++) {
            Kendaraan k = daftarKendaraan.get(i);
            System.out.println((i+1) + ". Nama: " + k.getNama() +
                    " | Jenis: " + k.getJenis() +
                    " | Harga: Rp" + k.getHarga());
        }
    }

    // UPDATE
    public void updateKendaraan() {
        tampilkanKendaraan();
        if (daftarKendaraan.isEmpty()) return;

        System.out.print("Masukkan nomor kendaraan yang ingin diupdate: ");
        int idx = sc.nextInt() - 1;
        sc.nextLine();

        if (idx >= 0 && idx < daftarKendaraan.size()) {
            Kendaraan k = daftarKendaraan.get(idx);

            System.out.print("Nama baru: ");
            k.setNama(sc.nextLine());
            System.out.print("Jenis baru: ");
            k.setJenis(sc.nextLine());

            boolean valid = false;
            while (!valid) {
                try {
                    System.out.print("Harga sewa baru: ");
                    k.setHarga(Double.parseDouble(sc.nextLine()));
                    valid = true;
                } catch (NumberFormatException e) {
                    System.out.println(" Input harga tidak valid!");
                }
            }

            System.out.println(" Data kendaraan berhasil diperbarui!");
        } else {
            System.out.println(" Nomor tidak valid.");
        }
    }

    // DELETE
    public void hapusKendaraan() {
        tampilkanKendaraan();
        if (daftarKendaraan.isEmpty()) return;

        System.out.print("Masukkan nomor kendaraan yang ingin dihapus: ");
        int idx = sc.nextInt() - 1;
        sc.nextLine();

        if (idx >= 0 && idx < daftarKendaraan.size()) {
            daftarKendaraan.remove(idx);
            System.out.println(" Kendaraan berhasil dihapus!");
        } else {
            System.out.println(" Nomor tidak valid.");
        }
    }

    // SEARCH
    public void cariKendaraan() {
        if (daftarKendaraan.isEmpty()) {
            System.out.println(" Belum ada data kendaraan.");
            return;
        }

        System.out.print("Masukkan kata kunci pencarian (nama/jenis): ");
        String keyword = sc.nextLine().toLowerCase();

        boolean ditemukan = false;
        System.out.println("\n=== Hasil Pencarian ===");
        for (Kendaraan k : daftarKendaraan) {
            if (k.getNama().toLowerCase().contains(keyword) ||
                k.getJenis().toLowerCase().contains(keyword)) {
                System.out.println("Nama: " + k.getNama() +
                        " | Jenis: " + k.getJenis() +
                        " | Harga: Rp" + k.getHarga());
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println(" Tidak ada kendaraan yang cocok dengan kata kunci.");
        }
    }
}

