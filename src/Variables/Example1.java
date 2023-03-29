package Variables;

public class Example1 {
    public static void main (String[]args) {
        //ini komentar untuk 1 baris
        System.out.println("Hello world");

        /* ini komentar untuk banyak baris
        System.out.println("Ini belajar pertamaku");
        System.out.println("MK Pemrograman Dasar");
        System.out.println("Jam 07:30 - 10:50");
        */


        //contoh implementasi dari beberapa tipe data
        int usia = 22; //integer cocok untuk data angka
        float uangJajan = 20000; //float lebih cocok untuk data nominal uang
        double luasPersegi = 20; //double lebih cocok digunakan untuk fungsi-fungsi matematika

        char ch1 = 88; //char menggunakan unicode*. *Latin, Greek, kode ASCII, dsb.
        char ch2 = 'Y';

        boolean b = true;

        System.out.println("Ini adalah hasil cetak usia " + usia );
        System.out.println("Ini adalah hasil cetak uangJajan " + uangJajan );
        System.out.println("Ini adalah hasil cetak luasPersegi " + luasPersegi );
        System.out.println("Ini adalah hasil cetak ch1 " + ch1 );
        System.out.println("Ini adalah hasil cetak ch2 " + ch2 );
        System.out.println("Ini adalah hasil cetak b " + b );

        System.out.println("Ini adalah hasil cetak dengan Character Escape \n" + usia + "\n" + uangJajan);
    }
}
