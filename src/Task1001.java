import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        while (input.hasNext()) {
            long n = input.nextLong();
            list.add(Math.sqrt(n));
        }
        int len = list.size();
        for (int i = 0; i < len; i++) {
            System.out.printf("%.5f%n", list.get(len-1-i));
        }

    }
}
