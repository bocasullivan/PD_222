package Praktikum7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Praktikum7 {
    public static void main(String[] args) throws IOException {
        angkaPangkat();

    }
    public static void angkaPangkat () throws IOException{
        //        DEKLARASI
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> st = new Stack<>();
        Stack<String> stP = new Stack<>();
        double pangkat;
//        INPUT JUMLAH DATA
        System.out.println("Masukkan jumlah data = ");
        int jumlah = Integer.parseInt(br.readLine());
//        PERULANGAN UNTUK MEMASUKKAN STACK
        for (int i = 0; i < jumlah; i++) {
//            Input Angka kedalam stack
            System.out.println("Masukkan Angka = ");
            int angka = Integer.parseInt(br.readLine());
            st.push(String.valueOf(angka));
//          Memberi pangkat dari setiap elemen stack
            pangkat = Math.pow(angka, 2);
            stP.push(String.valueOf(pangkat));
        }
//        Output Data sebelum dan sesudah dipangkat
        System.out.println("Isi Stack sebelum pangkat adalah = " + st);
        System.out.println("Isi Stack setelah pangkat adalah = " + stP);
    }

}