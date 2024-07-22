public class PrintColor {
    public static void main(String[] args) {
        printColor(-1);
        printColor(50);
        printColor(122);
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}