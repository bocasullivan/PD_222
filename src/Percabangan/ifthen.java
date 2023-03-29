package Percabangan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ifthen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Pemeriksaan Kesesuaian Usia utk Pembuatan E-KTP");
        System.out.print("Usia anda: ");
        int usia = Integer.parseInt(br.readLine());
        if (usia >= 17){
            System.out.println("Usia anda memenuhi syarat");
        }

        System.out.println("Belum memenuhi syarat");
    }
}
