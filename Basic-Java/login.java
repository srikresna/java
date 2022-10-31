import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;

        System.out.print("username : ");
        username = input.nextLine();

        if (username.equals("Mahasiswa") || username.equals("MAHAsiswa")) {
            System.out.print("password : ");
            password = input.nextLine();

            if (password.equals("RaHaSia")) {
                System.out.println("Congrats! Login success");
            } else {
                System.out.println("Password incorrect! Try Again");
            }
        } else {
            System.out.print("Username not found!");
        }

    }
}