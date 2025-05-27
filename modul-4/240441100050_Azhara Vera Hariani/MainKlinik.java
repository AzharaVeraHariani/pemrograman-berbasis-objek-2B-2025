/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author AZHARA VERA
 */

import java.util.Scanner;

public class MainKlinik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Klinik klinik = new Klinik();
        int pilihan;

        do {
            System.out.println("\n=== MENU KLINIK ===");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tampilkan Semua Pasien");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // bersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Umur Pasien: ");
                    int umur = input.nextInt();
                    input.nextLine(); // newline
                    System.out.print("Masukkan Keluhan Pasien: ");
                    String keluhan = input.nextLine();

                    Pasien pasienBaru = new Pasien(nama, umur, keluhan);
                    klinik.tambahPasien(pasienBaru);
                    break;

                case 2:
                    klinik.tampilkanSemuaPasien();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem klinik.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        input.close();
    }
}

   

