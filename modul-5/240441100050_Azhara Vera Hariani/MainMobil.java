/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul5;

/**
 *
 * @author AZHARA VERA
 */
public class MainMobil {
    public static void main(String[] args) {
        MobilSport sport = new MobilSport();
        sport.nyalakanMesin();
        sport.matikanMesin();

        System.out.println(); // Pemisah

        MobilSedan sedan = new MobilSedan();
        sedan.nyalakanMesin();
        sedan.matikanMesin();
    }
}

    
       
 