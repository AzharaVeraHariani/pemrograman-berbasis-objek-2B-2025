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

public class Mainmanusia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jalan = true;

        while (jalan) {
            System.out.println("\n=== PILIH KARAKTER ===");
            System.out.println("1. Joko");
            System.out.println("2. Beni");
            System.out.println("3. Fani");
            System.out.println("4. Jani");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");

            try {
                int pilihan = scanner.nextInt();
                manusia manusia;

                switch (pilihan) {
                    case 1:
                        manusia = new Joko();
                        break;
                    case 2:
                        manusia = new Beni();
                        break;
                    case 3:
                        manusia = new Fani();
                        break;
                    case 4:
                        manusia = new Jani();
                        break;
                    case 5:
                        System.out.println("Program selesai.");
                        jalan = false;
                        continue;
                    default:
                        System.out.println("Pilihan tidak valid!");
                        continue;
                }

                manusia.berbicara();
                manusia.bekerja();
                manusia.makan();

            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine(); // bersihkan buffer
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        }

        scanner.close();
    }
}

  

