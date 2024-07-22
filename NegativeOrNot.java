public class NegativeOrNot {

    public static boolean negOrNot(int number) {
        return number < 0;
    }

    public static void main(String[] args) {
        System.out.println(negOrNot(4));
        System.out.println(negOrNot(-2));
        System.out.println(negOrNot(0));
    }
}
