/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author AZHARA VERA
 */


import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank(50); // Maksimal 50 rekening
        int pilihan;

        do {
            System.out.println("\n=== MENU BANK ===");
            System.out.println("1. Tambah Rekening");
            System.out.println("2. Setor");
            System.out.println("3. Tarik");
            System.out.println("4. Tampilkan Semua Rekening");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan No Rekening   : ");
                    String noRek = input.nextLine();
                    System.out.print("Masukkan Nama Pemilik  : ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Saldo Awal    : ");
                    double saldo = input.nextDouble();
                    input.nextLine();
                    bank.tambahRekening(new RekeningBank(noRek, nama, saldo));
                    break;

                case 2:
                    System.out.print("Masukkan No Rekening: ");
                    String noRekSetor = input.nextLine();
                    System.out.print("Jumlah Setoran: ");
                    double jmlSetor = input.nextDouble();
                    input.nextLine();
                    bank.setor(noRekSetor, jmlSetor);
                    break;

                case 3:
                    System.out.print("Masukkan No Rekening: ");
                    String noRekTarik = input.nextLine();
                    System.out.print("Jumlah Penarikan: ");
                    double jmlTarik = input.nextDouble();
                    input.nextLine();
                    bank.tarik(noRekTarik, jmlTarik);
                    break;

                case 4:
                    bank.tampilkanSemuaRekening();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan layanan bank.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);

        input.close();
    }
}
    
    

