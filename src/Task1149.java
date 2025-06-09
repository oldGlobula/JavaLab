import java.util.Scanner;

public class Task1149 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(Sn(n));
    }

    private static StringBuilder An(int n) {
        StringBuilder sb = new StringBuilder();

        sb.append("sin(1");
        for (int i = 2; i <= n; i++) {
            sb.append(i % 2 == 0 ? "-" : "+");
            sb.append(String.format("sin(%d", i));
        }
        sb.append(repeatString(")", n));

        return sb;
    }

    private static String Sn(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(repeatString("(", n-1));
        for (int i = 0; i < n; i++) {
            sb.append(An(i + 1));
            sb.append("+");
            sb.append(n - i);
            if (i < n-1) sb.append(")");
        }
        return sb.toString();
    }

    private static StringBuilder repeatString(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb;
    }
}
