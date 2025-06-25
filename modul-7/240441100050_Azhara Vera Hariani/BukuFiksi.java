/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AZHARA VERA
 */
public class BukuFiksi extends Buku implements Peminjaman, Reservasi {

    public BukuFiksi(String judul, String pengarang) {
        super(judul, pengarang);
    }

    @Override
    public void pinjam(String namaPeminjam) {
        System.out.println("Buku fiksi \"" + judul + "\" dipinjam oleh " + namaPeminjam);
    }

    @Override
    public void reservasi(String namaPemesan) {
        System.out.println("Buku fiksi \"" + judul + "\" direservasi oleh " + namaPemesan);
    }
}

