package Tugas4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas4 {
    public static void main(String[] args) throws IOException {
        //        TUGAS : BIKIN SEGITIGA TERBALIK
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;

        System.out.println("Masukkan baris : ");
        n = Integer.parseInt(br.readLine());

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
