import java.util.Scanner;

public class SearchMaxElementInArray {

    public static void main(String[] args) {
        System.out.println("Максимальный элемент в массиве: " + getMaxElement(getArray()));
    }

    public static int getArrayLength() {
        Scanner scanInputArrayLength = new Scanner(System.in);
        System.out.println("Задайте размер массива: ");
        int arrayLength = scanInputArrayLength.nextInt();
        return arrayLength;
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
