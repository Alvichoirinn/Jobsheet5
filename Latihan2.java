import java.util.Scanner;
/**
 * Latihan2
 */
public class Latihan2 {

    public static void main(String[] args) {
    
        Scanner input03 = new Scanner(System.in);
        String username = "Alvi cn";
        String password = "1234567";

        System.out.print("Masukkan username: ");
        username = input03.nextLine();
        System.out.print("Masukkan password: ");
        password = input03.next();

        if (username.equals(username) && password.equals(password) ){
            System.out.println("Username dan password benar");
        }else {
            System.out.println("Username dan pasword salah");

        }
    }
}
