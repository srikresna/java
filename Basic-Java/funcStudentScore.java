import java.util.Scanner;

public class funcStudentScore {

    static void display(String[] name, int[] score) {
        System.out.println();
        for (int i = 0; i < name.length; i++) {
            System.out.printf("%-10s", name[i]);
        }
        System.out.println();
        for (int i = 0; i < score.length; i++) {
            System.out.printf("%-10s", score[i]);
        }
    }

    static void avr(int[] score) {
        double average = 0;
        for (int i = 0; i < score.length; i++) {
            average += score[i];
        }
        System.out.println("\n\nThe average of all student is: " + (average / score.length));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of student: ");
        int studentCount = input.nextInt();

        String[] studentName = new String[studentCount];
        for (int i = 0; i < studentCount; i++) {
            System.out.printf("Enter the name of student %d: ", i + 1);
            studentName[i] = input.next();
        }

        int[] grades = new int[studentCount];
        for (int i = 0; i < studentCount; i++) {
            System.out.printf("Enter the score of student %d: ", i + 1);
            grades[i] = input.nextInt();
        }

        // call display
        display(studentName, grades);
        // call average
        avr(grades);
    }
}
