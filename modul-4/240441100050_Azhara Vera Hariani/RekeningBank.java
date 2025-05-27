/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AZHARA VERA
 */
public class RekeningBank {
    private String noRekening;
    private String namaPemilik;
    private double saldo;

    //constructor
    public RekeningBank(String noRekening, String namaPemilik, double saldoAwal) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
    }
    
    //getter
    public String getNoRekening() {
        return noRekening;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        }
    }

    public boolean tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    public void tampilkanInfo() {
        System.out.println("No Rekening: " + noRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println("---------------------------");
    }
}

