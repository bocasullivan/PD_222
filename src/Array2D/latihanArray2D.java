package Array2D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihanArray2D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] ips = new String[3][4];
        double sks, bobot, totalBobot, jumlahSKS, grandTotal = 0, ip;

        System.out.println(" Masukkan NIM : ");
        String nim = br.readLine();
        System.out.println(" Masukkan Nama : ");
        String nama = br.readLine();


        for (int i = 0; i < ips.length; i++) {
            System.out.println("Nama MK : ");
            ips[i][0] = br.readLine();
            System.out.println("SKS : ");
            ips[i][1] = br.readLine();
            sks = Double.parseDouble(ips[i][1]);
            System.out.println("Bobot : ");
            ips[i][2] = br.readLine();
            bobot = Double.parseDouble(ips[i][1]);

//            Perhitungan IPS
            totalBobot = sks * bobot;

//            Total Bobot per index
            ips[i][3] = String.valueOf(totalBobot);
            System.out.println("Total = " + ips[i][3]);

//            Hitung Grand Total
            grandTotal = grandTotal + totalBobot;

        }
        System.out.println("Grand Total adalah = " + grandTotal);

//        Hitung IP
        System.out.println("Jumlah SKS yang diambil = ");
        jumlahSKS = Integer.parseInt(br.readLine());
        ip = grandTotal/jumlahSKS;
        System.out.println("IP anda adalah = " + ip);


    }
}
