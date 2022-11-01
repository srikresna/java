public class bubbleSort {
    public static void main(String[] args) {
        
        int array[] = {6, 4, 1, 9, 7, 3, 2, 8};
        int length = array.length;
        int temp;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length - 1; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Result after sorting");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
