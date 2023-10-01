import java.util.Scanner;
/**
 * PemilihanPercobaan103
 */
public class PemilihanPercobaan103 {

    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        
        System.out.println("Masukan anngka: ");
        int angka = input03.nextInt();
        
        if (angka % 2 == 0)
            System.out.println("Angka " +angka+ "bilangan genap");
        else 
        System.out.println("Angka" +angka+ "bilangan ganjil");
        
        String hasil = (angka % 2 == 0) ? "Angka" +angka+ "bilangan genap" : "Angka" +angka+ "bilangan ganjil";
        System.out.println("hasil");
    }
}