/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author AZHARA VERA
 */
import java.util.Scanner;

public class MainBooking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            System.out.println("\n--- SISTEM BOOKING KENDARAAN ---");
            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Usia: ");
            int usia = input.nextInt();

            System.out.println("Pilih kendaraan:");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("3. Sepeda");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();

            System.out.print("Durasi sewa (hari): ");
            int hari = input.nextInt();
            input.nextLine(); // bersihkan buffer

            Booking kendaraan;

            switch (pilihan) {
                case 1:
                    kendaraan = new Mobil();
                    break;
                case 2:
                    kendaraan = new Motor();
                    break;
                case 3:
                    kendaraan = new Sepeda();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue;
            }

            kendaraan.book(nama, usia, hari);

            System.out.print("\nIngin booking lagi? (y/n): ");
            ulang = input.nextLine().equalsIgnoreCase("y");
        }

        System.out.println("Terima kasih telah menggunakan sistem booking!");
        input.close();
    }
}

