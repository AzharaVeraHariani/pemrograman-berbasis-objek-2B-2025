/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AZHARA VERA
 */
public class Sepeda implements Booking {
    private final double hargaPerHari = 50000;

    @Override
    public void book(String name, int age, int durasiHari) {
        // Tidak perlu validasi usia
        double total = calculateCost(durasiHari);
        System.out.println("Booking Sepeda berhasil untuk " + name + ". Total: Rp" + total);
    }

    @Override
    public double calculateCost(int durasiHari) {
        return hargaPerHari * durasiHari;
    }
}

