/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul6;

/**
 *
 * @author AZHARA VERA
 */


    /**
     * @param args the command line arguments
     */
import java.util.Scanner;
import java.util.InputMismatchException;

public class ProgramMobil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenMobil manajemen = new ManajemenMobil();
        boolean jalan = true;

        while (jalan) {
            System.out.println("\nMenu Manajemen Mobil:");
            System.out.println("1. Tambah Mobil Sport");
            System.out.println("2. Tambah Mobil Sedan");
            System.out.println("3. Operasikan Semua Mobil");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan: ");

            try {
                int pilihan = scanner.nextInt();
                switch (pilihan) {
                    case 1:
                        manajemen.tambahMobil(new MobilSport());
                        System.out.println("Mobil Sport berhasil ditambahkan.");
                        break;
                    case 2:
                        manajemen.tambahMobil(new MobilSedan());
                        System.out.println("Mobil Sedan berhasil ditambahkan.");
                        break;
                    case 3:
                        manajemen.operasikanSemuaMobil();
                        break;
                    case 4:
                        System.out.println("Program selesai.");
                        jalan = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine(); // Bersihkan buffer
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        }

        scanner.close();
    }
}

    
