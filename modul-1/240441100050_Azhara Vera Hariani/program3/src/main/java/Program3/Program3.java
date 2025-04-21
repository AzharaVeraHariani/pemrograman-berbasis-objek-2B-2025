/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Program3;

class anjing {
    String nama;
    String warna;
    int umur;
    
    //constructure
    anjing (String nama, String warna, int umur){
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
    }
    
    //method
    void suara (){
           System.out.println(nama + " menggonggong : guk guk! ");
    }
    
    void panggil() {
        System.out.println("anjing ini bernama " + nama + ", warna " + warna + ", umur " +umur + "tahun.");
    }
}

class kelinci {
    String nama;
    String jenis;
    int umur;
    
    //constructure
    kelinci (String nama, String jenis, int umur){
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }
    
    //method
    void melompat (){
           System.out.println( nama + " Kelinci yang berumur " + umur + " tahun," + " merupakan jenis kelinci " + jenis + "terkenal dengan cara melompatnya yang sangat lincah.");
    }
    
     void makan() {
        System.out.println("Kelinci berjenis " + jenis + " melompat dengan lincah. Umur: " + umur + " tahun.");
    }
}

class kuda {
    String nama ;
    String jenis; 
    int umur; 

    //constructure
    kuda (String nama, String jenis, int umur){
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }
    
    //method
     void berlari() {
        System.out.println("Kuda bernama " + nama + " berumur " + umur + " tahun, berjenis " + jenis + ", dan berlari dengan sangat kencang di padang rumput.");
    }

    void suara() {
        System.out.println("Hiaaa!");
    }
}
    
public class Program3 { 

    public static void main(String[] args) {
        String[] namaanjing = { "doggy", "dody", "Kitty" };
        String[] namakelinci = { "jinji", "camut", "Bubu" };
        String[] namakuda = { "mamut", "tutut", "Galihh" };

        System.out.println("===== Daftar anjing ku =====");
        for (int i = 0; i < 3; i++) {
            anjing kc = new anjing(namaanjing[i], (i % 2 == 0) ? "putih" : "oren", 2 + i);
            kc.panggil(); //memanggil method yang mencetak informasi tentang anjing
            kc.suara();   //meamnggil method suara
            System.out.println();
        }

        System.out.println("===== Daftar kelinci ku =====");
        for (int i = 0; i < 3; i++) {
            kelinci kl = new kelinci(namakelinci[i], (i % 2 == 0) ? "mini lop" : "lokal", 1 + i);
            kl.makan();     // memanggil method yang mencetak informasi kelinci
            kl.melompat();  //memanggil method yang mencetak penjelasan lebih lengkap tentang kelinci, termasuk nama, umur, dan jenis.
            System.out.println();
        }

        System.out.println("===== Daftar kuda ku =====");
        for (int i = 0; i < 3; i++) {
            kuda kd = new kuda(namakuda[i], (i % 2 == 0) ? "kuda balap" : "kuda poni", 1 + i);
            kd.berlari();   //Memanggil method yang menjelaskan bahwa kuda tersebut berlari cepat 
            kd.suara();
            System.out.println();
        }
    }
}