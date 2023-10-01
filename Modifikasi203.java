import java.util.Scanner;
/**
 * PemilihanPercobaan203
 */
public class Modifikasi203 {

    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);

        System.out.print("Nilai uas : ");
        float uas = input03.nextFloat();
        System.out.print("Nilai uts : ");
        float uts = input03.nextFloat();
        System.out.print("Nilai kuis : ");
        float kuis = input03.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input03.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.println("Nilai akhir = " + total + " sehingga " + message );

        if (total > 80 && total <= 100) {
            System.out.println("nilai A dengan kualifikasi sangat baik");
        }else if (total > 73 && total <= 80) {
            System.out.println("nilai B+ dengan kualifikasi lebih dari baik");
        }else if (total > 65 && total <= 73) {
            System.out.println("nilai B dengan kualifikasi baik");
        }else if (total > 60 && total <= 65) {
            System.out.println("nilai C+ dengan kualifikasi lebih dari cukup");
        }else if (total > 50 && total <= 60) {
            System.out.println("nilai C dengan kualifikasi cukup");
        }else if (total > 39 && total <= 50) {
            System.out.println("nilai D dengan kualifikasi kurang");
        }else {
            System.out.println("nilai E dengan kualifikasi gagal");

        }
    }
}