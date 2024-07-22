public class SumRangeChecker {
    public static boolean isSumInRange(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    public static void main(String[] args) {
        System.out.println(isSumInRange(1, 11));
        System.out.println(isSumInRange(4, 20));
    }
}