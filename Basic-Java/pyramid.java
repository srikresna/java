public class pyramid {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int a = 0; a < 5; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int a = 0; a < 5; a++) {
                System.out.print("*");
                if (a == i)
                    break;
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int a = 0; a < 5; a++) {
                System.out.print("*");
                if (a + i == 4)
                    break;
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int a = 0; a < 5; a++) {
                if (a + i < 4) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int a = 0; a < 5; a++) {
                if (i > a) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            for (int a = 0; a < 10; a++) {
                System.out.print("*");
                if (a == i) {
                    break;
                } else if (a + i == 9) {
                    break;
                }
            }
            System.out.println();
        }

    }
}