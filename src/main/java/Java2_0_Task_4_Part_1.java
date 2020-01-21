import java.util.Arrays;

public class Java2_0_Task_4_Part_1 {

    public static void main(String[] args) {
        int[] intArray = new int[20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = ((int) (Math.random() * 40) - 20);
        }

        System.out.println(Arrays.toString(intArray));
        System.out.println("Минимальный положительный элемент массива: " + getMinP(intArray));
        System.out.println("Максимальный отрицательный элемент массива: " + getMaxO(intArray));
        int temp = intArray[getIndexMinP(intArray)];
        intArray[getIndexMinP(intArray)] = intArray[getIndexMaxO(intArray)];
        intArray[getIndexMaxO(intArray)] = temp;
        System.out.println(Arrays.toString(intArray));
    }

    private static int getMinP(int[] intArray) {
        int check = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > 0) {
                if (check < 0) {
                    check = intArray[i];
                } else if (intArray[i] < check) {
                    check = intArray[i];
                }
            }
        }
        return check;
    }

    private static int getIndexMinP(int[] intArray) {
        int check = -1;
        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > 0) {
                if (check < 0) {
                    check = intArray[i];
                    index = i;
                } else if (intArray[i] < check) {
                    check = intArray[i];
                    index = i;
                }
            }
        }
        return index;
    }

    private static int getMaxO(int[] intArray) {
        int check = 1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < 0) {
                if (check > 0) {
                    check = intArray[i];
                } else if (intArray[i] > check) {
                    check = intArray[i];
                }
            }
        }
        return check;
    }

    private static int getIndexMaxO(int[] intArray) {
        int check = 1;
        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < 0) {
                if (check > 0) {
                    check = intArray[i];
                    index = i;
                } else if (intArray[i] > check) {
                    check = intArray[i];
                    index = i;
                }
            }
        }
        return index;
    }
}
