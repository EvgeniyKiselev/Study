import javax.management.ObjectName;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TextToCollections {

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader read = new BufferedReader(new FileReader("textToWrite.txt"));
        String line;
        while ((line = read.readLine()) != null) {
            list.addAll(Arrays.asList(line.split(" ")));
            }
        read.close();

        System.out.println("Исходный массив:\n" + list);
        Collections.sort(list);
        System.out.println("Массив, отсортированный по алфавиту:\n" + list + "\nПовторяющиеся слова: ");

        int maxCount = 0;
        String maxKey = null;
        Map<String, Integer> map = countWords(list);
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
            if (pair.getValue() > maxCount) {
                maxCount = pair.getValue();
                maxKey = pair.getKey();
            }
        }

        System.out.println("Слово с максимальным количеством повторений:\n\"" + maxKey + "\" " + maxCount);
    }

    private static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        for (String s : list) {
            result.put(s, Collections.frequency(list, s));
        }
        return result;
    }
}
