public class searchingArray{
    public static void main(String[] args) {
        
        int array[] = {6, 4, 1, 9, 7, 3, 2, 8};
        int key = 3;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                result = i;
                break;
            }
        }
        System.out.println("Key " + key + " is in index " + result);
    }
}