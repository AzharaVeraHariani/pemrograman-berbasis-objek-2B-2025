/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul3;

/**
 *
 * @author AZHARA VERA
 */


    /**
     * @param args the command line arguments
     */
import java.util.Scanner;

public class MainBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        int pilihan;

        do {
            System.out.println("\n=== Menu Perpustakaan ===");
            System.out.println("1. Tambah Buku Fiksi");
            System.out.println("2. Tambah Buku Non-Fiksi");
            System.out.println("3. Tampilkan Koleksi Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // membersihkan buffer Enter

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul Buku: ");
                    String judulFiksi = input.nextLine();
                    System.out.print("Masukkan Penulis Buku: ");
                    String penulisFiksi = input.nextLine();
                    System.out.print("Masukkan Genre Buku: ");
                    String genre = input.nextLine();
                    BukuFiksi bukuFiksi = new BukuFiksi(judulFiksi, penulisFiksi, genre);
                    perpustakaan.tambahBukuFiksi(bukuFiksi);
                    System.out.println("Buku Fiksi berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.print("Masukkan Judul Buku: ");
                    String judulNonFiksi = input.nextLine();
                    System.out.print("Masukkan Penulis Buku: ");
                    String penulisNonFiksi = input.nextLine();
                    System.out.print("Masukkan Topik Buku: ");
                    String topik = input.nextLine();
                    BukuNonFiksi bukuNonFiksi = new BukuNonFiksi(judulNonFiksi, penulisNonFiksi, topik);
                    perpustakaan.tambahBukuNonFiksi(bukuNonFiksi);
                    System.out.println("Buku Non-Fiksi berhasil ditambahkan!");
                    break;

                case 3:
                    perpustakaan.tampilkanKoleksi();
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }

        } while (pilihan != 4);

        input.close();
    }
}


   
