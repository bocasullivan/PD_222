package Tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas3 {
    public static void main(String[] args) throws IOException {

//        DEKLARASI
        double sks = 3;
        double totalSks = 18;
        double totalNilai;
        double IPS;
        String nama;
        String nim;
        int nilai1, nilai2, nilai3, nilai4, nilai5, nilai6;
        String bNilai1, bNilai2, bNilai3, bNilai4, bNilai5, bNilai6;

//        INPUT BOBOT NILAI
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Nama anda : ");
        nama = br.readLine();
        System.out.print("Masukkan NIM anda : ");
        nim = br.readLine();
        System.out.print("Masukkan Bobot Nilai mata kuliah ke - 1 : ");
        nilai1 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Bobot Nilai mata kuliah ke - 2 : ");
        nilai2 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Bobot Nilai mata kuliah ke - 3 : ");
        nilai3 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Bobot Nilai mata kuliah ke - 4 : ");
        nilai4 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Bobot Nilai mata kuliah ke - 5 : ");
        nilai5 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Bobot Nilai mata kuliah ke - 6 : ");
        nilai6 = Integer.parseInt(br.readLine());

//        KONVERSI NILAI KE BOBOT
//        Nilai 1
        if (nilai1 >= 80 && nilai1 <= 100) {
            bNilai1 = "A";
        } else if (nilai1 >= 75 && nilai1 <= 79) {
            bNilai1 = "B+";
        } else if (nilai1 >= 65 && nilai1 <= 74) {
            bNilai1 = "B";
        } else if (nilai1 >= 60 && nilai1 <= 64) {
            bNilai1 = "C+";
        } else if (nilai1 >= 55 && nilai1 <= 59) {
            bNilai1 = "C";
        } else if (nilai1 >= 40 && nilai1 <= 54) {
            bNilai1 = "D";
        } else {
            bNilai1 = "E";
        }

//        Nilai 2
        if (nilai2 >= 80 && nilai2 <= 100) {
            bNilai2 = "A";
        } else if (nilai2 >= 75 && nilai2 <= 79) {
            bNilai2 = "B+";
        } else if (nilai2 >= 65 && nilai2 <= 74) {
            bNilai2 = "B";
        } else if (nilai2 >= 60 && nilai2 <= 64) {
            bNilai2 = "C+";
        } else if (nilai2 >= 55 && nilai2 <= 59) {
            bNilai2 = "C";
        } else if (nilai2 >= 40 && nilai2 <= 54) {
            bNilai2 = "D";
        } else {
            bNilai2 = "E";
        }

//        Nilai 3
        if (nilai3 >= 80 && nilai3 <= 100) {
            bNilai3 = "A";
        } else if (nilai3 >= 75 && nilai3 <= 79) {
            bNilai3 = "B+";
        } else if (nilai3 >= 65 && nilai3 <= 74) {
            bNilai3 = "B";
        } else if (nilai3 >= 60 && nilai3 <= 64) {
            bNilai3 = "C+";
        } else if (nilai3 >= 55 && nilai3 <= 59) {
            bNilai3 = "C";
        } else if (nilai3 >= 40 && nilai3 <= 54) {
            bNilai3 = "D";
        } else {
            bNilai3 = "E";
        }

//        Nilai 4
        if (nilai4 >= 80 && nilai4 <= 100) {
            bNilai4 = "A";
        } else if (nilai4 >= 75 && nilai4 <= 79) {
            bNilai4 = "B+";
        } else if (nilai4 >= 65 && nilai4 <= 74) {
            bNilai4 = "B";
        } else if (nilai4 >= 60 && nilai4 <= 64) {
            bNilai4 = "C+";
        } else if (nilai4 >= 55 && nilai4 <= 59) {
            bNilai4 = "C";
        } else if (nilai4 >= 40 && nilai4 <= 54) {
            bNilai4 = "D";
        } else {
            bNilai4 = "E";
        }

//        Nilai 5
        if (nilai5 >= 80 && nilai5 <= 100) {
            bNilai5 = "A";
        } else if (nilai5 >= 75 && nilai5 <= 79) {
            bNilai5 = "B+";
        } else if (nilai5 >= 65 && nilai5 <= 74) {
            bNilai5 = "B";
        } else if (nilai5 >= 60 && nilai5 <= 64) {
            bNilai5 = "C+";
        } else if (nilai5 >= 55 && nilai5 <= 59) {
            bNilai5 = "C";
        } else if (nilai5 >= 40 && nilai5 <= 54) {
            bNilai5 = "D";
        } else {
            bNilai5 = "E";
        }

//        Nilai 6
        if (nilai6 >= 80 && nilai6 <= 100) {
            bNilai6 = "A";
        } else if (nilai6 >= 75 && nilai6 <= 79) {
            bNilai6 = "B+";
        } else if (nilai6 >= 65 && nilai6 <= 74) {
            bNilai6 = "B";
        } else if (nilai6 >= 60 && nilai6 <= 64) {
            bNilai6 = "C+";
        } else if (nilai6 >= 55 && nilai6 <= 59) {
            bNilai6 = "C";
        } else if (nilai6 >= 40 && nilai6 <= 54) {
            bNilai6 = "D";
        } else {
            bNilai6 = "E";
        }

//        KONVERSI DARI BOBOT HURUF MENJADI BOBOT NILAI
        double kNilai1 = 0, kNilai2 = 0, kNilai3 = 0, kNilai4 = 0, kNilai5 = 0, kNilai6 = 0;

//        NILAI MATKUL KE - 1
        if (bNilai1 == "A") {
            kNilai1 = 4.0;
        } else if (bNilai1 == "B+") {
            kNilai1 = 3.50;
        } else if (bNilai1 == "B") {
            kNilai1 = 3.0;
        } else if (bNilai1 == "C+") {
            kNilai1 = 2.50;
        } else if (bNilai1 == "C") {
            kNilai1 = 2.0;
        } else if (bNilai1 == "D") {
            kNilai1 = 1.0;
        } else {
            kNilai1 = 0.0;
        }

        //        NILAI MATKUL KE - 2
        if (bNilai2 == "A") {
            kNilai2 = 4.0;
        } else if (bNilai2 == "B+") {
            kNilai2 = 3.50;
        } else if (bNilai2 == "B") {
            kNilai2 = 3.0;
        } else if (bNilai2 == "C+") {
            kNilai2 = 2.50;
        } else if (bNilai2 == "C") {
            kNilai2 = 2.0;
        } else if (bNilai2 == "D") {
            kNilai2 = 1.0;
        } else {
            kNilai2 = 0.0;
        }

//        NILAI MATKUL KE - 3
        if (bNilai3 == "A") {
            kNilai3 = 4.0;
        } else if (bNilai3 == "B+") {
            kNilai3 = 3.50;
        } else if (bNilai3 == "B") {
            kNilai3 = 3.0;
        } else if (bNilai3 == "C+") {
            kNilai3 = 2.50;
        } else if (bNilai3 == "C") {
            kNilai3 = 2.0;
        } else if (bNilai3 == "D") {
            kNilai3 = 1.0;
        } else {
            kNilai3 = 0.0;
        }

//        NILAI MATKUL KE - 4
        if (bNilai4 == "A") {
            kNilai4 = 4.0;
        } else if (bNilai4 == "B+") {
            kNilai4 = 3.50;
        } else if (bNilai4 == "B") {
            kNilai4 = 3.0;
        } else if (bNilai4 == "C+") {
            kNilai4 = 2.50;
        } else if (bNilai4 == "C") {
            kNilai4 = 2.0;
        } else if (bNilai4 == "D") {
            kNilai4 = 1.0;
        } else {
            kNilai4 = 0.0;
        }

//        NILAI MATKUL KE - 5
        if (bNilai5 == "A") {
            kNilai5 = 4.0;
        } else if (bNilai5 == "B+") {
            kNilai5 = 3.50;
        } else if (bNilai5 == "B") {
            kNilai5 = 3.0;
        } else if (bNilai5 == "C+") {
            kNilai5 = 2.50;
        } else if (bNilai5 == "C") {
            kNilai5 = 2.0;
        } else if (bNilai5 == "D") {
            kNilai5 = 1.0;
        } else {
            kNilai5 = 0.0;
        }

//        NILAI MATKUL KE - 6
        if (bNilai6 == "A") {
            kNilai6 = 4.0;
        } else if (bNilai6 == "B+") {
            kNilai6 = 3.50;
        } else if (bNilai6 == "B") {
            kNilai6 = 3.0;
        } else if (bNilai6 == "C+") {
            kNilai6 = 2.50;
        } else if (bNilai6 == "C") {
            kNilai6 = 2.0;
        } else if (bNilai6 == "D") {
            kNilai6 = 1.0;
        } else {
            kNilai6 = 0.0;
        }

//        Total Nilai
        totalNilai = kNilai1 * sks + kNilai2 * sks + kNilai3 * sks + kNilai4 * sks + kNilai5 * sks + kNilai6 * sks;
        IPS = totalNilai / totalSks;

//        OUTPUT HASIL STUDI MAHASISWA
        System.out.println(" ");
        System.out.println("===== HASIL STUDI =====");
        System.out.println("Nama Mahasiswa adalah " + nama + "\nNIM Mahasiswa adalah " + nim);
        System.out.println("\nBobot Nilai mata kuliah ke - 1 anda adalah : "+bNilai1+"\nBobot Nilai mata kuliah ke - 2 anda adalah : "+bNilai2+"\nBobot Nilai mata kuliah ke - 3 anda adalah : "+bNilai3+"\nBobot Nilai mata kuliah ke - 4 anda adalah : "+bNilai4+"\nBobot Nilai mata kuliah ke - 5 anda adalah : "+bNilai5+"\nBobot Nilai mata kuliah ke - 6 anda adalah : "+bNilai6);
        System.out.print("Indeks Prestasi Semester " + nama + " adalah : " + IPS);

//        Percabangan pengambilan SKS
        if (IPS < 2.00) {
            System.out.println("\nMaksimal SKS yang bisa anda ambil adalah 18 SKS");
        } else if (IPS >= 2.00 && IPS <= 2.99) {
            System.out.println("\nMaksimal SKS yang bisa anda ambil adalah 20 SKS");
        } else if (IPS >= 3.00 && IPS <= 3.49) {
            System.out.println("\nMaksimal SKS yang bisa anda ambil adalah 22 SKS");
        } else if (IPS >= 3.50) {
            System.out.println("\nMaksimal SKS yang bisa anda ambil adalah 24 SKS");
        }
    }
}
