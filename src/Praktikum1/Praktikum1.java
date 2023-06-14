package Praktikum1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Praktikum1 {
    public static void main(String[] args) throws IOException
    {
        int nominal;
        int P50;
        int P20;
        int P10;
        int P5;
        int P1;
        int P500;
        int P200;
        int P100;

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("Masukkan Jumlah Nominal = ");
        nominal = Integer.parseInt(br.readLine());

        P50 = nominal/50000;
        P20  = (nominal%50000)/20000;
        P10  = (nominal%20000)/10000;
        P5   = (nominal%10000)/5000;
        P1   = (nominal%5000)/1000;
        P500 = (nominal%1000)/500;
        P200 = (nominal%500)/200;
        P100 = (nominal%200)/100;

        System.out.println("Pecahan 50.000 = "+P50);
        System.out.println("Pecahan 20.000 = "+P20);
        System.out.println("Pecahan 10.000 = "+P10);
        System.out.println("Pecahan 5.000 = "+P5);
        System.out.println("Pecahan 1.000 = "+P1);
        System.out.println("Pecahan 500 = "+P500);
        System.out.println("Pecahan 200 = "+P200);
        System.out.println("Pecahan 100 = "+P100);



    }
}

