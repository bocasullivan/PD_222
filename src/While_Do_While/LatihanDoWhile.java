package While_Do_While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LatihanDoWhile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
//        int nim, i = 0;
//        String nama;
//
//        do {
//            System.out.println("Entry NIM anda = ");
//            nim = Integer.parseInt(br.readLine());
//            System.out.println("Entri nama = ");
//            nama = br.readLine();
//            i++;
//        }while (i < 5);

//        Membuat program dengan menu
//        1. entri mahasiswa (nim, nama, prodi, dan MK )
//        2. hitung nilai mahasiswa ( UTS, UAS, TUGAS )
//        3. lihat rapor mahasiswa
//        4. keluar program

//        DEKLARASI
        String namaMhs = "", nimMhs = "", prodi = "", mk = "", cari="", pNilai;
        int pilihan, uts, uas, tugas;
        double nUTS, nUAS, nTugas, na = 0;



        while (true){
//            MEMBERI LIST LAYANAN
            System.out.println("PILIH MENU LAYANAN");
            System.out.println("1. Entry Mahasiswa");
            System.out.println("2. Hitung Nilai Mahasiswa");
            System.out.println("3. Lihat Raport Mahasiswa");
            System.out.println("4. Keluar Program");
            System.out.println(" ");
//            INPUT PILIHAN USER
            System.out.println("SILAHKAN PILIH : ");
            pilihan = Integer.parseInt(br.readLine());
//            MENGGUNAKAN SWITCH CASE
            switch (pilihan){
                case 1:
                    System.out.println("======== LAYANAN MAHASISWA ========");
                    System.out.println(" ");
                    System.out.print("Masukkan Nama Mahasiswa : ");
                    namaMhs = br.readLine();
                    System.out.print("Masukkan NIM Mahasiswa : ");
                    nimMhs = br.readLine();
                    System.out.print("Masukkan Program Studi mahasiswa : ");
                    prodi = br.readLine();
                    System.out.print("Masukkan Mata Kuliah Mahasiswa : ");
                    mk = br.readLine();
                    System.out.println();
//                    OUTPUT
                    System.out.println("======== OUTPUT DATA ========");
                    System.out.println();
                    System.out.println("Nama mahasiswa adalah : "+namaMhs);
                    System.out.println("NIM mahasiswa adalah : "+nimMhs);
                    System.out.println("Program Studi "+namaMhs+" adalah : "+prodi);
                    System.out.println("Mata Kuliah yang diambil "+namaMhs+" adalah : "+mk);
                    System.out.println();
                    System.out.println("======== TERIMAKASIH ========");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("======== HITUNG NILAI MAHASISWA ========");
                    System.out.println();
//                    Hitung nilai akhir ( 30% x uts + 30% x uas + 40% x tugas )
                    System.out.println("Cari berdasarkan NIM : ");
                    cari = br.readLine();
                    if (cari.equalsIgnoreCase(nimMhs)){
                        System.out.println("Masukkan Nilai UTS anda : ");
                        uts = Integer.parseInt(br.readLine());
                        System.out.println("Masukkan Nilai UAS anda : ");
                        uas = Integer.parseInt(br.readLine());
                        System.out.println("Masukkan Nilai TUGAS anda : ");
                        tugas = Integer.parseInt(br.readLine());
//                    PERHITUNGAN NILAI
                        nUTS = 0.3*uts;
                        nUAS = 0.3*uas;
                        nTugas = 0.4*tugas;
                        na = nUTS + nUAS + nTugas;

                        System.out.println("Nilai UTS anda adalah "+nUTS);
                        System.out.println("Nilai UAS anda adalah "+nUAS);
                        System.out.println("Nilai TUGAS anda adalah "+nTugas);
                        System.out.println();
                        System.out.println("Nilai Akhir anda adalah "+na);
                        System.out.println();
                        System.out.println("======== TERIMAKASIH ========");
                        System.out.println();
                    }else {
                        System.out.println("======== DATA TIDAK DITEMUKAN ========");
                    }
                    break;
//                    CASE LIHAT RAPORT
                case 3:
                    System.out.println("======== LIHAT RAPORT MAHASISWA ========");
                    System.out.println();
//                    FITUR CARI BERDASARKAN NIM
                    System.out.println("Cari nilai berdasarkan NIM : ");
                    cari = br.readLine();
//                    PERCABANGAN MENENTUKAN NIM YANG TERDAFTAR
                    if (cari.equalsIgnoreCase(nimMhs)){
                        System.out.println("Nama Mahasiswa : " +namaMhs);
                        System.out.println("NIM Mahasiswa : " +nimMhs);
                        System.out.println("Program Studi " +namaMhs+" adalah : " +prodi);
                        System.out.println("Mata Kuliah " +namaMhs+ " adalah : " +prodi);
                        System.out.println("Nilai akhir "+mk+" dari "+namaMhs+" adalah : "+na);
                        System.out.println();
                        if (na >= 80 && na <=100){
                            pNilai = "A";
                        } else if (na >= 75 && na <=79) {
                            pNilai = "B+";
                        } else if (na >= 65 && na <=74) {
                            pNilai = "B";
                        } else if (na >= 60 && na <=64) {
                            pNilai = "C+";
                        }else {
                            pNilai = "C";
                        }
                        System.out.println("Predikat Nilai "+namaMhs+" adalah "+pNilai);
                        System.out.println();
                        System.out.println("======== TERIMAKASH =========");
                        System.out.println();
                    }else {
                        System.out.println();
                        System.out.println("======== Data tidak ditemukan ========");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("======== ANDA TELAH KELUAR PROGRAM ========");
                    System.exit(0);
                    break;

                default:
                    System.out.println("PILIHAN SALAH ! SILAHKAN PILIH LAGI");
                    System.out.println();
                    break;
            }


        }
    }
}
