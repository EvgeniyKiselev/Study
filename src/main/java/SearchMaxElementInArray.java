import java.util.Scanner;

/**
 * Поиск максимального элемента в массиве. Для начала задать массив слов.Размерность массива произвольна, задается в консоли.
 * После чего в консоли вводятся слова в количестве равном заданной длине массива.
 * В полученном массиве необходимо найти самое длинное слово.
 * Результат вывести на консоль
 */

public class SearchMaxElementInArray {

    public static void main() {
        System.out.println("Максимальный элемент в массиве: " + getMaxElement(getArray()));
    }

    public static int getArrayLength() {
        Scanner scanInputArrayLength = new Scanner(System.in);
        System.out.println("Задайте размер массива: ");
        return scanInputArrayLength.nextInt();
    }

    private static String[] getArray() {
        Scanner scanInputElements = new Scanner(System.in);
        int arrayLength = getArrayLength();
        String[] newArray = new String[arrayLength];
        System.out.println("Введите слова для заполнения массива: ");
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = scanInputElements.nextLine();
        }
        return newArray;
    }

    private static String getMaxElement(String[] newArray) {
        String maxArrayElement = newArray[0];
        for (String s : newArray) {
            if (maxArrayElement.length() < s.length()) {
                maxArrayElement = s;
            }
        }
        return maxArrayElement;
    }

}
