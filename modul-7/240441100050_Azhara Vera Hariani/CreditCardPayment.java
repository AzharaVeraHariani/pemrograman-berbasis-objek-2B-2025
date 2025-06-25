/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AZHARA VERA
 */
public class CreditCardPayment implements Payment, Discountable {
    @Override
    public double calculateFinalAmount(double amount) {
        return amount * 1.02; // 2% fee
    }

    @Override
    public void pay(double amount) {
        double finalAmount = calculateFinalAmount(amount);
        System.out.println("Pembayaran kartu kredit sebesar: Rp" + finalAmount);
    }
}

    

