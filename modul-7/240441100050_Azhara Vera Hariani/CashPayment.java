/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AZHARA VERA
 */

public class CashPayment implements Payment, Discountable {
    @Override
    public double calculateFinalAmount(double amount) {
        return amount * 0.95; // diskon 5%
    }

    @Override
    public void pay(double amount) {
        double finalAmount = calculateFinalAmount(amount);
        System.out.println("Tunai - Total setelah diskon 5%: Rp" + finalAmount);
    }
}

  

