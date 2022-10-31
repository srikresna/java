import java.util.Scanner;

public class memberprice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalPurchase;
        System.out.print("Input your shopping total : ");
        totalPurchase = sc.nextDouble();

        double discount;
        String member, percent;
        if (totalPurchase > 200000 && totalPurchase < 500000) {
            discount = 0.02;
            member = "Silver";
            percent = "2%";
        } else if (totalPurchase > 500000 && totalPurchase < 1000000) {
            discount = 0.05;
            member = "Gold";
            percent = "5%";
        } else {
            discount = 0.1;
            member = "Platinum";
            percent = "10%";
        }

        System.out.printf("You get a %s member discount as much %s \n", member, percent);
        System.out.printf("Your shopping total is : %s\n", (int) totalPurchase);
        System.out.printf("Your member discount is : %s\n", totalPurchase * discount);
        System.out.printf("Your total purchase is : %s", totalPurchase - (totalPurchase * discount));

    }

}
