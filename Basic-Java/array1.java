public class array1{
    public static void main(String[] args) {
        
        int array[];
        array = new int[10];
        System.out.printf("%s%5s\n", "Index ", "value");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%2d%5d\n", i, array[i]);
            
        }

    }
}