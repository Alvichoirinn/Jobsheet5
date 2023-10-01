import java.util.Scanner;
/**
 * Latihan5
 */
public class Latihan5 {

    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        
        System.out.println("Masukkan jarak: ");
        int jarak = input03.nextInt();

        if (jarak <= 5){
            System.out.println("digunakan untuk pertarungan jarak dekat");
        } else {
            System.out.println("digunakan untuk pertarungan jarak jauh");

        }
    }
}