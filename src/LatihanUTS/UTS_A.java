package LatihanUTS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UTS_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        DEKLARASI
        int jumlahMhs, sksMaks, totalSks = 0, jumlahMK = 10, sksMK;
        double ipsMhs = 0;
        String cari, outputNamaMhs, outputProdiMhs, outputSemesterMhs, outputIpsMhs, outputNimMhs;

//        SOAL NO 1
        System.out.println("Masukkan jumlah mahasiswa = ");
        jumlahMhs = Integer.parseInt(br.readLine());

        String[][] dataMhs = new String[jumlahMhs][5];
        String[][] dataMK = new String[jumlahMK][3];
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Masukkan NIM Mahasiswa ke - " + (i+1) + " = ");
            dataMhs[i][0] = br.readLine();
            System.out.println("Masukkan Nama Mahasiswa ke - " + (i+1) + " = ");
            dataMhs[i][1] = br.readLine();
            System.out.println("Masukkan Prodi Mahasiswa ke - " + (i+1) + " = ");
            dataMhs[i][2] = br.readLine();
            System.out.println("Masukkan Semester Mahasiswa ke - " + (i+1) + " = ");
            dataMhs[i][3] = br.readLine();
            System.out.println("Masukkan IPS Mahasiswa ke - " + (i+1) + " = ");
            dataMhs[i][4] = br.readLine();
            ipsMhs = Double.parseDouble(dataMhs[i][4]);
            System.out.println("==== ==== ==== ==== ==== ==== ====");
        }

//        SOAL NO 2 A
        System.out.println("Masukkan NIM untuk mencari data mahasiswa = ");
        cari = br.readLine();
        System.out.println("==== ==== ==== ==== ==== ==== ====");

        outputNamaMhs = null;
        outputProdiMhs = null;
        outputSemesterMhs = null;
        outputIpsMhs = null;
        outputNimMhs = null;
        for (int i = 0; i < jumlahMhs; i++) {
            if (dataMhs[i][0].equalsIgnoreCase(cari)){
                outputNimMhs = dataMhs[i][0];
                outputNamaMhs = dataMhs[i][1];
                outputProdiMhs = dataMhs[i][2];
                outputSemesterMhs = dataMhs[i][3];
                outputIpsMhs = dataMhs[i][4];
            }
        }

//        SOAL NO 2 B
        if (outputNamaMhs != null){
            System.out.println("Nama Mahasiswa = " + outputNamaMhs);
            System.out.println("Program Studi Mahasiswa = " + outputProdiMhs);
            System.out.println("Semester Mahasiswa = " + outputSemesterMhs);
            System.out.println("IPS Mahasiswa = " + outputIpsMhs);

//          SOAL NO 2 C
            if (ipsMhs >= 3.50){
                sksMaks = 24;
            }else if (ipsMhs >= 3.00 && ipsMhs <= 3.49){
                sksMaks = 22;
            } else if (ipsMhs >= 2.00 && ipsMhs <= 2.99) {
                sksMaks = 20;
            }else {
                sksMaks = 18;
            }
            System.out.println("SKS yang dapat diambil adalah " + sksMaks + " SKS");
            System.out.println("==== ==== ==== ==== ==== ==== ====");

//            SOAL NO 2 D
            for (int i = 0; i < jumlahMK; i++){
                System.out.println("Masukkan Nama Mata Kuliah ke " + (i+1) + " = ");
                dataMK[i][0] = br.readLine();
                System.out.println("Masukkan SKS Mata Kuliah ke " + (i+1) + " = ");
                dataMK[i][1] = br.readLine();
                sksMK = Integer.parseInt(dataMK[i][1]);
                System.out.println("Masukkan Hari dan Jam Mata Kuliah ke " + (i+1) + " = ");
                dataMK[i][2] = br.readLine();
                System.out.println("==== ==== ==== ==== ==== ====");

                totalSks = totalSks + sksMK;

//                OUTPUT SEMUA DATA
                if (totalSks >= sksMaks){
                    System.out.println();
                    System.out.println("=============================");
                    System.out.println("======== OUTPUT DATA ========");
                    System.out.println("=============================");
                    System.out.println();
                    System.out.println("NIM Mahasiswa = " + outputNimMhs);
                    System.out.println("Nama Mahasiswa = " + outputNamaMhs);
                    System.out.println("Program Studi Mahasiswa = " + outputProdiMhs);
                    System.out.println("Semester Mahasiswa = " + outputSemesterMhs);
                    System.out.println("IPS Mahasiswa = " + outputIpsMhs);
                    System.out.println("SKS Maksimal Mahasiswa = " + sksMaks);
                    System.out.println("==== ==== ==== ==== ==== ====");
                    for (int j = 0; j <= i; j++) {
                        System.out.println("Mata Kuliah ke - " + (j+1) + " = " + dataMK[j][0]);
                        System.out.println("SKS Mata Kuliah ke - " + (j+1) + " = " + dataMK[j][1]);
                        System.out.println("Hari dan Jam Mata Kuliah ke - " + (j+1) + " = " + dataMK[j][2]);
                        System.out.println("==== ==== ==== ==== ==== ====");
                    }
                    break;
                }
            }
        }else {
            System.out.println("Data Tidak Ditemukan !");
        }
    }
}
