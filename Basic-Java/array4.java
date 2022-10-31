public class array4 {
    public static void main(String[] args) {
        
        int[] oldArray = {1, 3, 6, 7, 9};
        int[] newArray = new int[5];

        for (int i = 0; i < oldArray.length / 2; i++) {
            newArray[i] = oldArray[i + 2];
            System.out.print(newArray[i] + " ");
        }
    }
}