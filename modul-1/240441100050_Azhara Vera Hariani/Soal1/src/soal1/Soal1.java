package Soal1;

class Manusia {
    private String nama;
    private int umur;
    private String alamat;

    public Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    public void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }

    public void berlari() {
        System.out.println(nama + " sedang berlari.");
    }
}

public class Soal1 {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("Vera", 19, "Mojokerto");
        Manusia manusia2 = new Manusia("Saka", 25, "Bandung");
        Manusia manusia3 = new Manusia("Nara", 22, "Surabaya");
        Manusia manusia4 = new Manusia("jesica", 28, "Yogyakarta");
        Manusia manusia5 = new Manusia("Davi", 35, "Malang");

        manusia1.berjalan();
        manusia2.berlari();
        manusia3.berjalan();
        manusia4.berlari();
        manusia5.berjalan();
    }
}
