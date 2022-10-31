import java.util.Scanner;

import javax.security.auth.SubjectDomainCombiner;

public class sumOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n;
        int count = 0;
        int sum = 0;

        System.out.println("Program for calculate the odd number from N number\n");
        System.out.print("Input range number = ");
        n = sc.nextFloat();


        System.out.println("Total odd number from 1 to " + n + " is " + (float)(Math.round(n/2)));

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 1)
                continue;
            count++;
            System.out.printf("The %d odd number is %d\n", count, i);

            sum += i;
        }
        System.out.println("Sum of odd number from 1 to " + n + " is " + sum);
        System.out.println("Avarage of odd number from 1 to " + n + " is " + sum / count);
    }
}
