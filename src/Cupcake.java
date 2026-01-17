import java.util.Arrays;
import java.util.Scanner;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] calories = new int[n];
        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextInt();
        }

        Arrays.sort(calories); // Sort in ascending order
        long miles = 0;
        for (int i = 0; i < n; i++) {
            miles += calories[n - 1 - i] * (1L << i); // Eat highest calorie first
        }

        System.out.println(miles);
    }
}
