public class NumberSignChecker {

    public static void main(String[] args) {
        checkNumberType(1);
        checkNumberType(-1);
        checkNumberType(0);
    }

    public static void checkNumberType(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
}