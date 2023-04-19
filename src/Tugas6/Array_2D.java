package Tugas6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_2D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        DEKLARASI
        int totalHarga = 0;
        int jmlBarang = 0;
        int subtotal = 0;
        String nama = null;

//        INPUT PELANGGAN DAN JUMLAH BARANG
        System.out.print("Masukkan Nama Pelanggan : ");
        nama = br.readLine();
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        jmlBarang = Integer.parseInt(br.readLine());

        String[][] nota = new String[jmlBarang][4];

//        PERULANGAN INPUT DATA BARANG
        for(int i = 0; i < jmlBarang; i++) {
            System.out.println("Barang ke-" +(i+1));
            System.out.print("Masukkan nama barang: ");
            nota[i][0] = br.readLine();
            System.out.print("Masukkan Kuantitas Barang: ");
            nota[i][1] = br.readLine();
            System.out.print("Masukkan Harga Satuan barang: ");
            nota[i][2] = br.readLine();

//            MENGHITUNG SUBTOTAL SETIAP BARANG
            subtotal = Integer.parseInt(nota[i][1]) * Integer.parseInt(nota[i][2]);
            nota[i][3] = String.valueOf(subtotal);

//            OUTPUT SUBTOTAL SETIAP BARANG
            System.out.println("Subtotal Barang ke- "+(i+1) + " = " + nota[i][3]);

//            MENGHITUNG TOTAL HARGA KESELURUHAN BARANG
            totalHarga = totalHarga+subtotal;
            System.out.println("===============================");
        }

//        OUTPUT NOTA PENJUALAN
        System.out.println("        NOTA PENJUALAN         ");
        System.out.println("===============================");

        for (int i = 0; i < jmlBarang; i++) {
            System.out.println("Nama Barang ke - "+(i+1)+" = "+nota[i][0]);
            System.out.println("Kuantitas Barang ke - "+(i+1)+" = "+nota[i][1]);
            System.out.println("Harga Satuan Barang ke - "+(i+1)+" = "+nota[i][2]);
            System.out.println("Subtotal Barang ke - "+(i+1)+" = "+nota[i][3]);
            System.out.println("=======================");
        }
        System.out.println("Total Belanja adalah Rp. "+totalHarga);
        System.out.println("==========");

//        INPUT NOMINAL BAYAR
        System.out.print("Masukkan Nominal Pembayaran : ");
        int nominal = Integer.parseInt(br.readLine());
        System.out.println("==========");

//        PERHITUNGAN KEMBALIAN
        int kembalian = nominal - totalHarga;

//        OUTPUT KEMBALIAN UNTUK PELANGGAN
        System.out.println("Kembalian anda adalah Rp. "+kembalian);

    }
}
