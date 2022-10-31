import java.util.Scanner;

public class restomenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;

        System.out.println("Menu Restaurant LowPrice");
        System.out.println("1. Chicken Smackdown\t-\tIDR 100.000");
        System.out.println("2. Fried Chicken\t-\tIDR 80.000");
        System.out.println("3. Fried Duck\t\t-\tIDR 150.000");
        System.out.print("Masukkan pilihan anda (1 - 3) ");
        menu = sc.nextInt();

        double price = 0;
        double tax = 0.1;
        if (menu == 1) {
            price = 100000 + (100000 * tax);
        } else if (menu == 2) {
            price = 80000 + (80000 * tax);
        } else if (menu == 3) {
            price = 150000 + (150000 * tax);
        } else {
            System.out.print("Menu not recognized, input again");
        }

        System.out.print("\nPrice must be paid is " + price);

    }
}