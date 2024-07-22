public class InvertArray {

    public static void main(String[] args) {
        int[] binaryArray = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.print("Исходный массив: ");
        printArray(binaryArray);
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 0) {
                binaryArray[i] = 1;
            } else {
                binaryArray[i] = 0;
            }
        }
        System.out.print("Инвертированный массив: ");
        printArray(binaryArray);
    }
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}