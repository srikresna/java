import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count;
        int total = 0;

        System.out.print("Input how much looping = ");
        count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            total += 1;
            System.out.printf("%d + 1 = %d \n", i, total );
        }
    }
}