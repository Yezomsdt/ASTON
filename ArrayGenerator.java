public class ArrayGenerator {
    public static int[] generateArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] myArray = generateArray(10, 100);
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }
}