import java.util.*;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of cupcakes
        int n = sc.nextInt();
        
        // Read calorie counts
        long[] calories = new long[n];
        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextLong();
        }
        
        // Sort in descending order
        Arrays.sort(calories);
        
        // Reverse to get descending order
        for (int i = 0; i < n / 2; i++) {
            long temp = calories[i];
            calories[i] = calories[n - 1 - i];
            calories[n - 1 - i] = temp;
        }
        
        // Calculate minimum miles
        long miles = 0;
        for (int i = 0; i < n; i++) {
            miles += calories[i] * (1L << i); // 2^i
        }
        
        System.out.println(miles);
        sc.close();
    }
}