/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AZHARA VERA
 */
public class BukuReferensi extends Buku implements Reservasi {

    public BukuReferensi(String judul, String pengarang) {
        super(judul, pengarang);
    }

    @Override
    public void reservasi(String namaPemesan) {
        System.out.println("Buku referensi \"" + judul + "\" direservasi oleh " + namaPemesan);
    }

    // Tidak bisa dipinjam
}

