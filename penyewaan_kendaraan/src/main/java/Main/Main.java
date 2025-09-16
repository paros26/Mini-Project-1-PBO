/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import service.KendaraanService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KendaraanService service = new KendaraanService();
        Scanner sc = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("\n=== SISTEM MANAJEMEN PENYEWAAN KENDARAAN ===");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Lihat Semua Kendaraan");
            System.out.println("3. Update Kendaraan");
            System.out.println("4. Hapus Kendaraan");
            System.out.println("5. Cari Kendaraan");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> service.tambahKendaraan();
                case 2 -> service.tampilkanKendaraan();
                case 3 -> service.updateKendaraan();
                case 4 -> service.hapusKendaraan();
                case 5 -> service.cariKendaraan();
                case 6 -> System.out.println("👋 Terima kasih telah menggunakan program ini!");
                default -> System.out.println(" Pilihan tidak valid.");
            }
        } while (pilihan != 6);

        sc.close();
    }
}

