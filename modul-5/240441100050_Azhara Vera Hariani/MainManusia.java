/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul5;

/**
 *
 * @author AZHARA VERA
 */
public class MainManusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia[] manusia = { new Joko(), new Beni(), new Fani(), new Jani() };

        for (Manusia m : manusia) {
            System.out.println("=====");
            m.berbicara();
            m.bekerja();
            m.makan();
        }
    }
}


  
    

