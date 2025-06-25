/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AZHARA VERA
 */
public class Mobil implements Booking, Insurance {
    private final double hargaPerHari = 500000;

    @Override
    public void book(String name, int age, int durasiHari) {
        if (age < 17) {
            System.out.println("Gagal booking mobil: umur minimal 17 tahun.");
            return;
        }
        double total = calculateCost(durasiHari);
        System.out.println("Booking Mobil berhasil untuk " + name + ". Total: Rp" + total);
    }

    @Override
    public double calculateCost(int durasiHari) {
        return (hargaPerHari * durasiHari) + getInsuranceFee();
    }

    @Override
    public double getInsuranceFee() {
        return 100000; // Biaya asuransi tetap
    }
}

