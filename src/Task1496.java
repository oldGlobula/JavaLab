import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1496 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        HashMap<String, Integer> occurrences = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String occurence = input.next();
            if (occurrences.containsKey(occurence)) {
                occurrences.put(occurence, occurrences.get(occurence) + 1);
            }  else {
                occurrences.put(occurence, 1);
            }
        }

        for (Map.Entry<String, Integer> occurrence: occurrences.entrySet())
        {
            if (occurrence.getValue() > 1) {
                System.out.println(occurrence.getKey());
            }
        }
    }
}
