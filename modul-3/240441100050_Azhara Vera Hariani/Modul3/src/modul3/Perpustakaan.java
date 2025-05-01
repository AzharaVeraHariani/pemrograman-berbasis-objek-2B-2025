/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul3;

/**
 *
 * @author AZHARA VERA
 */
import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<BukuFiksi> koleksiFiksi;
    private ArrayList<BukuNonFiksi> koleksiNonFiksi;

    public Perpustakaan() {
        koleksiFiksi = new ArrayList<>();
        koleksiNonFiksi = new ArrayList<>();
    }

    public void tambahBukuFiksi(BukuFiksi buku) {
        koleksiFiksi.add(buku);
    }

    public void tambahBukuNonFiksi(BukuNonFiksi buku) {
        koleksiNonFiksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("=== Koleksi Buku Fiksi ===");
        for (BukuFiksi buku : koleksiFiksi) {
            buku.infoFiksi();
        }

        System.out.println("=== Koleksi Buku Non-Fiksi ===");
        for (BukuNonFiksi buku : koleksiNonFiksi) {
            buku.infoNonFiksi();
        }
    }
}
 

