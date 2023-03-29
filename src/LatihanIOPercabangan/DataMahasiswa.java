package LatihanIOPercabangan;

import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStreamReader;

public class DataMahasiswa {
    public static void main(String[] args) {
//        Step 3 deklarasi class BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        Step 4 ( Optional ), deklarasi variabel yang digunakan
        String nim, nama, prodi;
        int semester, jmlSKS;

//        Step 2 error handling
//        try...catch...
        try {
//        Step 5, pengerjaan logika program
            System.out.println("==== Data Mahasiswa ====");
//            ini input
            System.out.print("Masukkan nama anda : ");
            nama = br.readLine();
            System.out.print("Masukkan nim anda : ");
            nim = br.readLine();
            System.out.print("Berapa semester anda : ");
            semester = Integer.parseInt(br.readLine());
            System.out.print("Masukkan jumlah sks anda : ");
            jmlSKS = Integer.parseInt(br.readLine());

//            ini output
            System.out.println("Nama anda adalah : "+nama+"\nNim anda adalah : "+nim+"\nAnda di semester : "+semester+"\nSKS yang anda ambil adalah : "+jmlSKS);

        } catch (Exception ex){
//            Kondisi ketika ada error, apa yang ditampilkan
            System.out.println(ex.getMessage());
            System.out.println("Isian semester dan sks harus angka");
        }

    }
}
