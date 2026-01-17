import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] calories = new Integer[n];
        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextInt();
        }

        Arrays.sort(calories, Collections.reverseOrder()); // Sort descending

        long miles = 0;
        for (int i = 0; i < n; i++) {
            miles += calories[i] * (1L << i); // 2^i multiplier
        }

        System.out.println(miles);
    }
}
