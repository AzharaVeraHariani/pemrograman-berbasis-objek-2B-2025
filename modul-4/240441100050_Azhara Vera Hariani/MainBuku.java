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
        Perpustakaan perpustakaan = new Perpustakaan(5); // Kapasitas perpustakaan 5 buku
        int pilihan;

        do {
            System.out.println("\n=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Semua Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul Buku: ");
                    String judul = input.nextLine();
                    System.out.print("Masukkan Penulis Buku: ");
                    String penulis = input.nextLine();
                    System.out.print("Masukkan Jumlah Halaman Buku: ");
                    int jumlahHalaman = input.nextInt();
                    input.nextLine(); // Konsumsi newline
                    perpustakaan.tambahBuku(new Buku(judul, penulis, jumlahHalaman));
                    break;

                case 2:
                    perpustakaan.tampilkanSemuaBuku();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);

        input.close();
    }
}
    

