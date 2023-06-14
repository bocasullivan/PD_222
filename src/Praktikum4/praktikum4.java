package Praktikum4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class praktikum4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int batas;

        System.out.println("Masukkan batas karakter : ");
        batas = Integer.parseInt(br.readLine());

        for (int i = 1; i <= batas; i++) {
            if (i % 2 == 0){
                System.out.print(" * ");
            }else {
                System.out.print(" # ");
            }
        }

    }
}
