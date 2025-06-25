/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AZHARA VERA
 */
public class EWalletPayment implements Payment, Discountable {
    @Override
    public double calculateFinalAmount(double amount) {
        if (amount > 20000) {
            return amount - 2000; // potongan Rp 2.000
        }
        return amount;
    }

    @Override
    public void pay(double amount) {
        double finalAmount = calculateFinalAmount(amount);
        System.out.println("E-Wallet - Total setelah potongan: Rp" + finalAmount);
    }
}


    

