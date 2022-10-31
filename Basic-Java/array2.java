public class array2{

    public static void main(String[] args) {
        
        int array[] = {33, 4, 5, 23, 1, 5, 6};

        System.out.printf("%s\t%s\n", "Index", "value");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t%d\n", i, array[i]);
        }
    }
}