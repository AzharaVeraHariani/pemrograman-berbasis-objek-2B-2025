/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AZHARA VERA
 */

import java.util.ArrayList;

public class Klinik {
    private ArrayList<Pasien> daftarPasien;

    public Klinik() {
        daftarPasien = new ArrayList<>();
    }

    public void tambahPasien(Pasien pasien) {
        daftarPasien.add(pasien);
        System.out.println("Pasien berhasil ditambahkan.");
    }

    public void tampilkanSemuaPasien() {
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada pasien yang terdaftar.");
        } else {
            System.out.println("\n=== DAFTAR PASIEN ===");
            for (Pasien p : daftarPasien) {
                p.tampilkanInfo();
            }
        }
    }
}


