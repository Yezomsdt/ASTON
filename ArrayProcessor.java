package org.example;

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class ArrayProcessor {

    public static void processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4 на 4");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException f) {
                    throw new MyArrayDataException("Некорректный формат данных в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
                System.out.println(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"2", "4", "6", "8"},
                {"3", "6", "9", "12"},
                {"4", "8", "12", "16"}
        };

        String[][] invalidArray = {
                {"один", "2", "3", "4"},
                {"2", "4", "6", "8"},
                {"3", "6", "9", "12"},
                {"4", "8", "12", "16"}
        };

        try {
            processArray(validArray);
            processArray(invalidArray);
        } catch (MyArraySizeException | MyArrayDataException f) {
            System.err.println(f.getMessage());
        }
    }
}