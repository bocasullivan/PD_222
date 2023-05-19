package LatihanUTS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LatPerpus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int jumlah, jmlBukuPinjam = 0,jmlBukuKembali, tglBukuKembali = 0, tanggalKembaliBuku, jmlHariTelat,  denda;
        String cari, outputNamaMahasiswa, kodeBukuKembali, outputNamaBuku;

        System.out.print("Masukkan jumlah peminjam = ");
        jumlah = Integer.parseInt(br.readLine());

        String[][] dataMahasiswa = new String[jumlah][3];
        String[][] dataBuku = new String[100][4];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("NIM Mahasiswa ke - " + (i+1) + " = ");
            dataMahasiswa[i][0] = br.readLine();
            System.out.println("Nama Mahasiswa ke - " + (i+1) + " = ");
            dataMahasiswa[i][1] = br.readLine();
            System.out.println("Jumlah buku yang dipinjam = ");
            dataMahasiswa[i][2] = br.readLine();
            jmlBukuPinjam = Integer.parseInt(dataMahasiswa[i][2]);
            System.out.println("==== ==== ==== ====");


            for (int j = 0; j < jmlBukuPinjam; j++) {
                System.out.println("Kode buku ke - " + (j+1) + " = ");
                dataBuku[j][0] = br.readLine();
                System.out.println("Nama buku ke - " + (j+1) + " = ");
                dataBuku[j][1] = br.readLine();
                System.out.println("Tanggal pinjam (DDMMYY) buku ke - " + (j+1) + " = ");
                dataBuku[j][2] = br.readLine();
                System.out.println("Batas kembali adalah 3 hari setelah peminjaman buku dan tidak melebihi bulan yang sama");
                System.out.println("Tanggal kembali (DDMMYY) buku ke - " + (j+1) + " = ");
                dataBuku[j][3] = br.readLine();
                tglBukuKembali = Integer.parseInt(dataBuku[j][3].substring(0,2));
            }
        }

//        PENGEMBALIAN BUKU
        System.out.println("==== PENGEMBALIAN BUKU ====");
        System.out.println("Apabila pengembalian buku melewati batas waktu, denda per buku adalah Rp.500/hari");

        System.out.println("NIM Mahasiswa Peminjam = ");
        cari = br.readLine();

        outputNamaMahasiswa = null;
        outputNamaBuku = null;
        for (int i = 0; i < jumlah; i++) {
            if (dataMahasiswa[i][0].equalsIgnoreCase(cari)){
                outputNamaMahasiswa = dataMahasiswa[i][1];
                break;
            }
        }

        if (outputNamaMahasiswa != null){
            System.out.println("Nama Peminjam = " + outputNamaMahasiswa);
            System.out.println("Jumlah buku kembali = ");
            jmlBukuKembali = Integer.parseInt(br.readLine());
            if (jmlBukuPinjam == jmlBukuKembali){
                for (int i = 0; i < jmlBukuKembali; i++) {
                    System.out.println("Kode buku ke - " + (i+1) + " = ");
                    kodeBukuKembali = br.readLine();
                    for (int j = 0; j < jmlBukuKembali; j++) {
                        if (dataBuku[j][0].equalsIgnoreCase(kodeBukuKembali)){
                            outputNamaBuku = dataBuku[j][1];
                            break;
                        }
                    }
                    if (outputNamaBuku != null){
                        System.out.println("Nama Buku = " + outputNamaBuku);
                        System.out.println("Tanggal kembali buku " + outputNamaBuku + " = ");
                        tanggalKembaliBuku = Integer.parseInt(br.readLine().substring(0,2));

                        jmlHariTelat = tanggalKembaliBuku - tglBukuKembali;
                        if (jmlHariTelat > 0){
                            denda = jmlHariTelat * 500;
                            System.out.println("Terimakasih telah mengembalikan buku ini");
                            System.out.println("Anda terlambat mengembalikan selama " + jmlHariTelat + " hari, anda dikenakan denda sebesar Rp. " + denda);

                        }else{
                            System.out.println("Terimakasih telah mengembalikan buku tepat waktu");
                        }
                    }else {
                        System.out.println("Kode Buku Tidak Valid");
                        i--;
                    }
                }
            }else {
                System.out.println("Jumlah Buku Tidak VALID !");
            }
        }else {
            System.out.println("Data Peminjam Tidak Ditemukan !");
        }

    }
}
