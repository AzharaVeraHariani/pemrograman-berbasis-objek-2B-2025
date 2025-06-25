/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author AZHARA VERA
 */
import java.util.Scanner;

public class MainBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Buku tersedia (tidak ditampilkan ke user)
        BukuFiksi bukuFiksi = new BukuFiksi("Laskar Pelangi", "Andrea Hirata");
        BukuReferensi bukuReferensi = new BukuReferensi("Ensiklopedia Dunia", "John Doe");

        boolean ulang = true;

        while (ulang) {
            System.out.println("\n=== SISTEM PEMINJAMAN & RESERVASI ===");
            System.out.print("Masukkan nama Anda: ");
            String nama = input.nextLine();

            System.out.println("Pilih kategori buku:");
            System.out.println("1. Fiksi");
            System.out.println("2. Referensi");
            System.out.print("Pilihan: ");
            int kategori = input.nextInt();
            input.nextLine(); // flush

            Buku bukuDipilih = null;

            if (kategori == 1) {
                bukuDipilih = bukuFiksi;
            } else if (kategori == 2) {
                bukuDipilih = bukuReferensi;
            } else {
                System.out.println("Kategori tidak valid.");
                continue;
            }

            System.out.println("Pilih aksi:");
            System.out.println("1. Pinjam");
            System.out.println("2. Reservasi");
            System.out.print("Pilihan: ");
            int aksi = input.nextInt();
            input.nextLine(); // flush

            if (aksi == 1) {
                if (bukuDipilih instanceof Peminjaman) {
                    ((Peminjaman) bukuDipilih).pinjam(nama);
                } else {
                    System.out.println("Maaf, kategori ini tidak dapat dipinjam.");
                }
            } else if (aksi == 2) {
                if (bukuDipilih instanceof Reservasi) {
                    ((Reservasi) bukuDipilih).reservasi(nama);
                } else {
                    System.out.println("Kategori ini tidak mendukung reservasi.");
                }
            } else {
                System.out.println("Aksi tidak valid.");
            }

            System.out.print("\nIngin melakukan aksi lain? (y/n): ");
            String lagi = input.nextLine();
            ulang = lagi.equalsIgnoreCase("y");
        }

        System.out.println("Terima kasih telah menggunakan sistem.");
        input.close();
    }
}


    

