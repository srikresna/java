import java.util.Scanner;

public class array3 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[];
        array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Array of elements %d is valued %d\n", i, array[i]);
        } 
        
    }
}
