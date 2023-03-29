package Percabangan;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class nestedif {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String menu = "";
        String jenis = "";
        System.out.print("Pilih menu (Makanan/Minuman) : ");
        menu = br.readLine();
        System.out.print("Pilih jenis menu : ");
        jenis = br.readLine();
        if (menu.equalsIgnoreCase("makanan")){
            if (jenis.equalsIgnoreCase("snack")){
                System.out.println("Harga : Rp. 2000" );
            } else if (jenis.equalsIgnoreCase("nasi bungkus")){
                System.out.println("Harga :  Rp. 5000");
            }
        } else if (menu.equalsIgnoreCase("minuman")){
            if (jenis.equalsIgnoreCase("kopi")){
                System.out.println("Harga : Rp. 3000" );
            } else if (jenis.equalsIgnoreCase("teh")){
                System.out.println("Harga :  Rp. 2000");
            }

        }
    }
}
