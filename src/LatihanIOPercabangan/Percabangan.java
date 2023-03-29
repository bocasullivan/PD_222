package LatihanIOPercabangan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Percabangan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        if else
//        cek syarat pembuatan KTP
//        int usia = 0;
//        System.out.println("Masukkan usia anda : ");
//        usia = Integer.parseInt(br.readLine());
//        if (usia >= 17 ) {
//            System.out.println("Sudah memenuhi syarat");
//        } else {
//            System.out.println("Tidak memenuhi syarat");
//        }

//        if else if
//        String nim;
//        int nilaiUAS;
//
//        System.out.println("Masukkan NIM anda : ");
//        nim = br.readLine();
//        System.out.println("Masukkan nilai UAS anda : ");
//        nilaiUAS = Integer.parseInt(br.readLine());
//
////        Jik nilai 80,70,65 = lulus, dibawah 65 tidak lulus
//        if (nim.equalsIgnoreCase("22410100001") && nilaiUAS == 80){
//            System.out.println("LULUS DONG");
//        }else if (nim.equalsIgnoreCase("22410100001") && nilaiUAS == 70){
//            System.out.println("LULUS DONG");
//        }else if (nim.equalsIgnoreCase("22410100001") && nilaiUAS == 65){
//            System.out.println("LULUS DONG");
//        } else if (nim.equalsIgnoreCase("22410100001") && nilaiUAS < 65) {
//            System.out.println("TIDAK LULUS GOBLOK");
//        }else {
//            System.out.println("Nilai tidak ditemukan su");
//        }

//        nested if
        String menu, jenis;

        System.out.println("Masukkan menu (makanan/minuman) : ");
        menu = br.readLine();

        if (menu.equalsIgnoreCase("makanan")) {
            System.out.println("Menu makanan : \n- Snack\n- Nasi Bungkus\n Silahkan pilih :");
            jenis = br.readLine();
            if (jenis.equalsIgnoreCase("snack")) {
                System.out.println("Harga 2000");
            } else if (jenis.equalsIgnoreCase("nasi bungkus")) {
                System.out.println("Harga 5000");
            } else {
                System.out.println("Barang tidak ditemukan");

            }
        }else if (menu.equalsIgnoreCase("minuman")) {
            System.out.println("Menu minuman : \n- Kopi\n- Teh\n- Air Mineral\n Silahkan pilih :");
            jenis = br.readLine();
            if (jenis.equalsIgnoreCase("kopi")) {
                System.out.println("Harga 3000");
            } else if (jenis.equalsIgnoreCase("teh")) {
                    System.out.println("Harga 2000");
            } else if (jenis.equalsIgnoreCase("air mineral")) {
                System.out.println("Harga 6000");
            } else {
                System.out.println("Barang tidak tersedias");
            }
        }

        }

//    equals : memperhatikan detil bersar kecilnya huruf ( case sensitive )
//    equalsIgnoreCase : tidak case sensitive
    }
