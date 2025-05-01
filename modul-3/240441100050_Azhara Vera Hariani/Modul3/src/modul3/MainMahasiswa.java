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
import java.util.ArrayList;
import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat koleksi untuk menyimpan mahasiswa reguler dan beasiswa
        ArrayList<MahasiswaReguler> mahasiswaRegulers = new ArrayList<>();
        ArrayList<MahasiswaBeasiswa> mahasiswaBeasiswas = new ArrayList<>();

        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("\n=== Menu Mahasiswa ===");
            System.out.println("1. Tambah Mahasiswa Reguler");
            System.out.println("2. Tambah Mahasiswa Beasiswa");
            System.out.println("3. Tampilkan Semua Mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            
            pilihan = input.nextInt();
            input.nextLine();  // Mengonsumsi newline karakter setelah input integer

            switch (pilihan) {
                case 1:
                    // Input data untuk Mahasiswa Reguler
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String namaReguler = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nimReguler = input.nextLine();
                    System.out.print("Masukkan Kelas Mahasiswa: ");
                    String kelas = input.nextLine();
                    MahasiswaReguler mhsReguler = new MahasiswaReguler(namaReguler, nimReguler, kelas);
                    mahasiswaRegulers.add(mhsReguler);  // Menambahkan mahasiswa reguler ke koleksi
                    System.out.println("Mahasiswa Reguler berhasil ditambahkan!");
                    break;

                case 2:
                    // Input data untuk Mahasiswa Beasiswa
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String namaBeasiswa = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nimBeasiswa = input.nextLine();
                    System.out.print("Masukkan Jenis Beasiswa: ");
                    String jenisBeasiswa = input.nextLine();
                    MahasiswaBeasiswa mhsBeasiswa = new MahasiswaBeasiswa(namaBeasiswa, nimBeasiswa, jenisBeasiswa);
                    mahasiswaBeasiswas.add(mhsBeasiswa);  // Menambahkan mahasiswa beasiswa ke koleksi
                    System.out.println("Mahasiswa Beasiswa berhasil ditambahkan!");
                    break;

                case 3:
                    // Menampilkan semua mahasiswa
                    System.out.println("\nMenampilkan Semua Mahasiswa:");
                    System.out.println("\n=== Mahasiswa Reguler ===");
                    for (MahasiswaReguler mhs : mahasiswaRegulers) {
                        mhs.infoReguler();  // Menampilkan info mahasiswa reguler
                    }

                    System.out.println("\n=== Mahasiswa Beasiswa ===");
                    for (MahasiswaBeasiswa mhs : mahasiswaBeasiswas) {
                        mhs.infoBeasiswa();  // Menampilkan info mahasiswa beasiswa
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih 1-4.");
            }
        }

        input.close();
    }
}

    
    

