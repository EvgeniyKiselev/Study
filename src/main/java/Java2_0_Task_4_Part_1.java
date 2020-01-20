import java.util.Arrays;

public class Java2_0_Task_4_Part_1 {

    public static void main(String[] args) {
        int[] intArray = new int[20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = ((int) (Math.random() * 40) - 20);
        }

        String intArrayString = Arrays.toString(intArray);
        System.out.println(intArrayString);
        System.out.println("Максимальный элемент массива: " + getMaxElement(intArray));
        System.out.println("Минимальный элемент массива: " + getMinElement(intArray));
    }

    private static int getMaxElement(int[] intArray) {
        int max = intArray[0];
        int i;
        for (i = 1; i < intArray.length; i++) {
            max = Math.max(max, intArray[i]);
        }
        return max;
    }

    private static int getMinElement(int[] intArray) {
        int min = intArray[0];
        int i;
        for (i = 1; i < intArray.length; i++) {
            min = Math.min(min, intArray[i]);
        }
        return min;
    }

}
