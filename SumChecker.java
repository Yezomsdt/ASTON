
public class SumChecker {
    public static void main(String[] args) {
        checkSumSign(-5, 10);
        checkSumSign(10, 5);
        checkSumSign(5, -25);
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}