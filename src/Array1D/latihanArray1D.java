package Array1D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihanArray1D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        Deklarasi array
        String[] namaMK  = new String[3];
        int [] sks = new int [3];
        int[] bobot = new int [3];

        for (int i = 0; i < namaMK.length; i++) {
            System.out.println("Nama MK : ");
            namaMK[i] = br.readLine();
            System.out.println("SKS : ");
            sks[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < namaMK.length; i++) {
            System.out.println("Nama MK adalah : " + namaMK[i]);

        }
    }
}
