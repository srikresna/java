import java.util.Scanner;

import javax.security.auth.SubjectDomainCombiner;

public class sumEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        int sum = 0;

        System.out.println("Program for calculate the even number from N number\n");
        System.out.print("Input range number = ");
        n = sc.nextInt();
        System.out.println("Total even number from 1 to " + n + " is " + n / 2);

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                continue;
            count++;
            System.out.printf("The %d even number is %d\n", count, i);

            sum += i;
        }
        System.out.println("Sum of even number from 1 to " + n + " is " + sum);
        System.out.println("Avarage of even number from 1 to " + n + " is " + sum / count);
    }
}
