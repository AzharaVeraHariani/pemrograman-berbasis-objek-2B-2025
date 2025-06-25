/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author AZHARA VERA
 */
import java.util.Scanner;
public class MainPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            System.out.print("\nMasukkan total belanja: Rp");
            double total = scanner.nextDouble();

            System.out.println("\nPilih metode pembayaran:");
            System.out.println("1. Tunai");
            System.out.println("2. Kartu Kredit");
            System.out.println("3. E-Wallet");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();

            Payment payment = null;

            switch (pilihan) {
                case 1:
                    payment = new CashPayment();
                    break;
                case 2:
                    payment = new CreditCardPayment();
                    break;
                case 3:
                    payment = new EWalletPayment();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue; // kembali ke awal
            }

            payment.pay(total);

            System.out.print("\nApakah Anda ingin melakukan pembayaran lain? (y/n): ");
            String jawaban = scanner.next();
            ulang = jawaban.equalsIgnoreCase("y");
        }

        scanner.close();
        System.out.println("Terima kasih telah menggunakan sistem pembayaran!");
    }
}

    

