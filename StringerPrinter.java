public class StringerPrinter {

    public static void printStringNTimes(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        printStringNTimes("Привет", 4);
        printStringNTimes("Проверятель ДЗ из ASTON", 2);
        printStringNTimes("Надеюсь, ты не читаешь это", 0);
    }
}