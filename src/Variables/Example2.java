package Variables;

public class Example2 {
    public static void main(String[] args) {
        //implementasi variabel

        String nama = "Pradita";
        float dana1 = 10000, dana2 = 5000;
        float hasilDana;

        hasilDana = dana1 + dana2;

        int a1=4, a2=2;
        int hasilA = a1%a2; //modulus

        System.out.println(hasilDana + "\n " + hasilA);

        //relational operator
        int b=1, c=2;
        boolean d = b < c;
        System.out.println(d);

        //logical operator
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = b1 | b2;
        boolean b4 = b1 & b2;
        System.out.println(b3);
        System.out.println(b4);
    }
}
