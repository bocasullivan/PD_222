package Tugas10;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Tugas10 {
    public static void main(String[] args) throws IOException {
//        CONTOH 1
        Queue<String> pesanan = new LinkedList<>();

        // Menambahkan pesanan ke antrian
        pesanan.add("Pesanan 1");
        pesanan.add("Pesanan 2");
        pesanan.add("Pesanan 3");

        // Memproses pesanan berdasarkan urutan antrian
        while (!pesanan.isEmpty()) {
            String order = pesanan.poll();
            System.out.println("Memproses pesanan: " + order);
        }

//        CONTOH 2
        Queue<String> pasien = new LinkedList<>();

        // Menambahkan elemen ke dalam queue
        pasien.add("Pasien 1");
        pasien.add("Pasien 2");
        pasien.add("Pasien 3");

        System.out.println("Isi awal antrian pasien: " + pasien);

        // Mengakses pasien pertama dalam queue tanpa menghapusnya
        String pasienPertama = pasien.peek();
        System.out.println("Elemen pertama dalam queue: " + pasienPertama);

        // Menghapus pasien pertama dari queue
        String hapusPasien = pasien.poll();
        System.out.println("Elemen yang dihapus: " + hapusPasien);

        System.out.println("Isi setelah penghapusan: " + pasien);
    }
}
