public class NumberComparator {
    public static void main(String[] args) {
        compareNumbers(10, 5);
        compareNumbers(500, 100000);
        compareNumbers(2, 2);
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}