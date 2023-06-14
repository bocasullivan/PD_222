package Praktikum2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Praktikum2 {
    public static void main(String[] args) throws IOException {

//        Bus max 50
//        Minibus max 15
//        Mobil max 7

        int penumpang;
        int bus,sisaBus;
        int miniBus,sisaMBus;
        int mobil,sisaMobil;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan jumlah penumpang");
        penumpang = Integer.parseInt(br.readLine());

        bus = penumpang/50;
        sisaBus = penumpang%50;

        miniBus = sisaBus/15;
        sisaMBus = sisaBus%15;

        mobil = sisaMBus/7;
        sisaMobil = sisaMBus%7;

        if (sisaMobil >0) {
            mobil = mobil + 1;
        }
        System.out.println("Membutuhkan Bus sejumlah "+bus+"\nMembutuhkan Minibus sejumlah "+miniBus+"\nMembutuhkan Mobil sejumlah "+mobil);

    }
}
