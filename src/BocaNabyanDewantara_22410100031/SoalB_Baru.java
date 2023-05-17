package BocaNabyanDewantara_22410100031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SoalB_Baru {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalAnggaranHima;
        int AnggaranPerDivisi = 0;
        int jmlDivisi;
        int jmlKegiatanDivisi = 0;
        int anggaranKegiatan = 0;
        int totalAnggaranKegiatan = 0;
        int totalAnggaranDivisi = 0;
        int sisaAnggaranHima = 0;

        String thnPeriode;
        String cariDivisi;


//        Proses 1 : INPUT PERIODE DAN ANGGARAN KESELURUHAN PROKER
        System.out.print("Masukkan tahun periode = ");
        thnPeriode = br.readLine();
        System.out.print("Masukkan Anggaran Keseluruhan = ");
        totalAnggaranHima = Integer.parseInt(br.readLine());

//        Proses 2 : Input kegiatan dan anggaran proker per divisi

//        SOAL 2A
//        INPUT JUMLAH DIVISI
        System.out.print("Masukkan jumlah divisi = ");
        jmlDivisi = Integer.parseInt(br.readLine());

//        INPUT DATA DIVISI
        String[][] dataDivisi = new String[jmlDivisi][3];
        System.out.println("======== DATA DIVISI ========");
        for (int i = 0; i < jmlDivisi; i++) {
            System.out.print("Masukkan Nama Divisi ke - " + (i + 1) + " = ");
            dataDivisi[i][0] = br.readLine();
            System.out.print("Masukkan Jumlah Anggota Divisi ke - " + (i + 1) + " = ");
            dataDivisi[i][1] = br.readLine();
            System.out.print("Masukkan Anggaran Divisi ke - " + (i + 1) + " = ");
            dataDivisi[i][2] = br.readLine();
            AnggaranPerDivisi = Integer.parseInt(dataDivisi[i][2]);
            System.out.println("==== ==== ==== ==== ==== ====");

//                PENGECEKKAN ANGGARAN
            if (totalAnggaranDivisi + AnggaranPerDivisi > totalAnggaranHima) {

                System.out.println("ANGGARAN MELEWATI BATAS");
                System.out.println("Hapus Divisi terakhir dan input ulang");
                totalAnggaranDivisi = totalAnggaranDivisi - AnggaranPerDivisi;
                i--;
            } else {
                totalAnggaranDivisi = totalAnggaranDivisi + AnggaranPerDivisi;
            }
        }
//        SOAL 2B
//        CARI NAMA DIVISI
        System.out.print("Masukkan nama divisi yang ingin diisi kegiatan = ");
        System.out.println();
        cariDivisi = br.readLine();

//        SOAL 2C
//        PENGECEKAN NAMA DIVISI
        String outputNamaDivisi = null;
        for (int i = 0; i < jmlDivisi; i++) {
            if (dataDivisi[i][0].equalsIgnoreCase(cariDivisi)) {
                outputNamaDivisi = dataDivisi[i][0];
                break;
            }
        }
//        SOAL 2D
//        INPUT JUMLAH KEGIATAN DIVISI
        if (outputNamaDivisi != null) {
            System.out.println("DIVISI TERSEDIA !");
            System.out.print("Masukkan jumlah kegiatan Divisi " + outputNamaDivisi + " = ");
            jmlKegiatanDivisi = Integer.parseInt(br.readLine());

//            SOAL 2E
//            INPUT DATA KEGIATAN
            String[][] dataKegiatan = new String[jmlKegiatanDivisi][3];
            for (int i = 0; i < jmlKegiatanDivisi; i++) {
                System.out.print(" Masukkan Nama Kegiatan ke - " + (i + 1) + " = ");
                dataKegiatan[i][0] = br.readLine();
                System.out.print(" Masukkan Bulan Kegiatan ke - " + (i + 1) + " = ");
                dataKegiatan[i][1] = br.readLine();
                System.out.print(" Masukkan Anggaran Kegiatan ke - " + (i + 1) + " = ");
                dataKegiatan[i][2] = br.readLine();
                anggaranKegiatan = Integer.parseInt(dataKegiatan[i][2]);
                System.out.println("==== ==== ==== ==== ==== ====");

//                SOAL 2F
//                PENGECEKKAN ANGGARAN
                if (totalAnggaranKegiatan + anggaranKegiatan > AnggaranPerDivisi) {
                    System.out.println("ANGGARAN MELEWATI BATAS");
                    System.out.println("Hapus kegiatan terakhir dan input ulang");
                    totalAnggaranKegiatan = totalAnggaranKegiatan - anggaranKegiatan;
                    i--;
                } else {
                    totalAnggaranKegiatan = totalAnggaranKegiatan + anggaranKegiatan;
                    sisaAnggaranHima = totalAnggaranHima - totalAnggaranKegiatan;
                }
            }
//            SOAL 2G
//            OUTPUT SEMUA DATA
//                    DATA UMUM
            System.out.println("=======================================");
            System.out.println("======== HIMPUNAN MAHASISWA SI ========");
            System.out.println("=======================================");
            System.out.println();
            System.out.println("Tahun Periode " + thnPeriode);
            System.out.println("Anggaran Keseluruhan Rp. " + totalAnggaranHima);
            System.out.println("Memiliki " + jmlDivisi + " Divisi");
//                    DATA DIVISI
            System.out.println("======== DATA DIVISI ========");
            for (int i = 0; i < jmlDivisi; i++) {
                System.out.println("Nama Divisi ke - " + (i+1) + " adalah " + dataDivisi[i][0]);
                System.out.println(dataDivisi[i][0] + " memilliki anggota berjumlah " + dataDivisi[i][1]);
                System.out.println(dataDivisi[i][0] + " memilliki anggaran divisi sebesar Rp. " + dataDivisi[i][2]);
                System.out.println(dataDivisi[i][0] + " memiliki " + jmlKegiatanDivisi + " program kerja");
//                        DATA KEGIATAN
                System.out.println("======== DATA PROKER ========");
                for (int k = 0; k < jmlKegiatanDivisi; k++) {
                    System.out.println("Program kerja ke - " + (k+1) + " adalah " + dataKegiatan[i][0]);
                    System.out.println(dataKegiatan[i][0] + " dilakukan di bulan " + dataKegiatan[i][1]);
                    System.out.println("Anggaran program kerja " + dataKegiatan[i][1] + " sebesar Rp. " + dataKegiatan[i][2]);
                    System.out.println("Total Anggaran Program Kerja Divisi " + dataDivisi[i][0] + " adalah sebesar Rp. " + totalAnggaranKegiatan);
                    System.out.println("==== ==== ==== ====");
                }
            }
        } else {
            System.out.println("Divisi " + cariDivisi + " Tidak Tersedia !");
        }
        System.out.println("Sisa Anggaran Himpunan Mahasiswa SI adalah sebesar Rp. " + sisaAnggaranHima);

    }
}
