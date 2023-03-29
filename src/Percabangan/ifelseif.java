package Percabangan;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ifelseif {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nim, status=null;
        int nilaiUAS;

        System.out.print("NIM anda: ");
        nim = br.readLine();
        System.out.print("Nilai UAS anda: ");
        nilaiUAS = Integer.parseInt(br.readLine());
        if (nim.equalsIgnoreCase("12410100173") && nilaiUAS >= 80) {
            status = "Lulus";
        } else if (nim.equalsIgnoreCase("12410100173") && nilaiUAS >= 70) {
            status = "Lulus";
        } else if (nim.equalsIgnoreCase("12410100173") && nilaiUAS < 65) {
            status = "Perbaikan";
        } else {
            System.out.println("Data tidak ditemukan");
        }

        System.out.println(status);
    }
}
