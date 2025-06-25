/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author AZHARA VERA
 */
import java.util.ArrayList;

public class ManajemenMobil {
    private ArrayList<Mobil> daftarMobil = new ArrayList<>();

    public void tambahMobil(Mobil mobil) {
        daftarMobil.add(mobil);
    }

    public void operasikanSemuaMobil() {
        System.out.println("\n--- Mengoperasikan Semua Mobil ---");
        for (Mobil mobil : daftarMobil) {
            mobil.nyalakanMesin();
            mobil.matikanMesin();
        }
    }
}

   

