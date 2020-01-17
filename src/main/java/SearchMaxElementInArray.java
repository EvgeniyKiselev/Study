import java.util.Scanner;

public class SearchMaxElementInArray {

    public static void main(String[] args) {
        System.out.println("Результат операции: " + getMaxElement(getArray()));
    }

    public static int getArrayLength() {
        Scanner scanInputArrayLength = new Scanner(System.in);
        System.out.println("Задайте размер массива: ");
        int arrayLength = scanInputArrayLength.nextInt();
        //scanInputArrayLength.close();
        return arrayLength;
    }

    private static String[] getArray() {
        Scanner scanInputElements = new Scanner(System.in);
        int arrayLength = getArrayLength();
        String[] newArray = new String[arrayLength];
        System.out.println("Введите слова для заполнения массива: ");
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = scanInputElements.nextLine();
        }
        return newArray;
    }

    private static String getMaxElement(String[] newArray) {
        String maxArrayElement = "";
        int i = 0;
        while (i == newArray.length) {
            for (i = 0; i < newArray.length; i++) {
                if (newArray[i].length() < newArray[i + 1].length()) {
                    maxArrayElement = newArray[i];
                }
                maxArrayElement = newArray[i];
            }
        }
        return maxArrayElement;
    }

}
