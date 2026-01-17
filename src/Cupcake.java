import java.util.Scanner;

public class Cupcakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] calories = new int[n];
        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextInt();
        }

        // Sort in descending order manually
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (calories[j] < calories[j + 1]) {
                    int temp = calories[j];
                    calories[j] = calories[j + 1];
                    calories[j + 1] = temp;
                }
            }
        }

        long miles = 0;
        for (int i = 0; i < n; i++) {
            miles += calories[i] * (1L << i);
        }

        System.out.println(miles);
    }
}
