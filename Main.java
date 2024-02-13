import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        System.out.println(intervalSum(10, 20));
        positiveOrNegative(0);
        System.out.println(positiveFalseNegativeTrue(0));
        DisplayWOW("WOW!", 5);
        System.out.println(isLeapYear(1984));
        arrayReplacement();
        arrayEmpty();
        arrayMultiply();
        arrayDiagonal();
        arrayArguments(10, 5);
    }

    public static boolean intervalSum(int a, int b) {
        int sum = a + b;
        return sum > 10 && sum < 20;
    }

    public static void positiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число " + x + " положительное");
        } else
            System.out.println("Число " + x + " отрицательное");
    }

    public static boolean positiveFalseNegativeTrue(int c) {
        return c < 0;
    }

    public static void DisplayWOW(String d, int e) {
        for (int i = 0; i < e; i++)
            System.out.println(d);
    }

    public static boolean isLeapYear(int god) {
        if (god % 400 == 0) {
            return true;
        } else return god % 4 == 0 && god % 100 != 0;
    }

    public static void arrayReplacement() {
        int[] array1 = {1, 0, 0, 1, 1, 0, 1};
        int[] newArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0) {
                newArray[i] = 1;
            } else {
                newArray[i] = 0;
            }
        }
        System.out.print(Arrays.toString(newArray));
        System.out.println();
    }

    public static void arrayEmpty() {
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }
        System.out.print(Arrays.toString(array2));
        System.out.println();
    }

    public static void arrayMultiply() {
        int[] array = {1, 5, 3, 2, 11, 4, 2, 5, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void arrayDiagonal() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                if (i == j)
                    array[i][j] = 1;

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                if (i + j == array.length - 1)
                    array[i][j] = 1;
        }
        for (int[] ints : array) {
            for (int anInt : ints) System.out.print(anInt + " ");
            System.out.println();
        }
    }

    public static int [] arrayArguments(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
}