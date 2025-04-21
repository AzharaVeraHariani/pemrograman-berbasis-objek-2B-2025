package Coba;

import java.util.Scanner; // Import library untuk input pengguna

// 1. Deklarasi Class Mahasiswa
class Mahasiswa {
    // Atribut (Properti)
    private String nama;
    private String nim;
    private String prodi;
    private String alamat;

    // 2. Constructor untuk Menginisialisasi Data Mahasiswa
    public Mahasiswa(String nama, String nim, String prodi, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    // 3. Method untuk Menampilkan Data Mahasiswa
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Program Studi: " + prodi);
        System.out.println("Alamat: " + alamat);
        System.out.println("---------------------------");
    }
}

// 4. Program Utama (Main Class)
public class Coba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner untuk Input Data

        // 5. Array untuk Menyimpan Minimal 3 Mahasiswa
        int jumlahMahasiswa = 3; // Bisa diubah sesuai kebutuhan
        Mahasiswa[] mahasiswaArray = new Mahasiswa[jumlahMahasiswa];

        // 6. Perulangan untuk Input Data Mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Program Studi: ");
            String prodi = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();

            // 7. Membuat Objek Mahasiswa dan Menyimpannya ke Array
            mahasiswaArray[i] = new Mahasiswa(nama, nim, prodi, alamat);
        }

        // 8. Menampilkan Data Mahasiswa yang Sudah Dimasukkan
        System.out.println("\nData Mahasiswa:");
        for (Mahasiswa mhs : mahasiswaArray) {
            mhs.tampilkanData();
        }

        scanner.close(); // Menutup Scanner setelah digunakan
    }
}