/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AZHARA VERA
 */
public class Bank {
    private RekeningBank[] daftarRekening;
    private int jumlahRekening;

    public Bank(int kapasitas) {
        daftarRekening = new RekeningBank[kapasitas];
        jumlahRekening = 0;
    }

    public void tambahRekening(RekeningBank rekening) {
        if (jumlahRekening < daftarRekening.length) {
            daftarRekening[jumlahRekening] = rekening;
            jumlahRekening++;
        } else {
            System.out.println("Kapasitas bank penuh, tidak bisa menambahkan rekening lagi.");
        }
    }

    public RekeningBank cariRekening(String noRek) {
        for (int i = 0; i < jumlahRekening; i++) {
            if (daftarRekening[i].getNoRekening().equals(noRek)) {
                return daftarRekening[i];
            }
        }
        return null;
    }

    public void setor(String noRek, double jumlah) {
        RekeningBank r = cariRekening(noRek);
        if (r != null) {
            r.setor(jumlah);
            System.out.println("Setor berhasil ke rekening " + noRek);
        } else {
            System.out.println("Rekening tidak ditemukan.");
        }
    }

    public void tarik(String noRek, double jumlah) {
        RekeningBank r = cariRekening(noRek);
        if (r != null) {
            if (r.tarik(jumlah)) {
                System.out.println("Penarikan berhasil dari rekening " + noRek);
            } else {
                System.out.println("Saldo tidak cukup.");
            }
        } else {
            System.out.println("Rekening tidak ditemukan.");
        }
    }

    public void tampilkanSemuaRekening() {
        if (jumlahRekening == 0) {
            System.out.println("Belum ada rekening.");
        } else {
            System.out.println("\n=== Daftar Semua Rekening ===");
            for (int i = 0; i < jumlahRekening; i++) {
                daftarRekening[i].tampilkanInfo();
            }
        }
    }
}

