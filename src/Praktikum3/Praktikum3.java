package Praktikum3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Praktikum3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int jumlah;
        int[] indeks = new int[3];
        int jmlHasilNama = 0;

        System.out.println("Masukkan Jumlah Data = ");
        jumlah = Integer.parseInt(br.readLine());

        String[] nama = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Nama Orang ke - " + (i+1) + " = ");
            nama[i] = br.readLine();
        }

        // menggunakan objek Random
        Random random = new Random();


        // Mengeluarkan tiga nama secara acak
        System.out.println("Nama secara acak:");
        while (jmlHasilNama < 3) {
            int randomIndex = random.nextInt(jumlah);

            boolean isDuplicate = false;
            for (int i = 0; i < jmlHasilNama; i++) {
                if (indeks[i] == randomIndex) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                indeks[jmlHasilNama] = randomIndex;
                System.out.println(nama[randomIndex]);
                jmlHasilNama++;
            }
        }
    }
}
