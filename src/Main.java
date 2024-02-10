public class Main {
    public static void main (String [] arg) {
        printThreeWords();
        checkSumSign(2,-3);
        printColor(0);
        compareNumbers(-5,4);
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(int a, int b) {
        int sum = a+b;
        if (sum >=0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }
    public static void  printColor(int value) {
        if (value <=0) {
            System.out.println("Красный");
        }  else if  (0<value && value<=100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(int a, int b) {
        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}