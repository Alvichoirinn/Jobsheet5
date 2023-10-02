import java.util.Scanner;
/**
 * Latihan5
 */
public class Latihan1 {

    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);

        System.out.print("Masukkan jarak: ");
        int jarak = input03.nextInt();
        System.out.print("Masukkan weapon: ");
        String weapon = input03.nextLine();

        if (jarak<=5){
            System.out.println(" Jarak dekat " + " Melle weapon ");
        }else {
            System.out.println(" Jarak jauh " + " Range weapon ");
        
        String hasil = (jarak<=5) ? " Jarak dekat " + " Melle weapon " : " Jarak jauh " + " Range weapon ";

        }
    }
}