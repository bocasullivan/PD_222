package Tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas3 {
    public static void main(String[] args) throws IOException {

//        DEKLARASI
        double totalSks = 18;
        double totalNilai;
        double IPS;
        String nama;
        String nim;

//        RUMUS IPS = (SKS per matkul x nilai bobot mhs)/total sks

//        INPUT BOBOT NILAI
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Nama anda : ");
        nama = br.readLine();
        System.out.print("Masukkan NIM anda : ");
        nim = br.readLine();
        System.out.print("Masukkan Bobot Nilai mata kuliah ke - 1 (A/A-/B/B+/B-/C/C+/C-/D/E) : ");
        String nilai1 = br.readLine();
        System.out.print("Masukkan Bobot Nilai mata kuliah ke - 2 (A/A-/B/B+/B-/C/C+/C-/D/E) : ");
        String nilai2 = br.readLine();
        System.out.print("Masukkan Bobot Nilai mata kuliah ke - 3 (A/A-/B/B+/B-/C/C+/C-/D/E) : ");
        String nilai3 = br.readLine();
        System.out.print("Masukkan Bobot Nilai mata kuliah ke - 4 (A/A-/B/B+/B-/C/C+/C-/D/E) : ");
        String nilai4 = br.readLine();
        System.out.print("Masukkan Bobot Nilai mata kuliah ke - 5 (A/A-/B/B+/B-/C/C+/C-/D/E) : ");
        String nilai5 = br.readLine();
        System.out.print("Masukkan Bobot Nilai mata kuliah ke - 6 (A/A-/B/B+/B-/C/C+/C-/D/E) : ");
        String nilai6 = br.readLine();

//        Konversi Bobot menjadi nilai angka
        double  kNilai1 = 0,
                kNilai2 = 0,
                kNilai3 = 0,
                kNilai4 = 0,
                kNilai5 = 0,
                kNilai6 = 0;

//        NILAI MATKUL KE - 1
        if (nilai1.equalsIgnoreCase("A")) {
            kNilai1 = 4.0;
        } else if (nilai1.equalsIgnoreCase("A-")) {
            kNilai1 = 3.70;
        } else if (nilai1.equalsIgnoreCase("B+")) {
            kNilai1 = 3.50;
        } else if (nilai1.equalsIgnoreCase("B")) {
            kNilai1 = 3.0;
        } else if (nilai1.equalsIgnoreCase("B-")) {
            kNilai1 = 2.70;
        } else if (nilai1.equalsIgnoreCase("C+")) {
            kNilai1 = 2.50;
        } else if (nilai1.equalsIgnoreCase("C")) {
            kNilai1 = 2.0;
        } else if (nilai1.equalsIgnoreCase("C-")) {
            kNilai1 = 1.70;
        } else if (nilai1.equalsIgnoreCase("D")) {
            kNilai1 = 1.0;
        }else if (nilai1.equalsIgnoreCase("E")) {
            kNilai1 = 0.0;
        }else {
            System.out.println("Nilai Tidak Valid !");
        }

//          NILAI MATKUL KE - 2
        if (nilai2.equalsIgnoreCase("A")) {
            kNilai2 = 4.0;
        } else if (nilai2.equalsIgnoreCase("A-")) {
            kNilai1 = 3.70;
        } else if (nilai2.equalsIgnoreCase("B+")) {
            kNilai2 = 3.50;
        } else if (nilai2.equalsIgnoreCase("B")) {
            kNilai2 = 3.0;
        } else if (nilai2.equalsIgnoreCase("B-")) {
            kNilai2 = 2.70;
        } else if (nilai2.equalsIgnoreCase("C+")) {
            kNilai2 = 2.50;
        } else if (nilai2.equalsIgnoreCase("C")) {
            kNilai2 = 2.0;
        } else if (nilai2.equalsIgnoreCase("C-")) {
            kNilai2 = 1.70;
        } else if (nilai2.equalsIgnoreCase("D")) {
            kNilai2 = 1.0;
        } else if (nilai2.equalsIgnoreCase("E")) {
            kNilai2 = 0.0;
        } else {
            System.out.println("Nilai Tidak Valid !");
        }

//        NILAI MATKUL KE - 3
        if (nilai3.equalsIgnoreCase("A")) {
            kNilai3 = 4.0;
        } else if (nilai3.equalsIgnoreCase("A-")) {
            kNilai3 = 3.70;
        } else if (nilai3.equalsIgnoreCase("B+")) {
            kNilai3 = 3.50;
        } else if (nilai3.equalsIgnoreCase("B")) {
            kNilai3 = 3.0;
        } else if (nilai3.equalsIgnoreCase("B-")) {
            kNilai3 = 2.70;
        } else if (nilai3.equalsIgnoreCase("C+")) {
            kNilai3 = 2.50;
        } else if (nilai3.equalsIgnoreCase("C")) {
            kNilai3 = 2.0;
        } else if (nilai3.equalsIgnoreCase("C-")) {
            kNilai3 = 1.70;
        } else if (nilai3.equalsIgnoreCase("D")) {
            kNilai3 = 1.0;
        } else if (nilai3.equalsIgnoreCase("E")) {
            kNilai3 = 0.0;
        } else {
            System.out.println("Nilai Tidak Valid !");
        }

//        NILAI MATKUL KE - 4
        if (nilai4.equalsIgnoreCase("A")) {
            kNilai4 = 4.0;
        } else if (nilai4.equalsIgnoreCase("A-")) {
            kNilai4 = 3.70;
        } else if (nilai4.equalsIgnoreCase("B+")) {
            kNilai4 = 3.50;
        } else if (nilai4.equalsIgnoreCase("B")) {
            kNilai4 = 3.0;
        } else if (nilai4.equalsIgnoreCase("B-")) {
            kNilai4 = 2.70;
        } else if (nilai4.equalsIgnoreCase("C+")) {
            kNilai4 = 2.50;
        } else if (nilai4.equalsIgnoreCase("C")) {
            kNilai4 = 2.0;
        } else if (nilai4.equalsIgnoreCase("C-")) {
            kNilai4 = 1.70;
        } else if (nilai4.equalsIgnoreCase("D")) {
            kNilai4 = 1.0;
        } else if (nilai4.equalsIgnoreCase("E")) {
            kNilai4 = 0.0;
        } else {
            System.out.println("Nilai Tidak Valid !");
        }

//        NILAI MATKUL KE - 5
        if (nilai5.equalsIgnoreCase("A")) {
            kNilai5 = 4.0;
        } else if (nilai5.equalsIgnoreCase("A-")) {
            kNilai5 = 3.70;
        } else if (nilai5.equalsIgnoreCase("B+")) {
            kNilai5 = 3.50;
        } else if (nilai5.equalsIgnoreCase("B")) {
            kNilai5 = 3.0;
        } else if (nilai5.equalsIgnoreCase("B-")) {
            kNilai5 = 2.70;
        } else if (nilai5.equalsIgnoreCase("C+")) {
            kNilai5 = 2.50;
        } else if (nilai5.equalsIgnoreCase("C")) {
            kNilai5 = 2.0;
        } else if (nilai5.equalsIgnoreCase("C-")) {
            kNilai5 = 1.70;
        } else if (nilai5.equalsIgnoreCase("D")) {
            kNilai5 = 1.0;
        } else if (nilai5.equalsIgnoreCase("E")) {
            kNilai5 = 0.0;
        } else {
            System.out.println("Nilai Tidak Valid !");
        }

//        NILAI MATKUL KE - 6
        if (nilai6.equalsIgnoreCase("A")) {
            kNilai6 = 4.0;
        } else if (nilai6.equalsIgnoreCase("A-")) {
            kNilai6 = 3.70;
        } else if (nilai6.equalsIgnoreCase("B+")) {
            kNilai6 = 3.50;
        } else if (nilai6.equalsIgnoreCase("B")) {
            kNilai6 = 3.0;
        } else if (nilai6.equalsIgnoreCase("B-")) {
            kNilai6 = 2.70;
        } else if (nilai6.equalsIgnoreCase("C+")) {
            kNilai6 = 2.50;
        } else if (nilai6.equalsIgnoreCase("C")) {
            kNilai6 = 2.0;
        } else if (nilai6.equalsIgnoreCase("C-")) {
            kNilai6 = 1.70;
        } else if (nilai6.equalsIgnoreCase("D")) {
            kNilai6 = 1.0;
        }else if (nilai6.equalsIgnoreCase("E")) {
            kNilai6 = 0.0;
        }else {
            System.out.println("Nilai Tidak Valid !");
        }


//        Total Nilai
        totalNilai = kNilai1 * 3 + kNilai2 * 3 + kNilai3 * 3 + kNilai4 * 3 + kNilai5 * 3 + kNilai6 * 3;
        IPS = totalNilai/totalSks;

//        OUTPUT HASIL STUDI MAHASISWA
        System.out.println(" ");
        System.out.println("===== HASIL STUDI =====");
        System.out.print("Nama Mahasiswa adalah "+nama+"\nNIM Mahasiswa adalah "+nim+"\nIndeks Prestasi Semester "+nama+ " adalah : " + IPS);

//        Percabangan pengambilan SKS
        if (IPS < 2.00 ){
            System.out.println("\nMaksimal SKS yang bisa anda ambil adalah 18 SKS");
        } else if (IPS >= 2.00 && IPS <=2.99) {
            System.out.println("\nMaksimal SKS yang bisa anda ambil adalah 20 SKS");
        } else if (IPS >= 3.00 && IPS <=3.49) {
            System.out.println("\nMaksimal SKS yang bisa anda ambil adalah 22 SKS");
        } else if (IPS >= 3.50) {
            System.out.println("\nMaksimal SKS yang bisa anda ambil adalah 24 SKS");
        }
    }
}
