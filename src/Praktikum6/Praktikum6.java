package Praktikum6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Praktikum6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int pilih;

        System.out.println("Pilih proses perhitungan aritmatika yang anda inginkan :");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");

        System.out.println("Pilihan anda = ");
        pilih = Integer.parseInt(br.readLine());

        switch (pilih){
            case 1:
                System.out.println("==== ==== PENJUMLAHAN ==== ====");
                System.out.println();
                System.out.println("Masukkan bilangan ke 1 = ");
                int bil1 = Integer.parseInt(br.readLine());
                System.out.println("Masukkan bilangan ke 2 = ");
                int bil2 = Integer.parseInt(br.readLine());

                penjumlahan(bil1, bil2);

                System.out.println("Hasilnya adalah = " + penjumlahan(bil1,bil2));
                break;
            case 2:
                System.out.println("==== ==== PENGURANGAN ==== ====");
                System.out.println();
                System.out.println("Masukkan bilangan ke 1 = ");
                int bil1K = Integer.parseInt(br.readLine());
                System.out.println("Masukkan bilangan ke 2 = ");
                int bil2K = Integer.parseInt(br.readLine());

                pengurangan(bil1K, bil2K);

                System.out.println("Hasilnya adalah = " + pengurangan(bil1K,bil2K));
                break;
            case 3:
                System.out.println("==== ==== PERKALIAN ==== ====");
                System.out.println();
                System.out.println("Masukkan bilangan ke 1 = ");
                int bil1X = Integer.parseInt(br.readLine());
                System.out.println("Masukkan bilangan ke 2 = ");
                int bil2X = Integer.parseInt(br.readLine());

                perkalian(bil1X, bil2X);

                System.out.println("Hasilnya adalah = " + perkalian(bil1X,bil2X));
                break;
        }
    }
    public static int penjumlahan (int bil1, int bil2){
        return bil1 + bil2;
    }
    public static int pengurangan (int bil1K, int bil2K){
        return bil1K - bil2K;
    }
    public static int perkalian (int bil1X, int bil2X){
        return bil1X * bil2X;
    }

}
